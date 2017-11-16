package com.company.lesson20;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 34);
        Toy toy2 = new Toy("Car", 54);
        Toy toy3 = new Toy("Box", 64);

        Map<String, Toy> toys = new TreeMap<>();
        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);

        iterateEntries(toys);

        iterateKeys(toys);

        iterateValues(toys);


    }

    private static void iterateValues(Map<String, Toy> toys) {
        Collection<Toy> collection = toys.values();
        for (Toy toy : collection){
            System.out.print(toy);
        }
    }

    private static void iterateKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        for (String key : set){
            System.out.print("Key : " + key + ", ");
            System.out.println("Value : " + toys.get(key));
        }
    }

    private static void iterateEntries(Map<String, Toy> toys) {
        Set<Map.Entry<String ,Toy>> set = toys.entrySet();
        for (Map.Entry<String , Toy> entry :set){
            System.out.print(entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }
    }

    public static class Toy {
        private String name;
        private int сost;

        public Toy(String name, int сost) {
            this(name);
            this.сost = сost;
            System.out.println("In constructor with two parameters");
        }

        public Toy(String name) {
            this();
            this.name = name;
            System.out.println("In constructor with one parameter");
        }

        public Toy() {
            System.out.println("In default constructor");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getСost() {
            return сost;
        }

        public void setСost(int сost) {
            this.сost = сost;
        }

        @Override
        public String toString() {
            return "Toy{" +
                    "name='" + name + '\'' +
                    ", сost=" + сost +
                    '}';
        }
    }
}
