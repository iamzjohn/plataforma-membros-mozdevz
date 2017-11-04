/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontiers;

import data.model.Member;
import data.model.Startup;
import data.services.StartupService;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.component.HiList;
import org.emerjoin.hi.web.meta.Frontier;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@Frontier
@ApplicationScoped
public class StartupsFrontier {
    @Inject
    private StartupService startupService;
    
    public Map fetch(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception{
            
          Map listData = startupService.fetch(pageNumber, itemsPerPage, filter, ordering);
          
          List<Member> rows = (List<Member>) listData.get("rows");
          int totalMachedRows = (int) listData.get("count");
//          int totalMatchedPages = (int) listData.get("totalPages");
          
          
          return HiList.listEncode(rows, totalMachedRows, pageNumber, itemsPerPage);
                
    }
    
    public List<Startup> getAll() throws Exception{
        return startupService.getAllStartups();
    }
    
    public Map fetchFromMember(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception{
            
          Map listData = startupService.fetchFromMember(pageNumber, itemsPerPage, filter, ordering);
          
          List<Member> rows = (List<Member>) listData.get("rows");
          int totalMachedRows = (int) listData.get("count");
//          int totalMatchedPages = (int) listData.get("totalPages");
          
          return HiList.listEncode(rows, totalMachedRows, pageNumber, itemsPerPage);
                
    }
}
