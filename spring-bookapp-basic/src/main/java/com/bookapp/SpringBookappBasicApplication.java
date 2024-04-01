package com.bookapp;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}
	
	@Autowired
	IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		
		try {
				
				System.out.println("1.Get All books\n"
						+"2.Find book by author\n"
						+"3.find book by category\n"
						+"4.find book by price\n"
						+"5.find book by name and category\n"
						+"6.find book by id\n"
						+"7.Exit");
				System.out.println("Enter Youur choice");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("List of all books");
					for(Book book : bookService.getAll()) {
						System.out.println(book);
					}
					break;
				case 2:
					System.out.println("eneter the author name");
					String authorName=sc.next();
					for(Book book : bookService.getByAuthorStartsWith(authorName)) {
						System.out.println(book);
					}
					break;
				case 3:
					System.out.println("enter the category");
					String category=sc.next();
					for(Book book : bookService.getByCategory(category)) {
						System.out.println(book);
					}
					break;
				case 4:
					System.out.println("enter the price");
					double price = sc.nextDouble();
					for(Book book : bookService.getByPriceLessThan(price)) {
						System.out.println(book);
					}
					break;
				case 5:
					System.out.println("enter author name");
					String author = sc.next();
					System.out.println("enter the category");
					String categoory = sc.next();
					for(Book book : bookService.getByAuthorContainsAndCategory(author,categoory)) {
						System.out.println(book);
					}
					break;
				case 6:
					System.out.println("enter book id");
					int bookId = sc.nextInt();
					System.out.println(bookService.getbyId(bookId));
					break;
				case 7:
					System.exit(0);
					break;
					default:
						System.out.println("Invalid");
						break;
				}
				
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
