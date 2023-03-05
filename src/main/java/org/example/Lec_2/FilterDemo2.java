package org.example.Lec_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        //Multiple Conditions
        //String length >= 6    && length <= 8

        List<String> names = Arrays.asList("Umesh", "123456", "1234567", "12345678", "12345", "123456789");

        List<String> list1 = new ArrayList<>();
        list1 = names.stream().filter(str -> str.length()>=6 && str.length()<=8).collect(Collectors.toList());
        System.out.println(list1);

        //Directly Print
        names.stream().filter(str->str.length()>=6 && str.length()<=8).forEach(str->System.out.println(str));
        names.stream().filter(str->str.length()>=6 && str.length()<=8).forEach(System.out::println);


    }
}
