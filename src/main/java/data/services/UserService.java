package data.services;

import data.daos.UserDAO;
import data.model.User;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import org.emerjoin.hi.web.ActiveUser;
import util.GenericUtil;

/**
 * Created by Romildo Cumbe
 */
@Default
@ApplicationScoped
public class UserService {
    
    @Inject
    private HttpSession session;
    
    @Inject private UserDAO userDAO;
    
    @Inject
    private ActiveUser activeUser;
    
    @Inject GenericUtil genericUtil;

    public void logout(){
        activeUser.setProperty("authorized", false);
        session.invalidate();
    }

    public boolean authenticate(String username, String pass) throws Exception {
        
        User usr = userDAO.findUserWithCredentials(username, genericUtil.getMD5(pass));
        
        if(usr != null){
            activeUser.setProperty("authorized", true);
            activeUser.setProperty("user", usr);
            return true;
        }
        
       return false;
    }

    public User getLoggedUser() throws Exception {
        if((boolean) activeUser.getProperty("authorized") != true){
            throw new Exception("User not Authenticated!");
        }
        User loggedUser = (User) activeUser.getProperty("user");
        
        if(loggedUser==null) this.logout();
            
        return loggedUser;    
    }
    
    public long count() throws Exception{
        return userDAO.count();
    }

    public void register(User user) throws Exception {
        user.setPassword(genericUtil.getMD5(user.getPassword()));
        userDAO.create(user);
    }

  

}
