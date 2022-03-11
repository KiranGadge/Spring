package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Spring.dao.CourseDao;
import com.Spring.model.Courses;

@Controller
public class CoursesController {

	@Autowired
	private CourseDao cdao;

	@GetMapping(value = "/")
	public String getAllCourses(Model m) {
		List<Courses> Cousrses_list = cdao.findAll();
		System.out.println(Cousrses_list);
		m.addAttribute("Cousrses_list", Cousrses_list);
		return "Cousrses_list";
	}

	@PostMapping(value = "/add")
	public String addCourse(@ModelAttribute("add") Courses courses) {
		cdao.save(courses);
		return "redirect:/";
	}

	@PostMapping(value = "/index")
	public String add() {
		return "index";
	}

	@GetMapping(value = "/get/{course_id}")
	public String getcourse(@PathVariable int course_id, Model m) {
		Courses c = cdao.getById(course_id);
		m.addAttribute("course", c);
		return "index";
	}

}
