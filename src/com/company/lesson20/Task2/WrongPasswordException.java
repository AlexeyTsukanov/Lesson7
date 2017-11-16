package com.company.lesson20.Task2;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String massage) {
        super(massage);
    }

    public WrongPasswordException() {
    }
}
