package com.example.Spring_JPA.Hibernet.Course.SpringJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PersonSpringJPARepository extends JpaRepository<Person, Long> {
    List<Person> findByFirstName(String firstName);
    List<Person> findByCityCode(int cityCode);

}
