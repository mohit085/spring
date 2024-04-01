package com.voya.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.autowiring");
		
		Performer performer = context.getBean(Performer.class);
		
		performer.playSong("G","jab koi baat bigad jaaye");
		performer.playSong("k","Zara sa");
		performer.playSong("V","tum hi ho");

	}

}
