package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring.dao.CourseRepository;
import com.Spring.model.Courses;

@Controller
public class CoursesController {

	private CourseRepository courseRepository;

	
	@PostMapping
	public Courses add(@RequestBody final Courses courses) {
		return courseRepository.saveAndFlush(courses);
	}

	
	@RequestMapping("/list")
	@GetMapping
	public List<Courses> list() {
		return courseRepository.findAll();

	}

	@RequestMapping("{id}")
	@GetMapping()
	public Courses getById(@PathVariable Integer id) {
		return courseRepository.getById(id);
	}
}
