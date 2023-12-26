package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cus")
public class TestController {
    @GetMapping
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("OK FINEEEE", HttpStatus.OK);
    }
}
