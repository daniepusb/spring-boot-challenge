package com.pdaniel.springbootcapitolechallenge.prices.domain.exceptions;

public class InvalidDataAccessResourceUsageException extends RuntimeException {
    public InvalidDataAccessResourceUsageException(String message) {
        super(message);
    }

    public InvalidDataAccessResourceUsageException(String message, Throwable cause) {
        super(message, cause);
    }
}