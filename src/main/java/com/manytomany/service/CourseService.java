package com.manytomany.service;

import com.manytomany.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> findCourseLessThanPrice(Double price);
}
