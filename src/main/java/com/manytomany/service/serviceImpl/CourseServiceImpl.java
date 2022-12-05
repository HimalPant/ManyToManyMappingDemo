package com.manytomany.service.serviceImpl;

import com.manytomany.entity.Course;
import com.manytomany.repository.CourseRepo;
import com.manytomany.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;

    @Override
    public List<Course> findCourseLessThanPrice(Double price) {
        List<Course> byFeeLessThan = this.courseRepo.findByFeeLessThan(price);
        return byFeeLessThan;
    }
}
