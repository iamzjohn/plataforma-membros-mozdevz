/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Romildo Cumbe
 */
@Entity
public class MemberProject extends GenericEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
    
    @OneToOne
    @JoinColumn(name = "project_id")
    private Project project;
    
    private String role;
    
    private String since;
    
    private String until;
    
    private Boolean current;
}
