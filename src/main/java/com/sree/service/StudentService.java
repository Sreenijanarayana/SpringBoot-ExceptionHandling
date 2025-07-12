package com.sree.service;

import org.springframework.stereotype.Service;

import com.sree.entity.Student;

@Service
public interface StudentService {

	public abstract Student getstudent(int id);
}
