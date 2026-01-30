package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.UserVo;
import com.example.Service.RestfulService;

import io.swagger.v3.oas.annotations.Operation;




@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class RestfulController {
	
	@Autowired
	RestfulService Service;
	
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
    
    @GetMapping("/users/{id}")
    public ResponseEntity<UserVo> getUserById(@PathVariable Long id) {
        UserVo user = Service.getuserid(id);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(user);
    }

}
