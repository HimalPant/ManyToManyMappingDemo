package com.manytomany.service.serviceImpl;

import com.manytomany.entity.Student;
import com.manytomany.repository.StudentRepo;
import com.manytomany.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    @Override
    public Student saveStudentWithCourse(Student student) {
        Student save = this.studentRepo.save(student);
        return save;
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> all = this.studentRepo.findAll();
        return all;
    }

    @Override
    public Student findStudentById(Integer id) {
        Optional<Student> byId = this.studentRepo.findById(id);
        return byId.get();
    }

    @Override
    public List<Student> findStudentContainingByName(String name) {
        List<Student> byNameContaining = this.studentRepo.findByNameContaining(name);
        return byNameContaining;
    }
}
