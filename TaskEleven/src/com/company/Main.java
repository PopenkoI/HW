package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        String[] name = new String[]{"Tom", "Bob", "Lili", "Fred", "Maria"};
        int[] course = new int[]{1, 2, 2, 5, 4};

        Student s;
        for (int i = 0; i < 5; ++i) {
            s = new Student(name[i], course[i]);
            students.add(s);
        }

        //System.out.println(students.get(0).compareCourse(students.get(1)));
        //students.get(0).printStudents(students,1);

        System.out.println();
        for (Object person : students) {
            System.out.println(person);
        }

        students.sort(new sortedByName());
        System.out.println("\n~~~ Сортування по імені");

        for (Student product : students)
            System.out.println(product.toString());

        students.sort(new sortedByCourse());
        System.out.println("\n~~~ Сортування по курсах");

        for (Student product : students)
            System.out.println(product.toString());
    }

}
