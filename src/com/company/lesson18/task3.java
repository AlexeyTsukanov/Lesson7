package com.company.lesson18;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Set<String> listFirst = new HashSet<>();
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");

        Set<String> listSecond = new HashSet<>();

        listSecond.add("Green");
        listSecond.add("Red");
        listSecond.add("White");

        System.out.println(test.intersect(listFirst, listSecond));
        System.out.println(test.union(listFirst, listSecond));

    }

    public static class test {
        public static Set<?> intersect(Set<?> set1, Set<?> set2) {
            Set<?> set3 = new HashSet<>(set1);
            set3.retainAll(set2);
            return set3;
        }

        public static Set<?> union(Set<?> set1, Set<?> set2) {
            HashSet set3 = new HashSet<>(set1);
            set3.addAll(set2);
            return set3;
        }
    }
}

