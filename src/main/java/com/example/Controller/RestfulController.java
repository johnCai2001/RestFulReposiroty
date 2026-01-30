package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.UserVo;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class RestfulController {
	
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    
    @Operation(summary = "取得使用者", description = "使用者的資料")
    @GetMapping("/User")
    public UserVo getUser(){
    	UserVo user=new UserVo();
    	user.setName("John");
    	user.setAge("24");
    	user.setHobbies("CODING");
    	return user;
    }
}
