package com.doctorapp.repository;

import com.doctorapp.exceptions.IdNotFoundExceptions;
import com.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fess);
    void deleteDoctor(int doctorId);


    List<Doctor> findAll();

    List<Doctor> findBySpeciality(String speciality);

    List<Doctor> findBySpecialityAndExperience(String speciality,int experience);

    List<Doctor> findBySpecialityAndLessFees(String speciality, double fees);

    List<Doctor> findBySpecialityAndRatings(String speciality,int ratings);

    List<Doctor> findBySpecialityAndNameContains(String speciality,String doctorName);

    Doctor findById(int doctorId) throws IdNotFoundExceptions;
}
