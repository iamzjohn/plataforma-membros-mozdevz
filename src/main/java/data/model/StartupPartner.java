/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Romildo Cumbe
 */
@Entity
public class StartupPartner extends GenericEntity{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String field;
    
    @OneToOne
    @JoinColumn(name = "startup_id")
    private Startup startup;
    
    @OneToOne
    @JoinColumn(name = "partner_id")
    private Startup partner;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date since;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date until;
    
    private Boolean current;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Startup getStartup() {
        return startup;
    }

    public void setStartup(Startup startup) {
        this.startup = startup;
    }

    public Startup getPartner() {
        return partner;
    }

    public void setPartner(Startup partner) {
        this.partner = partner;
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }

    public Date getUntil() {
        return until;
    }

    public void setUntil(Date until) {
        this.until = until;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }
    
    
    
    
}
