package controllers;

import data.services.SetupService;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.mvc.Controller;
import org.emerjoin.hi.web.mvc.exceptions.MvcException;

/**
 * Created by Romildo Cumbe 
 */
@ApplicationScoped
public class Announcements extends Controller {
    
    @Inject SetupService setupService;
    
    public void index() throws MvcException, Exception {
        setupService.run();
        this.callView();
    }
    
}
