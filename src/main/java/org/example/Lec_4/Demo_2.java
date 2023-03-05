package org.example.Lec_4;
import java.util.*;
import java.util.stream.Collectors;

public class Demo_2 {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Umesh", "Shivam", "Sachin");
        List<String> teamB = Arrays.asList("Udit", "Prajwal", "Harsha");
        List<String> teamC = Arrays.asList("Yamini", "Prashanti", "Sneha");

        List<List<String>> allPlayers = Arrays.asList(teamA, teamB, teamC);
        List<String> finalList = allPlayers.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
