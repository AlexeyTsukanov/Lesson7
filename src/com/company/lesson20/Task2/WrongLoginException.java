package com.company.lesson20.Task2;

public class WrongLoginException extends Exception {

    public WrongLoginException(String massage) {
        super(massage);
    }

    public WrongLoginException() {
    }
}
