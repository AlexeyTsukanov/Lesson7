package com.company.lesson16;

public class Task1 {
    public static void main(String[] args) {
        User user = new User("aaa", "1234");
        user.createQuery();
        User.Query query = user.new Query();
        query.printToLog();
        User.Query query1 = new User("bbb", "1234567").new Query();
        query1.printToLog();

        User.createUser2();

        User.Query2 query2 = new User.Query2();
        query2.printToLog();
    }
}
