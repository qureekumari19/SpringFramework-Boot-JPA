package com.example.CDIApplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
class Business{
    DataService dataService;

    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("setDataService Dependency Injector");
        this.dataService = dataService;
    }


    public DataService getDataService() {
        System.out.println("getDataService Dependency Injector");
        return dataService;
    }
}

//@Component
@Repository
class DataService{

}


@ComponentScan
@Configuration
public class CDIRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CDIRunner.class);
        //context.getBean(Business.class).setDataService(new DataService());
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(Business.class).getDataService());
    }
}
