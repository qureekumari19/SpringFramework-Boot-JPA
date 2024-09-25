package com.example.WholeSpringFrameWork_BootLearning2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Lazy
@Component
class Help{
    Service1 service1;
    Service2 service2;


    @Autowired
    public void setService1(Service1 service1) {
        this.service1 = service1;
    }

    @Autowired
    public void setService2(Service2 service2) {
        this.service2 = service2;
    }

    public Service1 getService1() {
        return service1;
    }
    public Service2 getService2() {
        return service2;
    }

    @PostConstruct
   public void initialization(){
       System.out.println("Initialization");
   }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Service1{
    public void PrintKey(){
        System.out.println("Hello Service1");
    }
}

@Component
class Service2{
  public void PrintKey(){
      System.out.println("Hello Service2");
  }
}

@Configuration
@ComponentScan
public class WholeSpringFrameWork_BootLearning2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WholeSpringFrameWork_BootLearning2.class);
//        System.out.println(context.getBean(Service1.class));
//        System.out.println(context.getBean(Service1.class));
//        System.out.println(context.getBean(Service2.class));
//        System.out.println(context.getBean(Service2.class));
        System.out.println(context.getBean(Help.class).getService2());
//        context.getBean(Help.class).getService1().PrintKey();
//        context.getBean(Help.class).getService2().PrintKey();
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
