package com.sree.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.entity.Student;
import com.sree.exception.NoStudentFoundError;
import com.sree.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo repo;

	@Override
	public Student getstudent(int id) {
	
		return repo.findById(id)
		.orElseThrow(() -> new NoStudentFoundError("Student with given id "+id+" is not present"));
        //return repo.findById(id)
                //.orElseThrow(() -> new RuntimeException("Student not found"));
		
		
	}

}
