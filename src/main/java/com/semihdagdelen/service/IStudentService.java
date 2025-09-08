package com.semihdagdelen.service;

import com.semihdagdelen.dto.DtoStudent;
import com.semihdagdelen.dto.DtoStudentIU;
import com.semihdagdelen.entity.Student;
import com.semihdagdelen.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IStudentService {

    //Alırken IU ile alıyoruz çünkü verilen bilgiler max sayıda dönerken de GET işlemini DtoStudent ile döndüğümüz için bu şekilde dönücez.
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<Student> getAllStudents();
    public Student getStudentById(@PathVariable(name = "id") Integer id);
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id, Student updatedStudent);
}
