/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.model.Startup;
import data.services.StartupService;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

/**
 *
 * @author Romildo Cumbe 
 */
@ApplicationScoped
public class Startups extends Controller{
    
    @Inject StartupService startupService;
    
     public void index() throws MvcException {
                
        Map bundle = new HashMap();
        try {
            bundle.put("existanceYears", startupService.getExistanceYears());
            bundle.put("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        } catch (Exception ex) {
            Logger.getLogger(Startups.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.callView(bundle);
    }
     
     public void profile(Map params) throws MvcException, Exception {
        Startup startup = startupService.getByUsername(params.get("id").toString());
        
        Map bundle = new HashMap();
        bundle.put("startup", startup);
        this.callView(bundle);
    }
     
}
