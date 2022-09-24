package com.schooladmission.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schooladmission.demo.model.Admission;
import com.schooladmission.demo.repository.AdmissionRepository;

@Service
public class AdmissionService {

	@Autowired
	private AdmissionRepository repository;
	
	public Admission saveAdmission(Admission admission) {
		return repository.save(admission);
	}
	
	public List<Admission> showAdmission() {
		return repository.findAll();
	}
	
	public void deleteAdmission(int id) {
		repository.deleteById(id);
	}
}
