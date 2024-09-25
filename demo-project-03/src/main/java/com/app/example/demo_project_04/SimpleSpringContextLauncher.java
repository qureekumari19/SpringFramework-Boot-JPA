package com.app.example.demo_project_04;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Dependency1{

   Dependency3 dependency3;

   Dependency2 dependency2;



    public String toString(){
       return "These are the Injected Dependencies: "+dependency3+" and "+ dependency2;
   }

    @Autowired //Setter Method Dependency Injection
    public void setDependency3(Dependency3 dependency3) {
       System.out.println("Setter Method : setDependency3");
        this.dependency3 = dependency3;
    }

    public Dependency1(Dependency3 dependency3, Dependency2 dependency2) {
        System.out.println("Constructor Dependency Injection");
        this.dependency3 = dependency3;
        this.dependency2 = dependency2;
    }

    @Autowired //Setter Method Dependency Injection
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Method : setDependency2");
        this.dependency2 = dependency2;
    }
}

@Component
class Dependency2{

}


@Component
class Dependency3{

}



@Configuration
@ComponentScan
public class SimpleSpringContextLauncher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncher.class);
        System.out.println(context.getBean(Dependency1.class).toString());
//        context.getBean(Dependency1.class).setDependency3(new Dependency3());
        //System.out.println("There are the following Beans which is available in the .class file");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //used to see how many SprintBean is there in the class

    }
}
