package org.doctorapp.service;

import org.doctorapp.exceptions.DoctorNotFoundExceptions;
import org.doctorapp.exceptions.IdNotFoundExceptions;
import org.doctorapp.model.Doctor;
import org.doctorapp.repository.DoctorRepositoryImpl;
import org.doctorapp.repository.IDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
    private IDoctorRepository doctorRepository;
	
	
    public DoctorServiceImpl(IDoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
    public void addDoctor(Doctor doctor) {

        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {

        doctorRepository.updateDoctor(doctorId,fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {

        doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctorList = doctorRepository.findAll();
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundExceptions{
        List<Doctor> doctorList = doctorRepository.findBySpeciality(speciality);
        if (doctorList.isEmpty())
            throw new DoctorNotFoundExceptions("doctor with this speciality not found");
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndExperience(String speciality,int experience) throws DoctorNotFoundExceptions {
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndExperience(speciality,experience);
        if(doctorList.isEmpty())
            throw  new DoctorNotFoundExceptions("doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Integer)(d2.getExperience())).compareTo(d1.getExperience()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundExceptions {
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndLessFees(speciality,fees);
        if(doctorList.isEmpty())
            throw  new DoctorNotFoundExceptions("doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Double)(d1.getFees())).compareTo(d2.getFees()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundExceptions {
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndRatings(speciality,ratings);
        if(doctorList.isEmpty())
            throw  new DoctorNotFoundExceptions("doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->((Integer)(d1.getRatings())).compareTo(d2.getRatings()));
        return doctorList;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundExceptions {
        List<Doctor> doctorList = doctorRepository.findBySpecialityAndNameContains(speciality,doctorName);
        if(doctorList.isEmpty())
            throw  new DoctorNotFoundExceptions("doctor with this speciality and exp not found");
        Collections.sort(doctorList,(d1,d2)->(d1.getDoctorName()).compareTo(d2.getDoctorName()));
        return doctorList;
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundExceptions {
        Doctor doctor=doctorRepository.findById(doctorId);
        if(doctor==null)
            throw new IdNotFoundExceptions("Invalid id");
        return doctor;
    }
}
