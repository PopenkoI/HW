package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyFunction func = new MyFunction();
        Scanner in = new Scanner(System.in);

        /////////////////////////////1.1/////////////////////////////////

        System.out.print("Input first float number ");
        float num1 = in.nextFloat();

        System.out.print("Input second float number ");
        float num2 = in.nextFloat();

        System.out.print("Input third float number ");
        float num3 = in.nextFloat();

        func.allBelongToRangeOrNot(num1, num2, num3);

        /////////////////////////////1.2/////////////////////////////////

        System.out.print("Input first integer number ");
        int number1 = in.nextInt();

        System.out.print("Input second integer number ");
        int number2 = in.nextInt();

        System.out.print("Input third integer number ");
        int number3 = in.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("min and max equal = " + number1);
        }

        func.maxOfThreeNumbers(number1, number2, number3);
        func.minOfThreeNumbers(number1, number2, number3);

        /////////////////////////////1.3/////////////////////////////////

        System.out.print("Input code");
        int code = in.nextInt();
        func.HTTPError(code);

        /////////////////////////////2/////////////////////////////////

        Dog dog1 = new Dog("Tom", Breeds.CORGI, 6);
        Dog dog2 = new Dog("Gigi", Breeds.POODLE, 4);
        Dog dog3 = new Dog("Gigi", Breeds.GOLDEN_RETRIEVER, 7);

        String new_name;
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Please change the name of the dog," + dog2.getName() + " with age " + dog2.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            dog2.setName(new_name);
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Please change the name of the dog," + dog3.getName() + " with age " + dog3.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            dog3.setName(new_name);
        } else if (dog3.getName().equals(dog1.getName())) {
            System.out.println("Please change the name of the dog," + dog3.getName() + " with age " + dog3.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            dog3.setName(new_name);
        }

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            dog1.output();
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            dog2.output();
        } else if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog1.getAge()) {
            dog3.output();
        }

        if (dog1.getAge() == dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            dog1.output();
            dog2.output();
        } else if (dog2.getAge() == dog3.getAge() && dog2.getAge() > dog1.getAge()) {
            dog2.output();
            dog3.output();
        } else if (dog3.getAge() == dog1.getAge() && dog3.getAge() > dog2.getAge()) {
            dog1.output();
            dog3.output();
        }

    }

}


