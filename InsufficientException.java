package com.project1.wallet;

public class InsufficientException extends RuntimeException {

    public InsufficientException(String message) {
        super(message);
    }
}
