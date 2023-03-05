package org.example.Lec_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 23, 1, 2, 3, 45, 3, 2, 0, 5);
        List<Integer> evenNumberList = new ArrayList<>();

        //Without Streams
        for(int n:numberList){
            if(n%2==0){
                evenNumberList.add(n);
            }
        }
        System.out.println(evenNumberList);

        //With Streams
        List<Integer> evenNumberList2 = new ArrayList<>();
        evenNumberList2 = evenNumberList.stream().filter(n->(n%2==0)).collect(Collectors.toList());
        System.out.println(evenNumberList2);

        //Directly Print
        numberList.stream().filter(n->(n%2==0)).forEach(n->System.out.println(n));
        numberList.stream().filter(n->(n%2==0)).forEach(System.out::println);
    }
}
