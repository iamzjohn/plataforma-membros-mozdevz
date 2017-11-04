/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.Startup;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Romildo Cumbe
 */
@ApplicationScoped
public class StartupDAO extends DAO<Startup> {

    @Override
    public Class<Startup> getEntityClass() {
        return Startup.class;
    }

    public int getOldestStartupCreationDate() throws Exception {
        EntityManager em = DAO.getEntityManagerFactory().createEntityManager();
        Query query = null;
        try {
            query = em.createQuery(" from " + getEntityClass().getName() + " ORDER BY created_at asc");
            Startup s = (Startup) query.setMaxResults(1).getResultList().get(0);
            Calendar cal = Calendar.getInstance();
            cal.setTime(s.getCreated_at());
            int year = cal.get(Calendar.YEAR);
            return year;

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("DAO getOlderstStartupCreationDate failed!");
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

}
