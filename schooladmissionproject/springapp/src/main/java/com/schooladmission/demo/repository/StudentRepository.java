package com.schooladmission.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooladmission.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findByStudentId(int id);

}
