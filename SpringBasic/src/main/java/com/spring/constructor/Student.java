package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Student {
	
	private String StudentName;
	
	private String department;

	private Course course;
	//her course will be injected using constructor
	//annotation autowired not required
	public Student(Course course) {
		super();
		this.course = course;
	}
	
	
	public String getStudentName() {
		return StudentName;
	}
	
	@Value("${student.name}")
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getDepartment() {
		return department;
	}
	
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", department=" + department + ", course=" + course + "]";
	}

	
	
	
}
