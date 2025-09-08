package com.semihdagdelen.controller.impl;

import com.semihdagdelen.controller.IStudentController;
import com.semihdagdelen.entity.Student;
import com.semihdagdelen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    //normalde dto kullanılır
    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents() {
        return  studentService.getAllStudents();
    }

    @GetMapping(path = "/{id}")
    @Override
    public Student getStudentById(@PathVariable(name = "id") Integer id) {

        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update/{id}")
    @Override
    public Student updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id,updatedStudent);
    }


}
