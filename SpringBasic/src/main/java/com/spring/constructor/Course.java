package com.spring.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	private String coursename;
	
	private double  fees;

	public String getCoursename() {
		return coursename;
	}
	
	@Value("${student.course.courseName}")
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public double getFees() {
		return fees;
	}
	
	@Value("${student.course.fess}")
	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [coursename=" + coursename + ", fees=" + fees + "]";
	}
	
	
}
