package com.sg.springbootmongodb.service;

import com.sg.springbootmongodb.model.Teacher;
import com.sg.springbootmongodb.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository repository) {
        this.teacherRepository = repository;
    }

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}
