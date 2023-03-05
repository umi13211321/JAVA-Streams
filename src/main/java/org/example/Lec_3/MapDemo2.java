package org.example.Lec_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
        //Combine Filter and map
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Umesh", 10000),
                new Employee(102, "Niket", 20000),
                new Employee(103, "Shivam", 30000),
                new Employee(104, "Mukesh", 40000),
                new Employee(105, "Mohit", 50000)
        );

        //Collection --> stream --> Filter --> map --> collect
        //salary > 20000 -->
        List<Integer> salartList = employeeList.stream()
                .filter(e-> e.salary>20000) //filtering
                .map(e->e.salary)
                .collect(Collectors.toList());

        System.out.println(salartList);
    }
}

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}
