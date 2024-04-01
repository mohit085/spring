package com.example.springbootautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.autowiring.ShapeFactory;


@SpringBootApplication(scanBasePackages = {"com.example"})
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	
	@Autowired
	ShapeFactory shapeFactory;

	@Override
	public void run(String... args) throws Exception {
		
		shapeFactory.area("r",2,4);
		shapeFactory.area("s",2,4);
		shapeFactory.area("t",2,4);
	}

}
