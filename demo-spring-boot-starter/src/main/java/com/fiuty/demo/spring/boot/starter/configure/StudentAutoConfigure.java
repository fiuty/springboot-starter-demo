package com.fiuty.demo.spring.boot.starter.configure;

import com.fiuty.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@Configuration
public class StudentAutoConfigure {

    @Autowired
    private StudentProperties studentProperties;

    @Bean
    public Student getStudent() {
        Student student = new Student();
        student.setName(studentProperties.getName());
        student.setAge(studentProperties.getAge());
        return student;
    }
}
