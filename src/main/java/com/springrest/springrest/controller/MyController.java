package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseService; 
	
	@GetMapping("/home")	//GET Mapping TEST
	public String home() {
		return "This is home page";	
	}
	
	//GET Courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		return this.courseService.getCourses();
	}
	
	
	//GET Course through courseid
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	//Adding new Course
	/* @PostMapping(path="/courses", consumes="application/json") */
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course){
		
		return this.courseService.addCourse(course);
	}
	
	//Put Mapping
	
	
	//Delete Mapping
}
