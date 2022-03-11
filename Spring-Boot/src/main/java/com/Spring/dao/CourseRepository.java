package com.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.Courses;

public interface CourseRepository extends JpaRepository<Courses, Integer> {

}
