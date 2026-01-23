package com.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
	@Autowired
	StudentRepository repo ;
	
//	@GetMapping("/hello")
//	public String showGreeting(){
//		return "hellow greeting";
//		}
	
	
	@PostMapping("/student")
	public String storeRecord(Student student) {
		repo.save(student);
		
		System.out.println("data recived" + student.username);
		return "record Stored";
		 
	}
	
	
	
	@GetMapping("/student")
	public List<Student>getStudent(){
		return repo.findAll();
	}
	
	@GetMapping("/student/{sid}")
	public Student getSpecificRecord(@PartVariable id)
	{
	 return repo.getOne(id);
	}

}
