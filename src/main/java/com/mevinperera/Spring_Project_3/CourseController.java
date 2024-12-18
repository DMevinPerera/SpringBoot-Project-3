package com.mevinperera.Spring_Project_3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Mevin Perera"),
                new Course(2, "Learn DevOps", "Mevin Perera"),
                new Course(3, "Learn Azure", "Mevin Perera"),
                new Course(4, "Learn Python", "Mevin Perera"),
                new Course(4, "Learn Python", "Mevin Perera")
        );
    }
}
