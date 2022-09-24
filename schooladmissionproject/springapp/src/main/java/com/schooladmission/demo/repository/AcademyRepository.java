package com.schooladmission.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooladmission.demo.model.Academy;

public interface AcademyRepository extends JpaRepository<Academy, Integer> {

}
