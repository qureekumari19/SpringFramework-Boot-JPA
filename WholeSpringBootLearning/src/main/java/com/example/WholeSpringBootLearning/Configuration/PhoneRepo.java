package com.example.WholeSpringBootLearning.Configuration;

import com.example.WholeSpringBootLearning.Model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PhoneRepo implements CommandLineRunner {

    @Autowired
    private IPhoneRepo phoneRepo;

    @Override
    public void run(String... args) throws Exception {
        phoneRepo.save(new Phone(123, "2017", "Samsung"));
        phoneRepo.save(new Phone(122, "2024", "Iphone"));
    }
}
