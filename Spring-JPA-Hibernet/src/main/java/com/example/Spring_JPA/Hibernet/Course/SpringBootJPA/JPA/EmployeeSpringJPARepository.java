package com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.JPA;

import com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeSpringJPARepository extends JpaRepository<Employee, Integer> {
      Employee findByEmployeeName(String employeeName);
}
