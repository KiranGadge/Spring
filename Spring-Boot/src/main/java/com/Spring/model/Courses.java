package com.Spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	private int course_id;
	private String course_name;
	private int students;

	public Courses() {

	}

	public Courses(int course_id, String course_name, int students) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.students = students;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Courses has--> course id=" + course_id + "\n, course name=" + course_name + "\n, No of students="
				+ students;
	}

}
