package com.fiuty.project.service;

import com.fiuty.demo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fiuty
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private Student student;

    @Override
    public String info() {
        return this.student.getName() + ":" + student.getAge();
    }
}
