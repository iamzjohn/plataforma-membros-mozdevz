/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.Member;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe
 */
@ApplicationScoped
public class MemberDAO extends DAO<Member>{

    @Override
    public Class<Member> getEntityClass() {
        return Member.class;
    }
    
        
}
