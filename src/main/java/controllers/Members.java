/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.model.Member;
import data.services.MemberService;
import data.services.StartupService;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

/**
 *
 * @author Romildo Cumbe 
 */
@ApplicationScoped

public class Members extends Controller{
    
    @Inject MemberService memberService;
    
    @Inject StartupService startupService;
    
     public void index() throws MvcException, Exception {
         
        Map filterData = new HashMap();
        filterData.put("titles", memberService.getTitles());
        filterData.put("genders", memberService.getGenders());
        filterData.put("occupations", memberService.getOccupations());
        filterData.put("cities", memberService.getCities());
                
        this.callView(filterData);
    }
     
    public void profile(Map params) throws MvcException, Exception {
        
        Member member = memberService.getByUsername(params.get("id").toString());
        //List<Startup> = startupService.getOFMe;
        
        Map bundle = new HashMap();
        bundle.put("member", member);
        //startups
        this.callView(bundle);
    }
}
