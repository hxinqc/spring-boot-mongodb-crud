package com.sg.springbootmongodb.controller;

import com.sg.springbootmongodb.model.Teacher;
import com.sg.springbootmongodb.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5555")
@RestController
@RequestMapping("/api/")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/teacher")
    public List<Teacher> getAllEmployees() {
        return service.findAll();
    }
}
