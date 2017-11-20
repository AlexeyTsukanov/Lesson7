package com.company.lesson20.task2;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String massage) {
        super(massage);
    }

    public WrongPasswordException() {
    }
}
