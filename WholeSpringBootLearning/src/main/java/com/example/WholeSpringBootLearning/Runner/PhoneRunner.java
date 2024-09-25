package com.example.WholeSpringBootLearning.Runner;

import com.example.WholeSpringBootLearning.Configuration.IPhoneRepo;
import com.example.WholeSpringBootLearning.Model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneRunner {

    @Autowired
    private IPhoneRepo phoneRepo;

    @GetMapping("/hey")
    public List<Phone> getPhoneDetails(Phone phone){
      return phoneRepo.findAll();
    }

    @GetMapping("/hey/{id}")
    public Phone getPhoneDetailsByID(@PathVariable int id){
        return phoneRepo.findById(id).get();
    }

    @PostMapping("/hey/update")
    public Phone updatePhone(@RequestBody Phone phone){
        return phoneRepo.save(phone);
    }

    @PutMapping("/hey/update/{id}")
    public void updatePhoneByID(@PathVariable int id, @RequestBody Phone phone){
         phoneRepo.save(phone);
    }

    @DeleteMapping("/hey/delete/{id}")
    public void deletePhone(@PathVariable int id){
        phoneRepo.deleteById(id);
    }
}
