package com.semihdagdelen.controller;

import com.semihdagdelen.controller.impl.StudentControllerImpl;
import com.semihdagdelen.entity.Student;

public interface IStudentController {

    public Student saveStudent(Student student);
}
