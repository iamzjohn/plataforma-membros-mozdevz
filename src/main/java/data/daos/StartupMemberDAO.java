/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.StartupMember;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@ApplicationScoped
public class StartupMemberDAO extends DAO<StartupMember>{

    @Override
    public Class<StartupMember> getEntityClass() {
        return StartupMember.class;
    }
    
}
