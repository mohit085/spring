package org.doctorapp.exceptions;

public class DoctorNotFoundExceptions extends RuntimeException{
    public DoctorNotFoundExceptions() {
    }

    public DoctorNotFoundExceptions(String message) {
        super(message);
    }
}
