package com.sammycode.student_management.controller;

import com.sammycode.student_management.entity.StudentEntity;
import com.sammycode.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/management")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<StudentEntity> findAllStudent(){
        return studentService.findAllStudent();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable("id") Long id){
        return studentService.findById(id);

    }
    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }

    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
