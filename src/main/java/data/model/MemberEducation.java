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
public class MemberEducation extends GenericEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
    
    @OneToOne
    @JoinColumn(name = "school_id")
    private School school;
    
    private String course;
    
    private Boolean current;
    
    private String phase;
    
    private String notes;
    
    private Boolean finished;
    
}
