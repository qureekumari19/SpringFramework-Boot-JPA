package com.app.example.BusinessClassSpring.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class MongoDBResult implements DataService {

    int a[]={1,2,3,4,5};

    @Override
    public void whichDB() {
        System.out.println("MongoDB Result");
    }

    @Override
    public int[] retrieveData() {
        return a;
    }

    String person;


    public void setPerson(String person) {
        this.person = person;
    }

    public String getPerson() {
        return this.person;
    }

}
