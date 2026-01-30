package com.example.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="RestfulTable")
public class RestfulEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private Long Id;
	
	private String Name;
	
	private String Age;
	
	private String Hobbies; 
}
