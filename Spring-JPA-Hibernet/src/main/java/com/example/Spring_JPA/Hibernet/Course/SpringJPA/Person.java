package com.example.Spring_JPA.Hibernet.Course.SpringJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

@Entity
public class Person {
    private String firstName;
    private String LastName;
    private int cityCode;
    private String email;

    @Id
    private Long id;

    public Person(long id, String firstName, String LastName, int cityCode,String email) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.cityCode = cityCode;
        this.email = email;
    }

    public Person() {

    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
     return LastName;
    }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "Id: "+id+" "+", Name:["+firstName+" "+LastName+"]"+" "+", Email: "+email+", CityCode: "+cityCode;
    }
}
