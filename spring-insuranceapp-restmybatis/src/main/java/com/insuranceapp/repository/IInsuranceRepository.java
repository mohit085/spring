package com.insuranceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insuranceapp.exceptions.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;



@Mapper
public interface IInsuranceRepository {
	
	@Insert("insert into insurance(policyName,brand,type,duration,premium) values(#{policyName},#{brand},#{type},#{duration},#{premium})")
	void addInsurace(Insurance insurance);  //create
	
	@Update("update insurance set premium=#{premium}  where insuranceId=#{insuranceId}")
	void updateInsurance(int insuranceId,double premium);  //update
	
	@Delete("delete from insurance where insuranceId=#{insuranceId}")
	void deleteInsurance(int insuranceId); 		//delete
	
	
	@Select("select * from insurance where insuranceId=#{insuranceId}")
	Insurance findById(int insuranceId) throws InsuranceNotFoundException;  //retrieve
	
	
	
	@Select("select * from insurance")
	@Results({
				@Result(property = "insuranceId", column = "insuranceId"),
				@Result(property = "policyName", column = "policyName")
	})
	List<Insurance> findAll(); //retrieve
	
	@Select("select * from insurance where brand=#{brand}")
	List<Insurance> findByBrand(String brand) throws InsuranceNotFoundException;
	
	
	@Select("select * from insurance where brand=#{brand}  &&  type=#{type}")
	List<Insurance> findByBrandAndType(String brand,String type)  throws InsuranceNotFoundException;
	
	
	@Select("select * from insurance where type=#{type} && premium<=#{premium}")
	List<Insurance> findByTypeAndLesserPremium(String type,double premium)  throws InsuranceNotFoundException;
	
}
