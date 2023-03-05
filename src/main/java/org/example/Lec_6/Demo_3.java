package org.example.Lec_6;

import java.util.*;

//findAny()
//findMany()
public class Demo_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "One");
        Optional<String> ele1 = list.stream().findAny();
        System.out.println(ele1.get());

        Optional<String> ele2 = list.stream().findFirst();
        System.out.println(ele2.get());
    }
}
