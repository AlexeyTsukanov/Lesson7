package com.company.lesson20.InternetShop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Category{

    private Set<Product> products = new HashSet<>();
    public Category(Product[] product){
        products.addAll(Arrays.asList(product));
    }

    public Set<Product> getProducts() {
        return products;
    }
}