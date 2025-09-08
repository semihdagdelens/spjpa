package com.semihdagdelen.service;

import com.semihdagdelen.entity.Student;
import com.semihdagdelen.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(@PathVariable(name = "id") Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id, Student updatedStudent);
}
