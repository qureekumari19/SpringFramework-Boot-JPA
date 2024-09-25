package com.app.example.BusinessClassSpring.Model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.PublicKey;
import java.util.Arrays;

@Component
public class DatabaseSystem {

    DataService dataService;

    public DatabaseSystem( DataService dataService) {
        this.dataService = dataService;
    }

    public void run(){
       dataService.whichDB();
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
