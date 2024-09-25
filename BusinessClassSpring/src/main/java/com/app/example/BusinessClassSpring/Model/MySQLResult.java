package com.app.example.BusinessClassSpring.Model;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MySQLResult implements DataService {

   int a[]={1,2,3,4,5};
    @Override
    public void whichDB() {
        System.out.println("MySQL Result");
    }

    @Override
    public int[] retrieveData() {
        return a;
    }

    String person;

    public String getPerson() {
        return this.person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
