package com.company.lesson20.task10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PetsTest {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();

        pets.put("Kesha", new Parrot("Kesha"));
        pets.put("Bobik", new Dog("Bobik"));
        pets.put("Murzik", new Parrot("Murzik"));

        showKeys(pets);
    }

    private static void showKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
