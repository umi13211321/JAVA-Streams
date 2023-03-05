package org.example.Lec_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo_3 {
    public static void main(String[] args) {

        //reduce
        List<String> list = Arrays.asList("A","B","C","1","2");
        Optional<String> reducedString = list.stream().reduce((value,combinedValue)->
        {
            return combinedValue+value;
        });

        System.out.println(reducedString.get());
    }
}
