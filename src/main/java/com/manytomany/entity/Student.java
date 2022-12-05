package com.manytomany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "STUDENT_DETAILS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @Column(name = "STUDENT_AGE")
    private int age;

    @Column(name = "STUDENT_DEPARTMENT")
    private String dept;

    @JsonManagedReference
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TABLE",
            joinColumns = {@JoinColumn(name = "STUDENT_ID",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "COURSE_ID",referencedColumnName = "id")})
    private Set<Course> courses;
}
