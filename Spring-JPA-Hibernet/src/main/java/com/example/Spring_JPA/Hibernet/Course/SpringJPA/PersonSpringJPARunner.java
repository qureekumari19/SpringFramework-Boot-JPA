package com.example.Spring_JPA.Hibernet.Course.SpringJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonSpringJPARunner implements CommandLineRunner {

    @Autowired
    private PersonSpringJPARepository personSpringJPARepository;

    @Override
    public void run(String... args) throws Exception {
        personSpringJPARepository.save(new Person(1,"Quree","Kumari",5605,"qureekumari3@gmail.com"));
        personSpringJPARepository.save(new Person(2,"Kali","Kumari",8605,"kalibarnwal@gmail.com"));
        personSpringJPARepository.save(new Person(3,"Krit","Kumar",2356,"kritbarnwal@gmail.com"));
        personSpringJPARepository.save(new Person(3,"Ravi","Kumar",5605,"kritbarnwal@gmail.com"));
//        System.out.println(personSpringJPARepository.findAll().toString());
//        System.out.println(personSpringJPARepository.findByFirstName("Kali"));
        System.out.println(personSpringJPARepository.findByCityCode(5605));

    }
}
