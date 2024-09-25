package com.example.WholeSpringBootLearning.Configuration;

import com.example.WholeSpringBootLearning.Model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhoneRepo extends JpaRepository<Phone,Integer> {
}
