package com.vanish.courseapp.controller;

import com.vanish.courseapp.entities.Course;
import com.vanish.courseapp.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "WELCOME TO COURSES APP";
    }

    @GetMapping("/help")
    public String help(){
        return "GET /courses -> List of all courses\n" +
                "GET /courses/<courseId> -> Info of specific course\n" +
                "POST /courses (with new course info in raw json)-> Add new course to list\n" +
                "PUT /courses (with updated course info in raw json)-> Update course with new info\n" +
                "DELETE /courses/<courseId> -> Delete course with given courseId";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return courseService.getCourse(Integer.parseInt(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void   deleteCourse(@PathVariable String courseId){
        courseService.deleteCourse(Integer.parseInt(courseId));
    }

}
