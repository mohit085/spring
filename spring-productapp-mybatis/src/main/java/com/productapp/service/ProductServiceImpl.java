package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
		
	}

	
	@Override
	public void updateProduct(double price, int productId) {
		productRepository.updateProduct(price, productId);
		
	}
	

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteProduct(productId);
		
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		Product product = productRepository.findById(productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	@Override
	public List<Product> getByBrand() throws ProductNotFoundException {
		List<Product> productList = productRepository.findByBrand();
		return productList;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		List<Product> productList = productRepository.findByLessPrice(price);
		return productList;
	}

	@Override
	public List<Product> getByCategoryAndPrice(String category, double price) throws ProductNotFoundException {
		List<Product> productList = productRepository.findByCategoryAndPrice(category, price);
		return productList;
	}
	

}
