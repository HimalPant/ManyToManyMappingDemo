package com.manytomany.repository;

import com.manytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findByFeeLessThan(Double fee);
}
