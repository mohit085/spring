package com.insuranceapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exceptions.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService{
	
	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.addInsurace(insurance);
		
	}

	@Override
	public void updateInsurance(int insuranceId ,double premium) {
		insuranceRepository.updateInsurance(insuranceId,premium);
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);
		
	}
	
	@Override
	public Insurance getById(int insuranceId) throws InsuranceNotFoundException {
		Insurance insurance = insuranceRepository.findById(insuranceId);
		return insurance;
	}


	@Override
	public List<Insurance> getAll() {
		List<Insurance> insuranceList = insuranceRepository.findAll();
		return insuranceList;
	}


	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
		List<Insurance> insuranceList = insuranceRepository.findByBrand(brand);
		return insuranceList;
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
		List<Insurance> insuranceList = insuranceRepository.findByBrandAndType(brand, type);
		return insuranceList;
	}

	@Override
	public List<Insurance> getByTypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException {
		List<Insurance> insuranceList = insuranceRepository.findByTypeAndLesserPremium(type, premium);
		return insuranceList;
	}

	

}
