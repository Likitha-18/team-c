package com.schooladmission.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schooladmission.demo.model.Admission;
import com.schooladmission.demo.service.AdmissionService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdmissionController {

	@Autowired
	private AdmissionService service;
	
	@PostMapping("/user/addAdmission")
	public Admission addAdmission(@RequestBody Admission admission) {
		return service.saveAdmission(admission);
	}
	
	@GetMapping("/user/viewAdmission")
	public List<Admission> findAdmission(){
		return service.showAdmission();
	}
	
	@DeleteMapping("/user/deleteAdmission")
	public void deleteAdmission(@RequestParam int id) {
			service.deleteAdmission(id);	
	}
}
