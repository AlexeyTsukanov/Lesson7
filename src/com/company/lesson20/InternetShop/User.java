package com.company.lesson20.InternetShop;

import com.company.lesson20.task2.WrongLoginException;
import com.company.lesson20.task2.WrongPasswordException;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static Map map = new HashMap<String,String>();
    private static boolean isLogin;

    public static boolean isLoginCheck(){
        return isLogin;
    }

    public static void makeLogIn(String login, String password){
        if (map.isEmpty()){}
        else if (map.containsKey(login)){
            if (password.equals(map.get(login))){
                isLogin = true;
            }
            else {
                System.out.println("Данного логина не существует.");
            }
        }
    }

    public static void registrationUser(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        try {
            if (password.equals(confirmPassword) && login.length() < 20 && password.length() < 20) {
                map.put(login,password);
                isLogin = true;
            } else if (login.length() >= 20) {
                throw new WrongLoginException("Login is not correct.");
            } else {
                throw new WrongPasswordException("Passwords are not equals.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Login: " + login);
            System.out.println("Password: " + password);
            System.out.println("Confirm password: " + confirmPassword);
        }
    }
}
