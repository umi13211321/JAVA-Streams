package org.example.Lec_7;

import java.util.Arrays;
import java.util.List;

public class Demo_1 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Umesh", 80),
                new Student("Niket", 89),
                new Student("Shivam", 90),
                new Student("Ekta", 75),
                new Student("Mukesh", 79),
                new Student("Namita", 99),
                new Student("Mohit", 98)
        );

        //Using Stream
        studentList.stream().filter(s->s.getScore()>80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName()+"  "+stu.getScore()));

        //Using Parallel Stream
        studentList.parallelStream().filter(s->s.getScore()>80)
                .limit(3)
                .forEach(stu -> System.out.println(stu.getName()+"  "+stu.getScore()));

    }
}

class Student{
    String name;
    int score;

    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }
}