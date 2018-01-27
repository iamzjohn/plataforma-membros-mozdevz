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
import javax.enterprise.event.Observes;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.FrontEnd;
import org.emerjoin.hi.web.RequestContext;
import org.emerjoin.hi.web.events.TemplateLoadEvent;
import org.emerjoin.hi.web.events.TemplateTransformEvent;

/**
 *
 * @author Adelino José Ngomacha
 */
@ApplicationScoped
//public class HiEventsListener implements TemplateLoadListener, ControllerCallsListener, FrontierCallsListener {
public class HiEventsListener {

    @Inject
    private ActiveUser activeUser;
    
    @Inject
    private FrontEnd frontEnd;
    
    @Inject UserService userService;
    
    @Inject RequestContext requestContext;
    
    public void onTemplateLoad(@Observes TemplateLoadEvent event) {

         Map<String,Object> map = new HashMap<>();
         //add some cool stuff to the map
      
         frontEnd.setTemplateData(map);           
        
    }
    
    public void changeTemplate(@Observes TemplateTransformEvent transformEvent){

        // Examples of how to explore this event

        //Adding DOM elements right after the body tag
//        transformEvent.getTemplate().appendJS("webroot/the/path/to/script.js"); 
//        transformEvent.getTemplate().appendCSS("webroot/the/path/to/style.css"); 
//        transformEvent.getTemplate().append("<tag>content</tag>");
        
        //Adding DOM Elements right inside the <head> element.
//        transformEvent.getTemplate().prepend("<tag>content</tag>");
//        transformEvent.getTemplate().prependCSS("webroot/the/path/to/style.css")
//        transformEvent.getTemplate().prependJS("webroot/the/path/to/script.js");
        
        //Replacing the template HTML by a completely different one.
//        transformEvent.getTemplate().setMarkup("<html>Your new markup</html>");
    }
    
     public void templateLoad(@Observes TemplateLoadEvent event){
            
               UserInfo info = new UserInfo(); //fetch user data;
               User usr = (User) activeUser.getProperty("user");
               Map data = new HashMap();
               if(usr != null){
                  info.setUser(usr);
                  info.setAutorized((boolean) activeUser.getProperty("authorized"));
               }
               data.put("userInfo",info);        
               frontEnd.setTemplateData(data); 
         }    
    
    
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
