package com.fiuty.project.service;

import com.fiuty.demo1.Student;
import com.fiuty.demo2.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fiuty
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private Student student;

    @Autowired
    private Teacher teacher;

    @Override
    public String studentInfo() {
        return student.getName() + ":" + student.getAge();
    }

    @Override
    public String teacherInfo() {
        return teacher.getName() + ":" + teacher.getAge();
    }
}
