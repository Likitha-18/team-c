package com.schooladmission.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schooladmission.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
