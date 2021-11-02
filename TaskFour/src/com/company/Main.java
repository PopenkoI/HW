package com.company;

public class Main {

    public static void main(String[] args) {
        Person pers1 = new Person();
        pers1.output();

        Person pers2 = new Person("Tom", 1973);
        pers2.output();
        System.out.println("Age " + pers2.calculateAge());

        Person pers3 = new Person();
        pers3.setName("Vira");
        pers3.setBirthYear(1934);
        pers3.output();

        Person pers4 = new Person();
        pers4.input();
        System.out.println("Name " + pers4.getName());
        System.out.println("Year " + pers4.getBirthYear());

        Person pers5 = new Person("Tom", 1965);
        pers5.changeName("Victor");
        pers5.output();
    }


}
