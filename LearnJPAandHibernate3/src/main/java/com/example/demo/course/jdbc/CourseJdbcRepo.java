package com.example.demo.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.course.Course;

@Repository // it will talk to the data from spring
public class CourseJdbcRepo {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String Insert_Query =
			"""
				INSERT INTO Course VALUES (?, ?, ?);

			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(Insert_Query, course.getId(), course.getName(), course.getAuthor());
	}
}
