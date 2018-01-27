/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import auth.SmartAuthProvider;
import data.model.Member;
import data.services.MemberService;
import data.services.SetupService;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.FrontEnd;
import org.emerjoin.hi.web.RequestContext;

import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

/**
 *
 * @author Romildo Cumbe
 * @author Adelino Jose 
 */
@ApplicationScoped
public class User extends Controller {

    @Inject
    private RequestContext context;

    @Inject
    private SmartAuthProvider auth;

    @Inject
    private ActiveUser activeUser;

    @Inject
    private FrontEnd frontEnd;

    @Inject
    private SetupService setupService;

    @Inject
    MemberService memberService;

    public void profile(Map params) throws MvcException {

        data.model.User loggedUser = (data.model.User) activeUser.getProperty("user");
        Map data = new HashMap();
        data.put("memberInfo", loggedUser.getMember());

        this.callView(data);
    }

    public void changePassword() throws MvcException {
        this.callView();
    }

    public void registration() throws MvcException, Exception {
        Map filterData = new HashMap();
        filterData.put("titles", memberService.getTitles());
        filterData.put("genders", memberService.getGenders());
        filterData.put("occupations", memberService.getOccupations());
        filterData.put("cities", memberService.getCities());
        
        filterData.put("novo_user", new data.model.User());
        filterData.put("novo_member", new Member());

        this.callView(filterData);
    }

    public void login(Map params) throws MvcException {
        try {

            //Initialize app!
            setupService.run();

            if (!(params.containsKey("user") && params.containsKey("pass"))) {
                context.getResponse().sendError(400);
                return;
            }

            String user = params.get("user").toString();
            String pass = params.get("pass").toString();
            context.getServletContext().log(params.toString());

            boolean authorized = auth.doLogin(user, pass);

            if (!authorized) {
                context.getResponse().sendError(403);
                return;
            }

            data.model.User loggedUser = (data.model.User) activeUser.getProperty("user");
            context.getResponse().sendRedirect("../announcements");

        } catch (Throwable ex) {

            throw new MvcException("Failed to authenticate user", ex);
        }

    }

}
