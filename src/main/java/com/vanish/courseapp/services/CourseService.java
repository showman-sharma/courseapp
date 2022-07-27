package com.vanish.courseapp.services;

import com.vanish.courseapp.entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    Course getCourse(int courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(int parseInt);
}
