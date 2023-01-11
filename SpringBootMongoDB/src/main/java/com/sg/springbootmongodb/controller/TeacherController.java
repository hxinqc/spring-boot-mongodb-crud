package com.sg.springbootmongodb.controller;

import com.sg.springbootmongodb.exception.RecordNotFoundException;
import com.sg.springbootmongodb.model.Teacher;
import com.sg.springbootmongodb.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping("/teacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return service.save(teacher);
    }

    @GetMapping("/teacher/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable(value = "id") String id)
            throws RecordNotFoundException {
        return ResponseEntity.ok().body(service.getTeacherById(id));
    }

    @PutMapping("/teacher/{id}")
    public ResponseEntity<Teacher> updateTeacherById(@PathVariable(value = "id") String id,
             @RequestBody Teacher teacherU) throws RecordNotFoundException {
        Teacher teacher = service.getTeacherById(id);
        teacher.setFirstName(teacherU.getFirstName());
        teacher.setLastName(teacherU.getLastName());
        teacher.setIsActive(teacherU.getIsActive());
        service.save(teacher);
        return ResponseEntity.ok().body(teacher);
    }

    @DeleteMapping("/teacher/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") String id)
            throws RecordNotFoundException {
        Teacher teacher = service.getTeacherById(id);

        service.deleteTeacher(teacher);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
