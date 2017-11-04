/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontiers;

import data.services.UserService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.meta.Frontier;


/**
 *
 * @author Romildo Cumbe
 */
@Frontier
@ApplicationScoped
public class UserFrontier {

    @Inject
    private UserService userService;

    @Inject
    private ActiveUser activeUser;
    
    

    public void logout() {
        userService.logout();
    }
//    
//    public Map stateKey(String app){
//        Map data = Utils.getApp(app);
//        
//        String scope = "";
//        String state = GenericUtil.getRandomString();
//        data.put("scope", scope);
//        data.put("state", state);      
//        
//        activeUser.setProperty("state", state);
//        
//        return data;
//    }
//
//    public void loginOAuth(String app) {
//        OAuthParams oauthParams = OAuthHelper.oAuthParams(app.toLowerCase());
//        
//        if(oauthParams == null){
////            return null;
//        }
//        
//        
//        
//    }

}
