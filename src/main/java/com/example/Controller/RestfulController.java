package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class RestfulController {
	
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/books")
    public String getAllBook() {
    	return 
    }
}
