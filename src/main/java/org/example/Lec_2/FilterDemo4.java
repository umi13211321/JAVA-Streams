package org.example.Lec_2;


import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(2, "Lenevo Laptop", 30000));
        productList.add(new Product(3, "Sony Laptop", 28000));
        productList.add(new Product(4, "Dell Laptop", 23000));
        productList.add(new Product(5, "Microsoft Laptop", 50000));

        productList.stream()
                .filter(p-> p.price>25000)
                .forEach(pr->System.out.println(pr.price));
    }
}
