/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.daos;

import data.model.City;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Romildo Cumbe <romildocumbe@gmail.com>
 */
@ApplicationScoped
public class CityDAO extends DAO<City>{

    @Override
    public Class<City> getEntityClass() {
        return City.class;
    }
    
}
