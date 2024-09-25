package com.example.SpringBoot.cources.Controller;

import com.example.SpringBoot.cources.Bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
       return Arrays.asList(new Course(1,"ABC","Quree"),new Course(2,"XYZ","Kali"));
    }

    @GetMapping("/courses/1")
    public Course getCourseDetail(){
        return new Course(2,"QRS","Kali");
    }
}
