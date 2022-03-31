package com.spring.mongodb.controller;

import com.spring.mongodb.models.Student;
import com.spring.mongodb.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/student")
    public ResponseEntity<?>  addStudent(@RequestBody Student student)
    {
        Student studentResp=repository.save(student);
        return ResponseEntity.ok(studentResp);
    }

    @GetMapping("/student")
    public ResponseEntity<?>  getStudents()
    {
        return ResponseEntity.ok(this.repository.findAll());
    }

}
