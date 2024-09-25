package com.example.demo4.Model;


import org.springframework.stereotype.Component;

@Component
public class Person implements Details {

    String PhoneNumber;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    @Override
    public String Name() {
        return "Ravi";
    }

    @Override
    public int Phone() {
        return 7890;
    }
}
