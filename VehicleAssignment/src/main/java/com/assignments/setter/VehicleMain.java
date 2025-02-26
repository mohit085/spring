package com.assignments.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.assignments");
		
		// 1st ways
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		System.out.println(vehicle);
		
		//2nd ways
		vehicle = context.getBean(Vehicle.class);
		
		//3rd ways
		vehicle =context.getBean("vehicle",Vehicle.class);
	}
}
