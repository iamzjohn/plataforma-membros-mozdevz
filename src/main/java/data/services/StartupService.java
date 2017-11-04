package data.services;


import data.daos.StartupDAO;
import data.daos.StartupMemberDAO;
import data.model.Startup;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Created by Romildo Cumbe
 */
@ApplicationScoped
public class StartupService{
    
    @Inject private StartupDAO startupDAO;
    
    @Inject private StartupMemberDAO startupMemberDAO;
    
    public Startup register(Startup startup) throws Exception{
        
        if(startup.getImageUrl() == null){
            
            startup.setImageUrl("webroot/assets/images/startup.jpg");
            
        }
            
        return startupDAO.create(startup);
    
    }

        public Map fetch(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {
        
            String query = " ";
            String order = "e.id DESC";
            List<Map> mappedFields = new ArrayList();
            int fisrtResult = (pageNumber-1)*itemsPerPage;
            
            //---> Filter configuration starts here
            
            boolean whereUsed = false;
            
            System.out.print(filter);
            
            //============= Filter by Keywords : WHERE USED HERE
            String keywords = filter.get("keywords").toString();
            
            if(!keywords.isEmpty()){
                keywords = keywords.replace(",", " ");
                String[] keywordPieces = keywords.split(" ");
                
                if(keywordPieces.length==0){ 
                    keywordPieces = new String [] {keywords}; 
                }

                for(int i = 0; i<keywordPieces.length; i++){
                    if(!keywordPieces[i].isEmpty()){
                        
                        if(!whereUsed){
                            query += " WHERE ( ";
                            whereUsed = true;
                        }
                        
                        query += " CONCAT(e.name,e.slogan,e.description) LIKE :keyword"+i+" AND ";
                        
                        //adding the query field
                        Map queryField = new HashMap();
                        queryField.put("key", "keyword"+i);
                        queryField.put("value", "%"+keywordPieces[i]+"%");
                        mappedFields.add(queryField);
                    }
                }
                
                if(whereUsed){
                    query = query.substring(0, query.length() - 4);
                    query += " ) ";
                }
                
            }
            
            
            //=============== Filter by existance period
            String creationYear = filter.get("creation_year").toString();
            
                if(!creationYear.isEmpty()){

                    //add AND/WHERE
                    if(whereUsed){query += " AND ";}else{ query += " WHERE "; whereUsed = true; }

                    query += " YEAR(e.created_at) <= :creation_year ";

                    //adding the query field
                    Map queryField = new HashMap();
                    queryField.put("key", "creation_year");
                    queryField.put("value", Integer.valueOf(creationYear));
                    mappedFields.add(queryField);
                }
            
                
            //=============== Filter by existance period
            double minRating = Double.valueOf(filter.get("min_rating").toString());
            
            double maxRating = Double.valueOf(filter.get("max_rating").toString());
            
                if(minRating>0||maxRating<5){

                    //add AND/WHERE
                    if(whereUsed){query += " AND ";}else{ query += " WHERE "; whereUsed = true; }

                    query += " ( e.rating >= :min_rating AND e.rating <= :max_rating ) ";

                    //adding the query field
                    Map queryField = new HashMap();
                    queryField.put("key", "min_rating");
                    queryField.put("value", minRating);
                    mappedFields.add(queryField);
                    
                    queryField = new HashMap();
                    queryField.put("key", "max_rating");
                    queryField.put("value", maxRating);
                    mappedFields.add(queryField);
                    
                }    
          
            
           //---> Filter configuration ends here
           System.out.print(query);
           System.out.print(mappedFields);
           
           Map resp = startupDAO.fetchForHiList(itemsPerPage, fisrtResult, mappedFields, query, order);
           resp.put("totalPages", (int) Math.ceil(Integer.valueOf(resp.get("count").toString()) / ((Integer)itemsPerPage).doubleValue()));
           
           return resp;
    
    }
        
      public Map fetchFromMember(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {
        
            String query = " ";
            String order = "e.id ASC";
            List<Map> mappedFields = new ArrayList();
            int fisrtResult = (pageNumber-1)*itemsPerPage;
            
            String startup_id = filter.get("member_id").toString();
            query += " WHERE e.member.id = :member_id ";

            //adding the query field
            Map queryField = new HashMap();
            queryField.put("key", "member_id");
            queryField.put("value", Double.valueOf(startup_id).longValue());
            mappedFields.add(queryField); 
            
            System.out.print(mappedFields);
            Map resp = startupMemberDAO.fetchForHiList(itemsPerPage, fisrtResult, mappedFields, query, order);
            resp.put("totalPages", (int) Math.ceil(Integer.valueOf(resp.get("count").toString()) / ((Integer)itemsPerPage).doubleValue()));
           
           return resp;
    
    }    

    public Startup getByUsername(String username) throws Exception {
        return startupDAO.findByKey("username", username);
    }
    
    public List<Startup> getAllStartups() throws Exception{
        return startupDAO.getAll();
    }
    
    public List<Integer> getExistanceYears() throws Exception{
       
       List<Integer> existanceYears = new ArrayList();
               
       int oldestDate =  startupDAO.getOldestStartupCreationDate();
       System.out.print("OLDEST DATE : "+oldestDate);
       for(int i=oldestDate;i<=Calendar.getInstance().get(Calendar.YEAR);i++){
           existanceYears.add(0,i);
       } 
                
       return existanceYears;
    
    }
    
}
