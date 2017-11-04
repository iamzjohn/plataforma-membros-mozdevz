/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import data.model.User;
import data.services.UserService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romildo Cumbe
 */
@ApplicationScoped
//public class HiEventsListener implements TemplateLoadListener, ControllerCallsListener, FrontierCallsListener {
public class HiEventsListener {

//    @Inject
//    private FrontEnd frontEnd;
//    
//    @Inject UserService userService;
//    
//    @Inject RequestContext requestContext;
//    
//    
//    public void onTemplateLoad() {
//        
//           /* Map tdata = new HashMap();
//            User loggedUser = null;
//            try {
//                loggedUser = userService.getLoggedUser();
//            } catch (Exception ex) {
//                try {
//                    requestContext.getResponse().sendError(403);
//                } catch (IOException ex1) {
//                    Logger.getLogger(HiEventsListener.class.getName()).log(Level.SEVERE, null, ex1);
//                }
//            }
//            
//            if(loggedUser.getType().equalsIgnoreCase("CUSTOMER")){
//                tdata.put("username", loggedUser.getCustomer().getName());
//                tdata.put("userphoto", loggedUser.getCustomer().getImageUrl());
//            }
//            
//            if(loggedUser.getType().equalsIgnoreCase("SUPPLIER")){
//                tdata.put("username", loggedUser.getSupplier().getName());
//                tdata.put("userphoto", loggedUser.getSupplier().getImageUrl());
//            }
//            
//            
//            frontEnd.setTemplateData(tdata); */
//        
//    }
//
//    public void preAction(ControllerRequestInterception args) {
//       
//        try {
//            Thread.sleep(0);
//        } catch (InterruptedException ex) {
//        }
//        
//    }
//
//    public void postAction(ControllerRequestInterception args) {
//            
//    }
//
//    public void preFrontier(FrontierRequestInterception args) {
//        try {
//            Thread.sleep(0);
//        } catch (InterruptedException ex) {
//        }
//        
//        /*
//        try{
//            userService.getLoggedUser();
//        }catch(Exception e){
//            e.printStackTrace();
//            try{
//                //Fazendo Logout
//                userService.logout(); 
//            }catch(Exception ex){
//                ex.printStackTrace();
//            }
//        
//        } */
//        //System.out.println("Pre frontier : "+args.getClazz().getSimpleName()+" : "+args.getMethod().getName());
//
//    }
//
//    public void postFrontier(FrontierRequestInterception args) {
//
//        //System.out.println("Post frontier : "+args.getClazz().getSimpleName()+" : "+args.getMethod().getName());
//       
//        
//        
//    }

}
