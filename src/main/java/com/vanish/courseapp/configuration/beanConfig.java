package com.vanish.courseapp.configuration;

import com.vanish.courseapp.persistence.CourseRepository;
import com.vanish.courseapp.persistence.CourseRepositoryImpl;
import com.vanish.courseapp.services.CourseService;
import com.vanish.courseapp.services.CourseServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "com.vanish.courseapp")
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = CourseService.class),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = CourseRepository.class)})
public class beanConfig {

    @Bean
    public CourseService courseService(){ return new CourseServiceImpl();}

    @Bean
    public CourseRepository courseRepository(){ return new CourseRepositoryImpl();}
}
