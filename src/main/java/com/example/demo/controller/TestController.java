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
    public ResponseEntity<DTO> test() {
        DTO dto = new DTO("a", "b");

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
