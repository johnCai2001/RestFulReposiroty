package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.RestfulEntity;
import com.example.Model.UserVo;
import com.example.Repository.RestfulRepository;



@Service
public class RestfulService {
	
	@Autowired
	private RestfulRepository repo;
		
	public UserVo getuserid(Long id){
		RestfulEntity Entity=repo.findById(id).orElse(null);
       return null; 
	   }

	public UserVo ConvertVo(RestfulEntity e) {
		UserVo Vo=new UserVo();
		Vo.setId(e.getId());
		Vo.setName(e.getName());
		Vo.setAge(e.getAge());
	    return Vo;
	   }
	}
