package com.teachmeskills.lesson14.castom_exception;

public class WrongDocNameException extends Exception {

    public WrongDocNameException() {
    }

    public WrongDocNameException(String message) {
        super(message);
    }

}

