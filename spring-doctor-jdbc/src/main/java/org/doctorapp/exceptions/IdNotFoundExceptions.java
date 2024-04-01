package org.doctorapp.exceptions;

public class IdNotFoundExceptions extends RuntimeException {
    public IdNotFoundExceptions() {
    }

    public IdNotFoundExceptions(String message) {
        super(message);
    }
}
