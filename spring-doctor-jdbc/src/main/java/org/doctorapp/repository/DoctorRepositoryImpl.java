package org.doctorapp.repository;

import org.doctorapp.exceptions.IdNotFoundExceptions;
import org.doctorapp.model.Doctor;
import org.doctorapp.service.IDoctorService;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	
	@Autowired
	IDoctorService service;
	
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDoctor(int doctorId, double fess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndExperience(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor findById(int doctorId) throws IdNotFoundExceptions {
		// TODO Auto-generated method stub
		return null;
	}
  
}
