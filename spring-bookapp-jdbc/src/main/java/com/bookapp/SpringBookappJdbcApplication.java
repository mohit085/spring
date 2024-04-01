package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements  CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
	
	@Autowired
	private IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println();
		bookService.getAll().forEach(System.out::println);
		
//		System.out.println();
//		bookService.getByAuthorStartsWith("Robin").forEach(System.out::println);  //error
		
		System.out.println();
		bookService.getByPriceLessThan(500).forEach(System.out::println);
		
		System.out.println();
		bookService.getAll().forEach(System.out::println);
		
		System.out.println();
		System.out.println(bookService.getbyId(1));
		
	}
	
	
	
}
