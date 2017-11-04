/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.StartupPartner;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@ApplicationScoped
public class StartupPartnerDAO extends DAO<StartupPartner>{

    @Override
    public Class<StartupPartner> getEntityClass() {
            return StartupPartner.class;
    }
    
}
