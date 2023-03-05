package org.example.Lec_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo_3 {
    public static void main(String[] args) {
        List<Student> studentList1 = Arrays.asList(
                new Student(1, "Umesh", 'A'),
                new Student(2, "Niket", 'B'),
                new Student(3, "Shivam", 'C'),
                new Student(4, "Ekta", 'D')
        );

        List<Student> studentList2 = Arrays.asList(
                new Student(5, "Sachin", 'A'),
                new Student(6, "Shivam", 'B'),
                new Student(7, "Prajwal", 'C'),
                new Student(8, "Harsha", 'D')
        );

        List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
        List<String> names = studentList.stream().flatMap(list->list.stream()).map(s->s.name).collect(Collectors.toList());
        System.out.println(names);
    }
}

class Student{
    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
