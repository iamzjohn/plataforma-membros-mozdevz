/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.MemberEducation;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@ApplicationScoped
public class MemberEducationDAO extends DAO<MemberEducation>{

    @Override
    public Class<MemberEducation> getEntityClass() {
        return MemberEducation.class;
    }
    
}
