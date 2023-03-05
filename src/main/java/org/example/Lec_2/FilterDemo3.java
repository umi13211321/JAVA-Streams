package org.example.Lec_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {

        //Filter null values for
        List<String> words = Arrays.asList("1", "2", null, "13223", "ABC", null, null);

        List<String> list1 = words.stream().filter(w-> w!=null).collect(Collectors.toList());
        System.out.println(list1);



    }
}
