package com.company.lesson20.InternetShop;

import com.company.lesson20.task2.WrongLoginException;
import com.company.lesson20.task2.WrongPasswordException;

import java.util.*;

public abstract class ShopBody extends SortForShop {
    public static Map<String, Category> fillShop() {
        Product[] products1 = new Product[3];
        products1[0] = new Product("Шапка", 15.7, 4.6);
        products1[1] = new Product("Куртка", 20.5, 3.8);
        products1[2] = new Product("Штаны", 18.7, 5.1);

        Category clothes = new Category(products1);

        Product[] products2 = new Product[3];
        products2[0] = new Product("Машинка", 15.7, 4.6);
        products2[1] = new Product("Кукла", 20.5, 3.8);
        products2[2] = new Product("Мячь", 18.7, 5.1);

        Category toys = new Category(products2);

        Product[] products3 = new Product[3];
        products3[0] = new Product("LG", 15.7, 4.6);
        products3[1] = new Product("Samsung", 20.5, 3.8);
        products3[2] = new Product("Iphone", 18.7, 5.1);

        Category phones = new Category(products3);

        Map<String, Category> catalog = new HashMap<>();
        catalog.put("Одежда", clothes);
        catalog.put("Игрушки", toys);
        catalog.put("Телефоны", phones);

        return catalog;
    }

    public static void makeDecision(Scanner scn) throws WrongLoginException, WrongPasswordException {
        System.out.println("1. Просмотр каталога.");
        System.out.println("2. Регестрация.");
        System.out.println("3. Вход.");
        System.out.println("4. Войти в карзину.");
        int i = scn.nextInt();
        if (i < 5 | i > 1) {
            switch (i) {
                case 1:
                    Map map = ShopBody.fillShop();
                    Set<String> list = map.keySet();
                    for (String o : list) {
                        System.out.println(o);
                    }
                    while (true) {
                        System.out.println("Введите интересующий Вас раздел.");
                        String s = scn.next();
                        if (map.containsKey(s)) {
                            Category category = (Category) map.get(s);
                            Set<Product> products = category.getProducts();
                            for (Product product : products) {
                                System.out.println(product);
                            }
                            while (true) {
                                System.out.println("Выберете действие.");
                                System.out.println("1. Отсортировать по цене.");
                                System.out.println("2. Отсортировать по отсортировать по рейтингу.");
                                System.out.println("3. Отсортировать по отсортировать по названию.");
                                System.out.println("4. Добывить товар в корзину.");
                                System.out.println("5. Выйти из каталога.");
                                int s1 = scn.nextInt();
                                if (s1 > 0 | s1 < 5) {
                                    switch (s1) {
                                        case 1:
                                            sort(category, productsByCost);
                                            break;
                                        case 2:
                                            sort(category, productsByRating);
                                            break;
                                        case 3:
                                            sort(category, productsByName);
                                            break;
                                        case 4:
                                            System.out.println("Введите название товара.");
                                            String name = scn.next();
                                            for (Product product : category.getProducts()) {
                                                if (name.equals(product.getName())) {
                                                    Basket.getInstance().setProducts(product);
                                                }
                                            }
                                            break;
                                        case 5:
                                            return;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Данного каталога не существует!");
                            System.out.println("Пповторить попытку? Y/N");
                            String s1 = scn.next();
                            if (s1.equals("N")) {
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите логин!");
                    String log = scn.next();
                    System.out.println("Введите пароль!");
                    String pass = scn.next();
                    System.out.println("Повторите пароль пароль!");
                    String confirmPass = scn.next();
                    User.registrationUser(log, pass, confirmPass);
                    break;
                case 3:
                    System.out.println("Введите логин!");
                    String logForIn = scn.next();
                    System.out.println("Введите пароль!");
                    String passForIn = scn.next();
                    User.makeLogIn(logForIn, passForIn);
                    break;
                case 4:
                    if (Basket.getInstance().getProducts().isEmpty()) {
                        System.out.println("Ваша корзина пуста!");
                    } else {
                        System.out.println("Товары в корзине: ");
                        for (Product product : Basket.getInstance().getProducts()) {
                            System.out.println(product);
                        }
                        System.out.println("Перейти к покупке? Y/N");
                        String i1 = scn.next();
                        if (i1.equals("Y")) {
                            if (User.isLoginCheck()) {
                                System.out.println("Вы приобрели товары!");
                            } else {
                                System.out.println("Вы не залогинились!");
                            }
                        }
                    }
            }
        } else {
            System.out.println("Вы ввели не правельное число. Повторите попытку.");
        }
    }

    private static void sort(Category category, SortedSet<Product> products) {
        TreeSet<Product> sorted = sorted(category, products);
        for (Product product : sorted) {
            System.out.println(product);
        }
    }

    private static TreeSet<Product> sorted(Category clothes, SortedSet<Product> product) {
        product.addAll(clothes.getProducts());
        return (TreeSet<Product>) product;
    }
}
