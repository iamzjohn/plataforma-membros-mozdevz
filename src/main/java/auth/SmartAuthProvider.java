/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import data.model.User;
import data.services.UserService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.AuthComponent;

/**
 *
 * @author Romildo Cumbe
 */
@ApplicationScoped
public class SmartAuthProvider implements AuthComponent {

    @Inject
    private ActiveUser activeUser;
    
    @Inject
    private UserService userService;
    
    public boolean doLogin(String username, String pass){ 
    
        try {
            return userService.authenticate(username, pass);
        } catch (Exception ex) {
            Logger.getLogger(SmartAuthProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public boolean isUserInAnyOfThisRoles(String[] strings) {
        
        User user = (User)activeUser.getProperty("user");
        
        if(user==null) return false;
        
        for (String string : strings) {
            if (string.equalsIgnoreCase("MEMBER")){
                
                if(user.getIsGuest()){
                    return true;
                }
            }
        }
                        
        return false;
        
    }

    @Override
    public boolean doesUserHavePermission(String string) {
        
        //TODO: Implement this
        return false;
        
    }
    
}
