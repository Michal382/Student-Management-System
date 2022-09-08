package com.michalzyw.studentsystem.service;

import com.michalzyw.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
