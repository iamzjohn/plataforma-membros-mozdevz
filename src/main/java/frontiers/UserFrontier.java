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
    
    public boolean addUser(User user, Member member) {
//        user.setMember(member);

        User userAux = new User();
        userAux.setIsGuest(user.getIsGuest());
        userAux.setUsername(user.getUsername());
        userAux.setPassword(user.getPassword());
        
        Member memberAux = new Member();
        memberAux.setBirthday(member.getBirthday());
        memberAux.setCity(member.getCity());
        memberAux.setEmail(member.getEmail());
        memberAux.setFacebook(member.getFacebook());
        memberAux.setGender(member.getGender());
        memberAux.setGithub(member.getGithub());
        memberAux.setImageUrl(member.getImageUrl());
        memberAux.setInstagram(member.getInstagram());
        memberAux.setLinkedIn(member.getLinkedIn());
        memberAux.setName(member.getName());
        memberAux.setOccupation(member.getOccupation());
        memberAux.setPerferibleFormOfContact(member.getPerferibleFormOfContact());
        memberAux.setPhone(member.getPhone());
        memberAux.setTechnologies(member.getTechnologies());
        memberAux.setTitle(member.getTitle());
        memberAux.setTwitter(member.getTwitter());
        memberAux.setUsername(user.getUsername());
        memberAux.setWebsite(member.getWebsite());
        
        userAux.setMember(memberAux);
        
        System.out.println(userAux);
//        try {
//            userService.register(user);
//            System.out.println(user);
////            boolean authorized = auth.doLogin(user.getUsername(), user.getPassword());
////            if (authorized == false) {
////                return authorized;
////            }
//            return true;
//        } catch (Exception ex) {
//            Logger.getLogger(UserFrontier.class.getName()).log(Level.SEVERE, null, ex);
        return false;
//        }
    }
    
}
