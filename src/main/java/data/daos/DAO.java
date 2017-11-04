/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Romildo Cumbe
 * @param <T>
 */

public abstract class DAO<T>{ 
    
    private Class<T> type;
    
    public static String PERSISTENCE_UNIT = "default";
    
    public abstract Class<T> getEntityClass();
    
    public DAO(){
        type = this.getEntityClass();
    }

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory(){

        if(entityManagerFactory==null)
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

        return entityManagerFactory;
    }

    public long count() throws Exception{
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        Query query = null;
        Long totalrows = null;
        try{
        String entity = type.getSimpleName();
        final StringBuffer queryString = new StringBuffer("select count(ent) from " + entity + " ent");
            query = em.createQuery(queryString.toString());
             totalrows = (Long) query.getSingleResult();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO count failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return totalrows;
    }

    public T create(final T t) throws Exception{
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO create failed!");
            
        }finally {
            if(em!=null)
            em.close();
        }
        return t;

    }

    public void delete (final Object id) throws Exception {
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.getReference(type, id));
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO delete failed!");
        }finally {
            if(em!=null)
                em.close();
        }
    }

    public T find (final Object id) throws Exception{
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        T t = null;
        try{
            t =  em.find(type, id);

        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO find failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return t;
    }
    
    public T findByKey(String key,String value) throws Exception {
        return this.findByKeyImp(key, value);
    }
    
    public T findByKey(String key,Long value) throws Exception {
        return this.findByKeyImp(key, value);
    }
    
    public T findByKeyImp(String key,Object value) throws Exception {
        
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        List<T> members = null;
        try{
            
            Query query = em.createQuery("select c from " + getEntityClass().getName()+" c where c."+key+" = :val");
            query.setParameter("val",value);
            members = query.getResultList();
            if(members.size()>0){
                return members.get(0);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO findByKey failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return null;
    }
    
    
    public T update(final T t) throws Exception {
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO update failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return t;
    }

    public List<T> getAll() throws Exception {
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        Query query = null;
        List<T> ts = null;
        try{
             query = em.createQuery("from " + type.getName());
             ts = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO getAll failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return ts;
    }
    
    public List<T> runQueryAndLimit(String filter_query,int skip,int limit) throws Exception {
                EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
                try{
                    Query query = em.createQuery(filter_query).setFirstResult(skip).setMaxResults(limit);
                    return query.getResultList();
                }catch (Exception e){
                    e.printStackTrace();
                    throw new Exception("DAO runQueryAndLimit failed!");
                }finally {
                    if(em!=null)
                        em.close();
                }
                
     } 

    public T last() throws Exception {
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        Query query = null;
        T t = null;
        try{
            query = em.createQuery("from " + type.getName()+" order by id desc");
            t  = (T) query.getResultList().get(0);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO last failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return t;

    }

    public T first() throws Exception { 
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        Query query = null;

        T t = null;
        try{ 
            query = em.createQuery("from " + type.getName()+" order by id asc");
            t  = (T) query.getResultList().get(0);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO first failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return t;
    }
    
    public Collection<String> getDistinctValuesForField(String text) throws Exception{
        Collection<String> results = new ArrayList<>();
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        try{
            Query query = em.createQuery("select DISTINCT(c."+text+") from " + getEntityClass().getName()+" c ");
            results = query.getResultList();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO getDistinctValuesForField failed!");
        }finally {
            if(em!=null)
                em.close();
        }
        return results;
    }
    
    /**
     * Always use e for as variable name
     * @param maxResults
     * @param firstResult
     * @param mappedFields
     * @param query
     * @param ordering
     * @return
     * @throws Exception 
     */
    public Map fetchForHiList(int maxResults, int firstResult, List<Map> mappedFields, String query, String ordering) throws Exception {
        
        Map results = new HashMap();
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        
        try{
            
            TypedQuery<Long> queryCount = em.createQuery("select count(e) from " + getEntityClass().getSimpleName()+" e "+query,Long.class);
            Query querySelect = em.createQuery("select e from " + getEntityClass().getName()+" e "+query+" ORDER BY "+ordering);
            
            for(Map field : mappedFields){
                queryCount.setParameter(field.get("key").toString(),field.get("value"));
                querySelect.setParameter(field.get("key").toString(),field.get("value"));
            }
            
            int totalRows = queryCount.getResultList().get(0).intValue();
            
            results.put("count", totalRows);
            
            results.put("rows", querySelect.setFirstResult(firstResult).setMaxResults(maxResults).getResultList());
           
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("DAO fetchForHiList Failed");
        }finally {
            if(em!=null)
                em.close();
        }
        
        return results;
    
    }
    
}
