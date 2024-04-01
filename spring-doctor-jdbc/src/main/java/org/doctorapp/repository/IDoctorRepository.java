package org.doctorapp.repository;

import org.doctorapp.exceptions.IdNotFoundExceptions;
import org.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
	
	//admin
    void addDoctor(Doctor doctor);  //create
    void updateDoctor(int doctorId,double fess); //update
    void deleteDoctor(int doctorId); //delete

    
    // user
    List<Doctor> findAll();

    List<Doctor> findBySpeciality(String speciality);

    List<Doctor> findBySpecialityAndExperience(String speciality,int experience);

    List<Doctor> findBySpecialityAndLessFees(String speciality, double fees);

    List<Doctor> findBySpecialityAndRatings(String speciality,int ratings);

    List<Doctor> findBySpecialityAndNameContains(String speciality,String doctorName);

    Doctor findById(int doctorId) throws IdNotFoundExceptions; //retrieve
}
