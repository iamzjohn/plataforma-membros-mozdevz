package data.services;


import data.daos.CityDAO;
import data.daos.MemberDAO;
import data.model.City;
import data.model.Member;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Created by Romildo Cumbe 
 */
@ApplicationScoped
public class SetupService {

    @Inject private CityDAO cityDAO;
    @Inject private MemberDAO memberDAO;
    

    public void run() throws Exception{
        if(cityDAO.count()==0){
            
            City city1 = new City();
            city1.setName("Maputo");
            cityDAO.create(city1);
            
            City city2 = new City();
            city2.setName("Beira");
            cityDAO.create(city2);
            
        }
        
        Member m = new Member();
        m.setName("Romildo Cumbe");
        m.setTitle("Full Stack Java Web Developer");
        m.setEmail("romildocumbe@gmail.com");
        m.setOccupation("Trabalhador");
        m.setCity(cityDAO.first());
        m.setTechnologies("PHP,JAVA,JAVA EE");
        m.setUsername("romildocumbe");
        m.setImageUrl("webroot/assets/images/demo/users/face11.jpg");
        m.setGender("Masculino");
        memberDAO.create(m);
        
    }
    
}
