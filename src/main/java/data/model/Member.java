package data.model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

/**
 * Created by Romildo Cumbe 
 */
@Entity
public class Member extends GenericEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    
    @NotNull
    private String username;
    
    @NotNull
    private String title;
    
    @NotNull
    private String imageUrl;
    
    @NotNull
    private String gender;
    
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;
    
    
    @NotNull
    private String email;
    
    private String phone;
    
    //phone or mail
    private String perferibleFormOfContact;
    
    
    //comma separated tags for technologies
    private String technologies;
    
    
    private String facebook;
        
    private String twitter;
    
    private String instagram;
    
    
    private String github;
    
    private String stackoverflow;
    
    private String linkedIn;
    
    private String website;
    
    private String about;
    
    
    //STUDENT or WORKER
    @NotNull
    private String occupation;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthday;

    public Member() {
        this.name = "";
        this.username = "";
        this.title = "";
        this.imageUrl = "webroot/assets/images/demo/users/face11.jpg";
        this.gender = "";
        this.city = new City();
        this.email = "";
        this.phone = "";
        this.perferibleFormOfContact = "";
        this.technologies = "";
        this.facebook = "";
        this.twitter = "";
        this.instagram = "";
        this.github = "";
        this.stackoverflow = "";
        this.linkedIn = "";
        this.website = "";
        this.occupation = "";
        this.birthday = new Date();
        this.about =  "";
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPerferibleFormOfContact() {
        return perferibleFormOfContact;
    }

    public void setPerferibleFormOfContact(String perferibleFormOfContact) {
        this.perferibleFormOfContact = perferibleFormOfContact;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    
    
    
    
    
}
