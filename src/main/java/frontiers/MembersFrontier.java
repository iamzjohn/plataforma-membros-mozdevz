/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontiers;

import data.model.Member;
import data.services.MemberService;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.emerjoin.hi.web.ActiveUser;
import org.emerjoin.hi.web.component.HiList;
import org.emerjoin.hi.web.meta.Frontier;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 * @author Adelino Jose Ngomacha <adelinob335@gmail.com>
 */
@Frontier
@ApplicationScoped
public class MembersFrontier {

    @Inject
    private MemberService memberService;

    @Inject
    private ActiveUser activerUser;

    public Map fetch(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {

        Map listData = memberService.fetch(pageNumber, itemsPerPage, filter, ordering);

        List<Member> rows = (List<Member>) listData.get("rows");

//        System.out.print("ROW DATA: " + rows);
        int totalMachedRows = (int) listData.get("count");
//          int totalMatchedPages = (int) listData.get("totalPages");
        Map has = HiList.listEncode(rows, totalMachedRows, pageNumber, itemsPerPage);
        System.out.println("MAP DATA: ");
        System.out.println(has);
        return has;

    }

    public List<Member> getAllMembers() throws Exception {
        return memberService.getAllMembers();
    }

    public Map fetchFromStartup(int pageNumber, int itemsPerPage, Map filter, Map ordering) throws Exception {

        Map listData = memberService.fetchFromStartup(pageNumber, itemsPerPage, filter, ordering);

        List<Member> rows = (List<Member>) listData.get("rows");
        int totalMachedRows = (int) listData.get("count");
//          int totalMatchedPages = (int) listData.get("totalPages");

        return HiList.listEncode(rows, totalMachedRows, pageNumber, itemsPerPage);

    }

}
