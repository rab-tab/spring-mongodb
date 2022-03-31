package com.spring.mongodb.repo;

import com.spring.mongodb.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
