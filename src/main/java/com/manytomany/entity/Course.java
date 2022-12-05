package com.manytomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COURSE_DETAILS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int module;
    private String abbreviation;
    private double fee;

    @JsonBackReference
    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    private Set<Student> students;
}
