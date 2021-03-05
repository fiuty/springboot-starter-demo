package com.fiuty.demo.spring.boot.starter.configure;

import com.fiuty.demo1.Student;
import com.fiuty.demo2.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fiuty
 */
@Configuration
@EnableConfigurationProperties({StudentProperties.class, TeacherProperties.class})
@Slf4j
public class DemoConfiguration {

    @Bean
    public Student getStudent(StudentProperties studentProperties) {
        Student student = new Student();
        log.info("初始化student");
        student.setName(studentProperties.getName());
        student.setAge(studentProperties.getAge());
        return student;
    }

    @Bean
    public Teacher getTeacher(TeacherProperties teacherProperties) {
        Teacher teacher = new Teacher();
        teacher.setName(teacherProperties.getName());
        teacher.setAge(teacherProperties.getAge());
        return teacher;
    }
}
