package com.doctorapp.repository;

import com.doctorapp.exceptions.IdNotFoundExceptions;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void addDoctor(Doctor doctor) {
        // establish connection
        //create a prepared statement
        //  set values for placeholders
        // call execute
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ) {
            statement.setString(1, doctor.getDoctorName());
            statement.setString(2, doctor.getSpeciality());
            statement.setInt(3, doctor.getExperience());
            statement.setInt(4, doctor.getRatings());
            statement.setDouble(5, doctor.getFees());

            // call execute
            boolean result = statement.execute();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {
            statement.setInt(2, doctorId);
            statement.setDouble(1, fees);
            int result = statement.executeUpdate();
            System.out.println("one row updated " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);
        ) {
            statement.setInt(1, doctorId);
            boolean result = statement.execute();
            System.out.println("one row deleted " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Doctor> findAll() {
        //create  empty list
        // establish connection
        //  create a prepared statement
        // call executequery
        //iterate resultset  // get column values
        // create a doctor object and set values of column using setter
        // add doctor to lit(inside loop)
        // retrun doctorList
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
             ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Integer doctorId = resultSet.getInt("doctorId");
                String doctorName = resultSet.getString("doctorName");
                String speciality = resultSet.getString("speciality");
                double fees = resultSet.getInt("fees");
                int ratings = resultSet.getInt("ratings");
                int experience = resultSet.getInt("experience");
                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
                doctorList.add(doctor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpeciality(String speciality) {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
        ) {
            statement.setString(1, speciality);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Integer doctorId = resultSet.getInt("doctorId");
                    String doctorName = resultSet.getString("doctorName");
                    double fees = resultSet.getInt("fees");
                    int ratings = resultSet.getInt("ratings");
                    int experience = resultSet.getInt("experience");
                    Doctor doctor = new Doctor();

                    doctor.setDoctorId(doctorId);
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setFees(fees);
                    doctor.setRatings(ratings);
                    doctor.setExperience(experience);
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndExperience(String speciality, int experience) {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDEX);
        ) {
            statement.setString(1, speciality);
            statement.setInt(2, experience);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Integer doctorId = resultSet.getInt("doctorId");
                    String doctorName = resultSet.getString("doctorName");
                    double fees = resultSet.getInt("fees");
                    int ratings = resultSet.getInt("ratings");
                    Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
                    doctorList.add(doctor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDFEES);
        ) {
            statement.setString(1, speciality);
            statement.setDouble(2, fees);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Integer doctorId = resultSet.getInt("doctorId");
                    String doctorName = resultSet.getString("doctorName");
                    int ratings = resultSet.getInt("ratings");
                    int experience = resultSet.getInt("experience");
                    Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
                    doctorList.add(doctor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDRATINGS);
        ) {
            statement.setString(1, speciality);
            statement.setInt(2, ratings);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Integer doctorId = resultSet.getInt("doctorId");
                    String doctorName = resultSet.getString("doctorName");
                    double fees = resultSet.getInt("fees");
                    int experience = resultSet.getInt("experience");
                    Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
                    doctorList.add(doctor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
        List<Doctor> doctorList = new ArrayList<>();
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ) {
            statement.setString(1, speciality);
            statement.setString(2, "%" + doctorName + "%");
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()) {
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctorName"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experience"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctorId"));
                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    @Override
    public Doctor findById(int doctorId) throws IdNotFoundExceptions {
        Doctor doctor=null;
        try (
                Connection connection = DoctorDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);
        ) {
            statement.setInt(1,doctorId);
            try (
                    ResultSet resultSet = statement.executeQuery();
            ) {
                while (resultSet.next()){
                    String doctorName = resultSet.getString("doctorName");
                    String speciality = resultSet.getString("speciality");
                    double fees = resultSet.getInt("fees");
                    int ratings = resultSet.getInt("ratings");
                    int experience = resultSet.getInt("experience");
                    doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctor;
    }
}
