package com.semihdagdelen.controller;

import com.semihdagdelen.dto.DtoStudent;
import com.semihdagdelen.dto.DtoStudentIU;
import com.semihdagdelen.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<Student> getAllStudents();
    public Student getStudentById(@PathVariable(name = "id") Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id, Student updatedStudent);
}
