package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.course.jdbc.CourseJdbcRepo;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepo repo;
	
	
	@Override
	public void run(String... args) throws Exception {

		repo.insert();
	}

}
