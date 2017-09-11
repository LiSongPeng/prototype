package com.prototype.exception;

/**
 * 封装异常
 */
public class PersonException extends RuntimeException {
    public PersonException(String message) {
        super(message);
    }

    public PersonException(String message, Throwable cause) {
        super(message, cause);
    }
}
