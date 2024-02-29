package com.project.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiInfoController {

    @GetMapping
    public ResponseEntity<String> olhaMundo(){
        String ola = "olha, mundo";
        return ResponseEntity.ok(ola);
    }

}
