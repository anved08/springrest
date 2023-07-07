package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;


@Service
public class CourseServiceImpl implements CourseServices {
	
	List<Courses> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Courses(123,"Java","Funny 123"));
		list.add(new Courses(456,"C and C++","C and C++ 123"));
		list.add(new Courses(789,"Python","Python 123"));
	}
	
	
	@Override//Getting all courses
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub	
		return list;
	}
	
	@Override//Getting Course through courseid
	public Courses getCourse(long courseId) {
		Courses cs=null;
		 
		for(Courses cst:list) {
			if(cst.getId()==courseId) {
				cs=cst;
				break;
			}
		}
		return cs;
	}
	@Override//Adding Course
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}
	

}
