package com.manytomany.service;

import com.manytomany.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudentWithCourse(Student student);
    List<Student> findAllStudent();
    Student findStudentById(Integer id);
    List<Student> findStudentContainingByName(String name);
}
