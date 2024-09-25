package com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.Controller;

import com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.JPA.EmployeeSpringJPARepository;
import com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmpoyeeRunner {

    @Autowired
    private EmployeeSpringJPARepository employeeSpringJPARepository;

    @GetMapping("/emp")//Read
    public List<Employee> getEmployeeDetails(Employee employee) {
        return employeeSpringJPARepository.findAll();
//        return Arrays.asList(new Employee(101,"Manoj","mamoj@amazon.com"),new Employee(102,"Archana","archuj@amazon.com"));
    }
    @GetMapping("/emp/{id}") //Get By ID, Read By ID
    public Employee getEmployeeDetailsByName(@PathVariable int id) {
        if(employeeSpringJPARepository.existsById(id)) {
            return employeeSpringJPARepository.findById(id).get();
        }
        else
            throw new RuntimeException("There is No such ID available:");
//        return employeeSpringJPARepository.findByEmployeeName("Sweta");
//        return Arrays.asList(new Employee(101,"Manoj","mamoj@amazon.com"),new Employee(102,"Archana","archuj@amazon.com"));
    }

    @PostMapping("/addEmp") //Create-> Post use
    public void addEmployee(@RequestBody Employee employee) {
        employeeSpringJPARepository.save(employee);
    }

    @PutMapping("/updateEmp/{id}") //Update
    public void updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        employeeSpringJPARepository.save(employee);
    }

    @DeleteMapping("/delEmp/{id}") //Update
    public void deleteEmployee(@PathVariable int id) {
        employeeSpringJPARepository.deleteById(id);
    }

    // http://localhost:8080/h2-console - H2 Database
    // chrome-extension://aejoelaoggembcahagimdiliamlcdmfm/index.html#requests - Talented API Tester
    //http://localhost:8080/emp - To check the Employee Details

}
