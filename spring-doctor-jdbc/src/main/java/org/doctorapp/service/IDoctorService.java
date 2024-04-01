package org.doctorapp.service;

import java.util.*;

import org.doctorapp.exceptions.DoctorNotFoundExceptions;
import org.doctorapp.exceptions.IdNotFoundExceptions;
import org.doctorapp.model.Doctor;

public interface IDoctorService {

    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);



    List<Doctor> getAll();

    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundExceptions;

    List<Doctor> getBySpecialityAndExperience(String speciality,int experience) throws DoctorNotFoundExceptions;

    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundExceptions;

    List<Doctor> getBySpecialityAndRatings(String speciality,int ratings) throws DoctorNotFoundExceptions;

    List<Doctor> getBySpecialityAndNameContains(String speciality,String doctorName) throws DoctorNotFoundExceptions;

    Doctor getById(int doctorId) throws IdNotFoundExceptions;
}
