/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.MemberProject;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@ApplicationScoped
public class MemberProjectDAO extends DAO<MemberProject>{

    @Override
    public Class<MemberProject> getEntityClass() {
        return MemberProject.class;
    }
    
}
