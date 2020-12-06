package com.fiuty.demo.spring.boot.starter.configure;

import com.fiuty.demo1.Student;
import com.fiuty.demo2.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@Configuration
public class AutoConfigure {

    @Autowired
    private StudentProperties studentProperties;

    @Autowired
    private TeacherProperties teacherProperties;

    @Bean
    public Student getStudent() {
        Student student = new Student();
        student.setName(studentProperties.getName());
        student.setAge(studentProperties.getAge());
        return student;
    }

    @Bean
    public Teacher getTeacher() {
        Teacher teacher = new Teacher();
        teacher.setName(teacherProperties.getName());
        teacher.setAge(teacherProperties.getAge());
        return teacher;
    }
}
