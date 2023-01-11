package com.sg.springbootmongodb.repository;

import com.sg.springbootmongodb.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, Long> {
}
