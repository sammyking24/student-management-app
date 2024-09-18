package com.sammycode.student_management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stud_id")
    private Long id;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private  String address;
}
