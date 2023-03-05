package org.example.Lec_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Concatenate Streams
public class Demo_4 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1", "2", "3", "4");
        List<String> list2 = Arrays.asList("A", "B", "C", "D");

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        List<String> finalList = Stream.concat(stream1,stream2).collect(Collectors.toList());

        System.out.println(finalList);
    }


}
