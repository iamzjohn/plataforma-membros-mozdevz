/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.User;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Romildo Cumbe
 */
@ApplicationScoped
public class UserDAO extends DAO<User>{
    
    

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }
    
    public User findUserWithCredentials(String username, String password) throws Exception{
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        User user = null;
        try{
            final StringBuffer queryString = new StringBuffer("select usr from " + getEntityClass().getName() + " usr where usr.username = :username and usr.password = :password");
            Query query = em.createQuery(queryString.toString());
            query.setParameter("username", username);
            query.setParameter("password", password);
            user  = (User) query.getResultList().get(0);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("UserDAO failed to find user by given credentials!");
        }finally {
            if(em!=null)
                em.close();
        }
        return user;
    }
    
}
