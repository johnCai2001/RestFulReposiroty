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
		//ConvertVo(Entity) 本身會產生一個 UserVo，而你的方法需要回傳的就是 UserVo。
		return ConvertVo(Entity); 
	   }
     //取得資料庫中的資料(Entity) → 塞進前端要用的格式回傳(UserVo)
	public UserVo ConvertVo(RestfulEntity e ) {
		UserVo Vo=new UserVo();
		Vo.setId(e.getId());
		Vo.setName(e.getName());
		Vo.setAge(e.getAge());
		Vo.setHobbies(e.getHobbies());
	    return Vo;
	   }
	}
