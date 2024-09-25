package com.example.Spring_JPA.Hibernet.Course.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJBDCRepositoryRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(101,"AWS","Quree"));
        courseJDBCRepository.insert(new Course(102,"Azure","Ravi"));
        courseJDBCRepository.insert(new Course(103,"Romance","Love"));
//        courseJDBCRepository.deleteByID(101);
        System.out.println(courseJDBCRepository.findById(101).toString());
        System.out.println(courseJDBCRepository.findById(102).toString());
    }
}
