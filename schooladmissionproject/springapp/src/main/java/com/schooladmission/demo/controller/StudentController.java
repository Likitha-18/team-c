package com.schooladmission.demo.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schooladmission.demo.model.Student;
import com.schooladmission.demo.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/admin/addStudent")
	public Student saveStudent(@RequestBody Student stu) {
		return service.saveStudent(stu);
	}
	

	@PutMapping("/admin/updateStudent")
	public Student editStudent(@RequestBody Student stu){
		return service.updateStudent(stu);
	}
	
	@DeleteMapping("/admin/deleteStudent")
	public void deleteStudentById(@RequestParam int id) {
			service.deleteStudent(id);	
	}
	
	@GetMapping("/admin/viewStudent")
	public List<Student> viewStudent(){
		return service.viewStudent();
	}
	
	@GetMapping("/admin/getStudent")
	public Student getStudentById(@RequestParam int id) {
		return service.getStudentId(id);
	}

}
