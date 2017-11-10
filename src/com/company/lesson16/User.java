package com.company.lesson16;

public class User {
    private static String login;
    private static String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    static class Query2 {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + ", и паролем: " + password + " отправил запрос.");
        }
    }

    class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + ", и паролем: " + password + " отправил запрос.");
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void createUser2() {
        class User2 {
            public void printLog() {
                System.out.println("Пользователь с логином: " + login + ", и паролем: " + password + " отправил запрос.");
            }
        }
        User2 user2 = new User2();
        user2.printLog();
    }
}
