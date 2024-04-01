package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	
	@Autowired
	IProductService productService;

	@Override
	public void run(String... args) throws Exception {
		
		
		// add
//		Product product = new Product("iphone","apple",35000.54,"mobile");
//		productService.addProduct(product);
		
//		Product product = new Product("galaxy","samsung",25000,"tab");

		
//		Product product = new Product("ipdad","apple",75000,"tab");
//		productService.addProduct(product);
		
		
		
//		// update
//		productService.updateProduct(38000,1);
		
//		// delete
//		productService.deleteProduct(2);
		
		// getting by id
//		Product product = productService.getById(5);
//		System.out.println(product);
		
		
		// getall
		List<Product> productList =  productService.getAll();
		for(Product product : productList) {
			System.out.println(product);
		}
		
		
	}
	
	

}
