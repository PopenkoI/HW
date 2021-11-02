package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        MyFunction func = new MyFunction();

        /////////////////////////////1.1/////////////////////////////////
        System.out.print("Input first float number ");
        float num1 = inputFloatNumber();
        System.out.print("Input second float number ");
        float num2 = inputFloatNumber();
        System.out.print("Input third float number ");
        float num3 = inputFloatNumber();

        func.allBelongToRangeOrNot(num1, num2, num3);

        /////////////////////////////1.2/////////////////////////////////
        System.out.print("Input first integer number ");
        int number1 = inputIntegerNumber();
        System.out.print("Input second integer number ");
        int number2 = inputIntegerNumber();
        System.out.print("Input third integer number ");
        int number3 = inputIntegerNumber();

        if (number1 == number2 && number2 == number3) {
            System.out.println("min and max equal = " + number1);
        }

        System.out.println("max = " + func.maxOfThreeNumbers(number1, number2, number3));
        System.out.println("min = " + func.minOfThreeNumbers(number1, number2, number3));

        /////////////////////////////1.3/////////////////////////////////
        System.out.print("Input code ");
        int code = inputIntegerNumber();
        func.HTTPError(code);

        /////////////////////////////2/////////////////////////////////
        Dog dog1 = new Dog("Tom", Breeds.CORGI, 6);
        Dog dog2 = new Dog("Gigi", Breeds.POODLE, 4);
        Dog dog3 = new Dog("Gigi", Breeds.GOLDEN_RETRIEVER, 7);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        for (int i = 0; i < dogs.size(); ++i) {
            for (int j = i + 1; j < dogs.size(); ++j) {
                if (dogs.get(i).getName().equals(dogs.get(j).getName())) {
                    System.out.println("Please change the name of the dog, " + dogs.get(j).getName() + " with age " + dogs.get(j).getAge() + " there is already a dog with that name. New name: ");
                    String new_name = inputString();
                    dogs.get(j).setName(new_name);
                }
            }
        }

        int maxAge = dogs.get(0).getAge();
        for (Dog dog : dogs) {
            if (maxAge < dog.getAge()) {
                maxAge = dog.getAge();
            }
        }
        for (Dog dog : dogs) {
            if (maxAge == dog.getAge()) {
                dog.output();
            }
        }

    }

    static float checkNumberGreaterThenZeroFloat(float number) {
        Scanner in_temp = new Scanner(System.in);
        while (number <= 0) {
            while (true) {
                try {
                    System.out.println("Value must be positive!");
                    System.out.print("Input positive value: ");
                    number = Float.parseFloat(in_temp.nextLine().trim().replace(",", "."));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input error! Please enter a number.");
                }
            }
        }
        return number;
    }

    static float inputFloatNumber() {
        Scanner in_temp = new Scanner(System.in);
        float number;
        while (true) {
            try {
                number = Float.parseFloat(in_temp.nextLine().trim().replace(",", "."));
                number = checkNumberGreaterThenZeroFloat(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        return number;
    }

    static int checkNumberGreaterThenZeroInt(int number) {
        Scanner in_temp = new Scanner(System.in);
        while (number <= 0) {
            while (true) {
                try {
                    System.out.println("Value must be positive!");
                    System.out.print("Input positive value: ");
                    number = Integer.parseInt(in_temp.nextLine().trim());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input error! Please enter a number.");
                }
            }
        }
        return number;
    }

    static int inputIntegerNumber() {
        Scanner in_temp = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = Integer.parseInt(in_temp.nextLine().trim());
                number = checkNumberGreaterThenZeroInt(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        return number;
    }

    static String inputString() {
        Scanner in_temp = new Scanner(System.in);
        String str = in_temp.nextLine();

        String pattern = "([\\s|a-zA-Z])+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while (!m.matches()) {
            System.out.print("Input error! Please enter only the letters of the English alphabet. ");
            str = in_temp.nextLine();
            m = p.matcher(str);
        }
        return str;
    }

}


