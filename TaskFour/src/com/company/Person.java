package com.company;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 2021 || birthYear <= 0) {
            System.out.println("Incorrect year of birth.");
            this.birthYear = 0;
        } else {
            this.birthYear = birthYear;
        }
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        if (birthYear > 2021 || birthYear <= 0) {
            System.out.println("Incorrect year of birth.");
            this.birthYear = 0;
        } else {
            this.birthYear = birthYear;
        }
    }

    public int age() {
        if (this.birthYear != 0) {
            return 2021 - this.birthYear;
        } else {
            System.out.println("Your year of birth is 0, please enter it.");
            return -1;
        }
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name ");
        this.name = in.nextLine();
        System.out.print("Input year of birth ");
        int birthYear = in.nextInt();
        while (birthYear > 2021 || birthYear <= 0) {
            System.out.println("Incorrect year of birth.");
            birthYear = in.nextInt();
        }
        this.birthYear = birthYear;

    }

    public void output() {
        System.out.println("Name is " + this.name);
        System.out.println("Year of birth is " + this.birthYear);
    }

    public void changeName(String name) {
        this.name = name;
    }

}
