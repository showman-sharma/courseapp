package com.vanish.courseapp.services;
import com.vanish.courseapp.persistence.CourseRepository;
import com.vanish.courseapp.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Course> list;
    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(101,"Spring framework","Tutorial on basics of spring framework"));
//        list.add(new Course(102,"REST API from Spring Boot","Tutorial on creating rest api using spring boot"));
    }


    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(int courseId) {
//        for(Course course:list){
//            if(course.getId()==courseId){
//                return course;
//            }
//        }
//        return null;
        return courseRepository.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
//        for(Course c:list){
//            if(c.getId()==course.getId()){
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//                return c;
//            }
//        }
//        return null;

        return courseRepository.update(course);
    }

    @Override
    public void deleteCourse(int courseId) {
//        list.removeIf(t -> t.getId() == courseId);
        courseRepository.deleteById(courseId);
    }
}
