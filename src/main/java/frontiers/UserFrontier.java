/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontiers;

import auth.SmartAuthProvider;
import data.model.Member;
import data.model.User;
import data.services.UserService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.meta.Frontier;

/**
 *
 * @author Romildo Cumbe
 * @author Adelino Jose Ngomacha
 */
@Frontier
@ApplicationScoped
public class UserFrontier {

    @Inject
    private UserService userService;

    @Inject
    private SmartAuthProvider auth;

    @Inject
    private ActiveUser activeUser;

    public void logout() {
        userService.logout();
    }

    public boolean login(String username, String password) {
        boolean authorized = auth.doLogin(username, password);
        return authorized;
    }

    public boolean addUser(User user, Member member) {

        /**
         * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); Date
         * myDate = new Date(); try { myDate = sdf.parse(member_birthdate); }
         * catch (ParseException ex) { ex.printStackTrace();
         * System.out.println("Falha ao tentar fazer parse da
         * data".toUpperCase()); return false; } member.setBirthday(myDate);
         */
        user.setMember(member);
        user.setIsGuest(true);
        try {
            userService.register(user);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserFrontier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
