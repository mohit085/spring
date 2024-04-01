package com.insuranceapp;

//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.insuranceapp.model.Insurance;
//import com.insuranceapp.service.IInsuranceService;




@SpringBootApplication
public class SpringInsuranceappRestmybatisApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatisApplication.class, args);
	}
	
	
//	@Autowired
//	IInsuranceService insuranceService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Insurance insurance  = new Insurance("V0-H001","Voya","health",10,1000);
//		insuranceService.addInsurance(insurance);
		
//		List<Insurance> insurances = insuranceService.getAll();
//		for(Insurance insurance : insurances ) {
//			System.out.println(insurance);
//		}
//		
	}

}
