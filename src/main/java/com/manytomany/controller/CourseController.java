package com.manytomany.controller;

import com.manytomany.entity.Course;
import com.manytomany.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/find/{price}")
    public ResponseEntity<List<Course>> findCourseLessThanPrice(@PathVariable Double price){
        List<Course> courseLessThanPrice = this.courseService.findCourseLessThanPrice(price);
        return new ResponseEntity<>(courseLessThanPrice, HttpStatus.OK);
    }
}
