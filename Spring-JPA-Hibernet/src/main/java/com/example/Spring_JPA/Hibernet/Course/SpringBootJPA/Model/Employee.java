package com.example.Spring_JPA.Hibernet.Course.SpringBootJPA.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "EmpDetails")
public class Employee {

    @Id
    @Column(name = "empID")
    private int employeeId;
    @Column(name = "empName")
    private String employeeName;
    @Column(name = "empEmail")
    private String employeeEmail;
//    @Id
//    @GeneratedValue
//    private Long id;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public Employee(int employeeId, String employeeName, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }
    public Employee(){

    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }

    @Override
    public String toString() {
        return " "+employeeName+" "+employeeEmail+" "+employeeId;
    }
}
