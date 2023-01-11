package com.sg.springbootmongodb.service;

import com.sg.springbootmongodb.exception.RecordNotFoundException;
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

    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(String id) throws RecordNotFoundException{
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("Teacher not found with id: " + id));
        return teacher;
    }

    public void deleteTeacher(Teacher teacher) {
        teacherRepository.delete(teacher);
    }
}
