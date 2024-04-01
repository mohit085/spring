package com.example.springbasicdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.constructor.Student;
import com.spring.javabased.Waiter;
import com.spring.setter.Employee;



@SpringBootApplication(scanBasePackages = {"com.spring","com.example"})
//@ComponentScan({"com"})

public class SpringBasicDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicDemoApplication.class, args);
	}
	
//	@Autowired
//	 private ApplicationContext context;
	
//	@Autowired
//	Employee employee;
//	
//	@Autowired
//	Student student;
	
	@Autowired
	Waiter waiter;
	
	@Override
	public void run(String... args) throws Exception {
	
//		String[] beans = context.getBeanDefinitionNames();
//		for(String bean : beans) {
//			System.out.println(bean);
//		}
//		System.out.println();
//		
////		Employee emp = context.getBean("employee",Employee.class);
//		System.out.println(employee);
//		
//		System.out.println(student);
		
		List<String> menus = waiter.viewMenu("in");
		for(String menu  : menus) {
			System.out.println(menu);
		}
		
	}
	
	

}
