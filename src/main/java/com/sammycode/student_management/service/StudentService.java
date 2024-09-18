package com.sammycode.student_management.service;

import com.sammycode.student_management.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentEntity> findAllStudent();
    Optional<StudentEntity> findById(Long id);
    StudentEntity saveStudent(StudentEntity studentEntity);
    StudentEntity updateStudent(StudentEntity studentEntity);
    void deleteStudent(Long id);
}
