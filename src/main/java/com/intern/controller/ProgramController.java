package com.intern.controller;

import com.intern.service.IProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class ProgramController {

    @Autowired
    private IProgramService programService;

    @GetMapping("/get")
    public ResponseEntity<List<String>> getProgramNames(){
        return ResponseEntity.ok(programService.getNamesResults());
    }
}
