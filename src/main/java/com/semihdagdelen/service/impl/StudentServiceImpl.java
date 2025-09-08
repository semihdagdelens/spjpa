package com.semihdagdelen.service.impl;

import com.semihdagdelen.dto.DtoStudent;
import com.semihdagdelen.dto.DtoStudentIU;
import com.semihdagdelen.entity.Student;
import com.semihdagdelen.repository.StudentRepository;
import com.semihdagdelen.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }


    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;

    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (!optionalStudent.isEmpty()){
            return optionalStudent.get();
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        Student student = getStudentById(id);
        if (student != null){
            studentRepository.delete(student);
        }


    }

    @Override
    public Student updateStudent(Integer id, @RequestBody Student updatedStudent) {
        Student dbStudent = studentRepository.getStudentById(id);
        if (dbStudent !=null){
            dbStudent.setBirthDate(updatedStudent.getBirthDate());
            dbStudent.setFirstName(updatedStudent.getFirstName());
            dbStudent.setLastName(updatedStudent.getLastName());

            studentRepository.save(dbStudent);
            return dbStudent;
        }

        return null;
    }


}
