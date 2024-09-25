package com.example.demo4.Model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Employee implements Details{
    @Override
    public String Name() {
        return "Quree";
    }

    @Override
    public int Phone() {
        return 1234;
    }

    String PhoneNumber;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
