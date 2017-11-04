package data.services;

import data.daos.CityDAO;
import data.daos.MemberDAO;
import data.daos.StartupMemberDAO;
import data.model.City;
import data.model.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


/**
 * Created by Romildo Cumbe
 */
@ApplicationScoped
public class MemberService{
    
    @Inject private MemberDAO memberDAO;
    
    @Inject private StartupMemberDAO startupMemberDAO;
    
    @Inject private CityDAO cityDAO;
    
    
    public Collection<String> getTitles() throws Exception{
        return memberDAO.getDistinctValuesForField("title");
    }
    
    public Collection<String> getOccupations() throws Exception{
        return memberDAO.getDistinctValuesForField("occupation");
    }
    
    public Collection<String> getGenders() throws Exception{
        return memberDAO.getDistinctValuesForField("gender");
    }
    
    public List<City> getCities() throws Exception{
        return cityDAO.getAll();
    }
    
    public List<Member> getAllMembers() throws Exception{
        return memberDAO.getAll();
    }

    public Map fetch(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {
        
            String query = " ";
            String order = "e.id DESC";
            List<Map> mappedFields = new ArrayList();
            int fisrtResult = (pageNumber-1)*itemsPerPage;
            
            //---> Filter configuration starts here
            
            boolean whereUsed = false;
            
            
            
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
                        
                        query += " CONCAT(e.name,e.username,e.email) LIKE :keyword"+i+" AND ";
                        
                        //adding the query field
                        Map queryField = new HashMap();
                        queryField.put("key", "keyword"+i);
                        queryField.put("value", "%"+keywordPieces[i]+"%");
                        mappedFields.add(queryField);
                    }
                }
                
                if(whereUsed){
                    //remove OR
                    query = query.substring(0, query.length() - 4);
                    query += " ) ";
                }
                
            }
            
           
            
            
            //============= Filter by technologies
            String technologiesBruteString = filter.get("technologies").toString();
            
            if(!technologiesBruteString.isEmpty()){
                
                String[] technologies = technologiesBruteString.split(",");
                
                if(technologies.length==0){ 
                    technologies = new String [] {technologiesBruteString}; 
                }
            
                //building the query
                for(int i=0;i<technologies.length;i++){
                    if(!technologies[i].isEmpty()){

                        //add AND/WHERE
                        if(whereUsed){query += " AND ";}else{ query += " WHERE "; whereUsed = true; }

                        query += " e.technologies LIKE :tech"+i;

                        //adding the query field
                        Map queryField = new HashMap();
                        queryField.put("key","tech"+i);
                        queryField.put("value", "%"+technologies[i].trim()+"%");
                        mappedFields.add(queryField);

                    }

                }
            }
            
            
            //=============== Filter by title, gender, occupation
            for(String currentFilterFiled : new String [] {"title","gender","occupation"}){
                
                String value = filter.get(currentFilterFiled).toString();
            
                if(!value.isEmpty()){

                    //add AND/WHERE
                    if(whereUsed){query += " AND ";}else{ query += " WHERE "; whereUsed = true; }

                    query += " e."+currentFilterFiled+" = :"+currentFilterFiled+" ";

                    //adding the query field
                    Map queryField = new HashMap();
                    queryField.put("key", currentFilterFiled);
                    queryField.put("value", value);
                    mappedFields.add(queryField);
                }
            
            }
            
            
            //=============== Filter by city
            String city = filter.get("city").toString();
            
                if(!city.isEmpty()){

                    //add AND/WHERE
                    if(whereUsed){query += " AND ";}else{ query += " WHERE "; whereUsed = true; }

                    query += " e.city.id = :city ";

                    //adding the query field
                    Map queryField = new HashMap();
                    queryField.put("key", "city");
                    queryField.put("value", Long.valueOf(city));
                    mappedFields.add(queryField);
                }
            
            
           //---> Filter configuration ends here
           System.out.print(query);
           System.out.print(mappedFields);
           
           Map resp = memberDAO.fetchForHiList(itemsPerPage, fisrtResult, mappedFields, query, order);
           resp.put("totalPages", (int) Math.ceil(Integer.valueOf(resp.get("count").toString()) / ((Integer)itemsPerPage).doubleValue()));
           
           return resp;
    
    }
    
    
       public Map fetchFromStartup(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {
        
            String query = " ";
            String order = "e.id ASC";
            List<Map> mappedFields = new ArrayList();
            int fisrtResult = (pageNumber-1)*itemsPerPage;
            
            String startup_id = filter.get("startup_id").toString();
            query += " WHERE e.startup.id = :startup_id ";

            //adding the query field
            Map queryField = new HashMap();
            queryField.put("key", "startup_id");
            queryField.put("value", Double.valueOf(startup_id).longValue());
            mappedFields.add(queryField);
            
           
            Map resp = startupMemberDAO.fetchForHiList(itemsPerPage, fisrtResult, mappedFields, query, order);
            resp.put("totalPages", (int) Math.ceil(Integer.valueOf(resp.get("count").toString()) / ((Integer)itemsPerPage).doubleValue()));
           
           return resp;
    
    }

    public Member getByUsername(String username) throws Exception {
        return memberDAO.findByKey("username", username);
    }
    
}
