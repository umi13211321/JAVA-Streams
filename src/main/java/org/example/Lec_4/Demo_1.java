package org.example.Lec_4;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_1 {
    public static void main(String[] args) {

        //map()
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list2);

        //flatmap()
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);
        List<Integer> finalResult = finalList.stream().flatMap(x->x.stream().map(n->n+100)).collect(Collectors.toList());
        System.out.println(finalResult);
    }
}
