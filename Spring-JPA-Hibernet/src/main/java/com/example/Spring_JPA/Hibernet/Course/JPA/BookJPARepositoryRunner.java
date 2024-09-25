package com.example.Spring_JPA.Hibernet.Course.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookJPARepositoryRunner implements CommandLineRunner {

    @Autowired
    private BookJPARepository bookJPARepository;

    @Override
    public void run(String... args) throws Exception {
        bookJPARepository.insert(new Book(1001,"Art Of Laziness"));
        bookJPARepository.insert(new Book(1002,"DO Your Best"));
        bookJPARepository.insert(new Book(1003,"Harry Potter"));
    }
}
