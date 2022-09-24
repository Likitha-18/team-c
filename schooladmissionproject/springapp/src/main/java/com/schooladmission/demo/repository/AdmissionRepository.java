package com.schooladmission.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooladmission.demo.model.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Integer> {

}
