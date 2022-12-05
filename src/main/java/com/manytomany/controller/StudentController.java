package com.manytomany.controller;

import com.manytomany.entity.Student;
import com.manytomany.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> saveStudentWithCourse(@RequestBody Student student){
        Student student1 = this.studentService.saveStudentWithCourse(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAllStudents(){
        List<Student> allStudent = this.studentService.findAllStudent();
        return new ResponseEntity<>(allStudent, HttpStatus.OK);
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable Integer id){
        Student studentById = this.studentService.findStudentById(id);
        return new ResponseEntity<>(studentById,HttpStatus.OK);
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<List<Student>> findStudentContainingByName(@PathVariable String name){
        List<Student> studentContainingByName = this.studentService.findStudentContainingByName(name);
        return new ResponseEntity<>(studentContainingByName,HttpStatus.OK);
    }
}
