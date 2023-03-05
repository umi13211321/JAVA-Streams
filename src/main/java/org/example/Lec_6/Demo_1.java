package org.example.Lec_6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_1 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,34,1,43,-12,2,0,2);
        List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list3);

        List<String> list4 = Arrays.asList("Umesh", "Niket", "Shivam", "Mukesh");
        List<String> list5 = list4.stream().sorted().collect(Collectors.toList());
        System.out.println(list5);

        List<String> list6 = list4.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list6);


    }
}
