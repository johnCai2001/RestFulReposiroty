package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.RestfulEntity;
import com.example.Model.UserVo;
import com.example.Repository.RestfulRepository;



@Service
public class RestfulService {
	
	@Autowired
	private RestfulRepository repo;
		
	public List<UserVo> getAllBook(){
	List<RestfulEntity> books=repo.findAll();

	   }
	}
