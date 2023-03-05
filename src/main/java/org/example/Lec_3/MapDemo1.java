package org.example.Lec_3;

import java.util.*;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("Bus", "car", "bicycle", "train");

        //Convert to Upper Case
        List<String> list1 = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(list1);

        //Collect length of all elements
        vehicles.stream().map(name -> name.length()).forEach(len -> System.out.println(len));
        vehicles.stream().map(name -> name.length()).forEach(System.out::println);

        //Read very value and double every value
        List<Integer> numberList = Arrays.asList(2,3,4,5);

        //Using streams-map
        List<Integer> multipliedList = numberList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(multipliedList);

        //Directly Print
        numberList.stream().map(num->num*2).forEach(System.out::println);

    }
}
