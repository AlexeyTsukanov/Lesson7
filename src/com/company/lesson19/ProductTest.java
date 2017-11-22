package com.company.lesson19;

import java.util.*;

public class ProductTest extends Sort {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Шапка", 15.7,4.6);
        products[1] = new Product("Куртка", 20.5,3.8);
        products[2] = new Product("Штаны", 18.7,5.1);

        Category clothes = new Category(3,"одежда",products);

        System.out.println("Сортировка по имени:");
        System.out.println(sorted(clothes, productsByName));

        System.out.println("Сортировка по стоимости:");
        System.out.println(sorted(clothes, productsByCost));

        System.out.println("Сортировка по рейтингу:");
        System.out.println(sorted(clothes, productsByRating));

        /*List<Product> clothesCategory = new ArrayList<>(clothes.getProducts());
        clothesCategory.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        System.out.println("Сортировка Compares.sort : " + clothesCategory);*/
    }

    private static TreeSet<Product> sorted(Category clothes, SortedSet<Product> product) {
        product.addAll(clothes.getProducts());
        return (TreeSet<Product>) product;
    }

    public static class Product{
        private String name;
        private double cost;
        private double rating;

        public Product(String name, double cost, double rating){
            this.cost = cost;
            this.name = name;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }

        public double getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", cost=" + cost +
                    ", rating=" + rating +
                    '}';
        }
    }

    public static class Category{
        private List<String > categoryName = new ArrayList<>();
        private List<Integer> number = new ArrayList<>();
        private Set<Product> products = new HashSet<>();
        public Category(int number,String categoryName, Product... product){
                for (int i = 0; i < product.length; i++){
                    products.add(product[i]);
                    this.categoryName.add(categoryName);
                    this.number.add(number);
                }
        }

        public Set<Product> getProducts() {
            return products;
        }
    }
}
