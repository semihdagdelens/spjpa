package com.semihdagdelen.controller;

import com.semihdagdelen.controller.impl.StudentControllerImpl;
import com.semihdagdelen.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface IStudentController {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(@PathVariable(name = "id") int id);
}
