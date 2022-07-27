package com.vanish.courseapp;

import com.vanish.courseapp.configuration.beanConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.vanish.courseapp.*"},exclude={DataSourceAutoConfiguration.class})
public class CourseappApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseappApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
//		Vehicle vehicle = context.getBean(Vehicle.class);

	}

}
