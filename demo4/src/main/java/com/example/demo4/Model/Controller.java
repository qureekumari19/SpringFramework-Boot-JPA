package com.example.demo4.Model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    Details details;
//    public Controller(Details details) {
//        this.details = details;
//    }


    @Autowired
    public void setDetails(Details details) {
        this.details = details;
    }


    public String getDetails() {
        return "Details :: "+details.Name()+" "+details.Phone();
    }

    public boolean compare(){
        if(new Person().Name().equals(new Employee().Name())){
            if(new Person().Phone()==(new Employee().Phone())){
                return true;
            }
        }
        return false;
    }
}
