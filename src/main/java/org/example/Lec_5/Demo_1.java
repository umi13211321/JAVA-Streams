package org.example.Lec_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_1 {
    public static void main(String[] args) {

        //Distinct
        List<String> vehicles = Arrays.asList("bus", "car", "train", "boat","bus", "car", "bike");
        List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);

        //Directly Print
        vehicles.stream().distinct().forEach(value->System.out.println(value));

        //Count
        System.out.println(vehicles.stream().distinct().count());

        //Limit
        List<String> list = vehicles.stream().limit(3).collect(Collectors.toList());
        System.out.println(list);
    }
}
