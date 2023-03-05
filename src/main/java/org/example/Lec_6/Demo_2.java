package org.example.Lec_6;

import java.util.*;
//anyMatch()
//allMatch()
//noneMatch()
public class Demo_2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("One Apple");
        fruits.add("One Mango");
        fruits.add("Two Apples");
        fruits.add("More Grapes");
        fruits.add("Two Guavas");

        boolean result1 = fruits.stream().anyMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result1);

        boolean result2 = fruits.stream().allMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result2);

        boolean result3 = fruits.stream().noneMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result3);

    }
}
