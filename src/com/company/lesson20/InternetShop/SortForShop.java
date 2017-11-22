package com.company.lesson20.InternetShop;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class SortForShop {
    public static SortedSet<Product> productsByName = new TreeSet<>(new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    public static SortedSet<Product> productsByCost = new TreeSet<>(new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            double d = o1.getCost() - o2.getCost();
            return check(d);
        }
    });
    public static SortedSet<Product> productsByRating = new TreeSet<>(new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            double d = o1.getRating() - o2.getRating();
            return check(d);
        }
    });

    private static int check(double d) {
        if (d >= 0.1) {
            return 1;
        }
        if (d <= -0.1) {
            return -1;
        }
        return 0;
    }
}
