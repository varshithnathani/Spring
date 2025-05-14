package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// used devtools in spring to get update as soon as save the file/Application
@RestController
public class Controller {

	// courses
	// course: id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourse(){
		return Arrays.asList(
				new Course(1," Java ", "James Gosling"),
				new Course(2," Spring "," Rod"),
				new Course(3, "Spring- Dev-Tools","Rod")
				);
	}
}
