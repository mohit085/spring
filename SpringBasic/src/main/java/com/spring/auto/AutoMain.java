package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {
	public static void main(String[] args) {
		
		ApplicationContext  context = new AnnotationConfigApplicationContext("com.spring.auto");
		
		ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		
		shapeFactory.area("s",2,6);
		shapeFactory.area("r",2,6);
		shapeFactory.area("t",2,6);
	}
}
