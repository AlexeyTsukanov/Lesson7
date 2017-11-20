package com.company.lesson21;

import com.company.lesson20.task2.WrongLoginException;
import com.company.lesson20.task2.WrongPasswordException;

public class ConfirmTest {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(ConfirmTest.confirmUser("log1", "12345f", "12345f"));
        System.out.println(ConfirmTest.confirmUser("asjfiasufihauisfiuashfiuhaiupsfhasfh", "123gg45f", "12345f"));
        System.out.println(ConfirmTest.confirmUser("log1", "12345fff", "12345fe"));
        System.out.println(ConfirmTest.confirmUser("log1", "12345f", "123sdfsdf45f"));
    }

    public static boolean confirmUser(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        try {
            if (password.equals(confirmPassword) && login.length() < 20 && password.length() < 20) {
                return true;
            } else if (login.length() >= 20) {
                throw new WrongLoginException("Login is not correct.");
            } else {
                throw new WrongPasswordException("Passwords are not equals.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Login: " + login);
            System.out.println("Password: " + password);
            System.out.println("Confirm password: " + confirmPassword);
        }
    }
}

