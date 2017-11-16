package com.company.lesson19;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class Sort {
    public static SortedSet<ProductTest.Product> productsByName = new TreeSet<>(new Comparator<ProductTest.Product>() {
        @Override
        public int compare(ProductTest.Product o1, ProductTest.Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    public static SortedSet<ProductTest.Product> productsByCost = new TreeSet<>(new Comparator<ProductTest.Product>() {
        @Override
        public int compare(ProductTest.Product o1, ProductTest.Product o2) {
            double d = o1.getCost() - o2.getCost();
            if (d >= 0.1){
                return 1;
            }
            if (d <= -0.1){
                return -1;
            }
            return 0;
        }
    });
    public static SortedSet<ProductTest.Product> productsByRating = new TreeSet<>(new Comparator<ProductTest.Product>() {
        @Override
        public int compare(ProductTest.Product o1, ProductTest.Product o2) {
            double d = o1.getRating() - o2.getRating();
            if (d >= 0.1) {
                return 1;
            }
            if (d <= -0.1) {
                return -1;
            }
            return 0;
        }
    });
}
