package com.semihdagdelen.service.impl;

import com.semihdagdelen.entity.Student;
import com.semihdagdelen.repository.StudentRepository;
import com.semihdagdelen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;

    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (!optionalStudent.isEmpty()){
            return optionalStudent.get();
        }
        return null;
    }



}
