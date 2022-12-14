package com.schooladmission.demo.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooladmission.demo.model.Student;
import com.schooladmission.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public List<Student> viewStudent() {
		return repository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return repository.save(student);
	}
	
	public void deleteStudent(int id) {
		repository.deleteById(id);
	}
	
	public Student updateStudent(Student student) {
		Student existingStudent = repository.findByStudentId(student.getStudentId());
		existingStudent.setStudentId(student.getStudentId());
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setMobileNumber(student.getMobileNumber());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setStudentDOB(student.getStudentDOB());
		existingStudent.setAge(student.getAge());
		return repository.save(existingStudent);
	}
	
	public Student getStudentId(int id) {
		return repository.findByStudentId(id);
	}

	
}
