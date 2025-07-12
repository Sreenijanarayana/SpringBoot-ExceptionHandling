package com.sree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sree.entity.Student;
import com.sree.service.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentServiceImpl stu;
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> findStudent(@PathVariable int id) {
		Student s1 = stu.getstudent(id);
		return ResponseEntity.ok(s1);
	}

}
