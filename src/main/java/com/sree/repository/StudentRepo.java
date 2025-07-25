package com.sree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sree.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
