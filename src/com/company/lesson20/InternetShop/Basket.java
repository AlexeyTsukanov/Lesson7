package com.company.lesson20.InternetShop;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    private static Basket instance;
    private Set<Product> products = new HashSet<>();
    private Basket(){}

    public static Basket getInstance(){
        if (instance == null){
            instance = new Basket();
        }
        return instance;
    }

    public void setProducts(Product products) {
        this.products.add(products);
    }

    public Set<Product> getProducts() {
        return products;
    }
}
