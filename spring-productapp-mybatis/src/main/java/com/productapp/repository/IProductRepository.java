package com.productapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

@Mapper
public interface IProductRepository {
	
	
	@Insert("insert into product(productName,brand,price,category) values(#{productName},#{brand},#{price},#{category})")
	void addProduct(Product product);  //create
	
	@Update("update product set price=#{price}  where productId=#{productId}")
	void updateProduct(double price,int productId);  //update
	
	@Delete("delete from product where productId=#{productId}")
	void deleteProduct(int productId); 		//delete
	
	
	@Select("select * from product where productId=#{productId}")
	Product findById(int productId) throws ProductNotFoundException;  //retrieve
	
	
	@Select("select * from product")
	List<Product> findAll(); //retrieve
	
	
	@Select("select * from product where brand=#{brand}")
	List<Product> findByBrand() throws ProductNotFoundException;
	
	
	@Select("select * from product where price=#{price}")
	List<Product> findByLessPrice(double price)  throws ProductNotFoundException;
	
	
	@Select("select * from product where category=#{category} && price=#{price}")
	List<Product> findByCategoryAndPrice(String category,double price)  throws ProductNotFoundException;

}
