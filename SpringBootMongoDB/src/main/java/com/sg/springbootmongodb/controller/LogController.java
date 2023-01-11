package com.sg.springbootmongodb.controller;

import com.sg.springbootmongodb.model.Log;
import com.sg.springbootmongodb.repository.LogRepository;
import com.sg.springbootmongodb.service.SeqGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5555")
@RestController
@RequestMapping("/api")
public class LogController {
    @Autowired
    private LogRepository logRepository;
    @Autowired
    private SeqGeneratorService seqGeneratorService;

    @GetMapping("/log")
    public List<Log> getAllLogs() {
        return logRepository.findAll();
    }

    @PostMapping("/log")
    public Log createLog(@RequestBody Log log) {
        log.setId(seqGeneratorService.generateSequence(Log.SEQUENCE_NAME));
        return logRepository.save(log);
    }
}
