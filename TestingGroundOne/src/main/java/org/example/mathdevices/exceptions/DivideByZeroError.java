package org.example.mathdevices.exceptions;

public class DivideByZeroError extends Exception {
    public DivideByZeroError(String errorMessage) {
        super(errorMessage);
    }
    public DivideByZeroError(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
