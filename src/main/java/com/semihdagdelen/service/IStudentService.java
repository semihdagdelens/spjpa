package com.semihdagdelen.service;

import com.semihdagdelen.entity.Student;
import com.semihdagdelen.service.impl.StudentServiceImpl;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
