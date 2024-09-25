package com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.JPA;

import com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSpringJPARunner implements CommandLineRunner {

    @Autowired
    private EmployeeSpringJPARepository employeeSpringJPARepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.print("Employee Details: ");
        employeeSpringJPARepository.save(new Employee(101,"Manoj","mamoj@amazon.com"));
        employeeSpringJPARepository.save(new Employee(102,"Sweta","sweta@amazon.com"));
        System.out.println(employeeSpringJPARepository.findAll());
        System.out.println("Email is : "+employeeSpringJPARepository.findByEmployeeName("Manoj").getEmployeeEmail());
    }
}
