package com.vanish.courseapp.persistence;

import com.vanish.courseapp.entities.Course;
import java.util.List;


public interface CourseRepository{
    Course findById(int id);
    List <Course> findAll();
    void deleteById(int id);
    Course save(Course course);
    Course update(Course course);

}

