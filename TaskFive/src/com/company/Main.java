package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        MyFunction func = new MyFunction();
        Scanner in = new Scanner(System.in);

        /////////////////////////////1.1/////////////////////////////////

        System.out.print("Input first float number ");
        float num1 = check_input_float();

        System.out.print("Input second float number ");
        float num2 = check_input_float();

        System.out.print("Input third float number ");
        float num3 = check_input_float();

        func.allBelongToRangeOrNot(num1, num2, num3);

        /////////////////////////////1.2/////////////////////////////////

        System.out.print("Input first integer number ");
        int number1 = check_input_int();

        System.out.print("Input second integer number ");
        int number2 = check_input_int();

        System.out.print("Input third integer number ");
        int number3 = check_input_int();

        if (number1 == number2 && number2 == number3) {
            System.out.println("min and max equal = " + number1);
        }

        func.maxOfThreeNumbers(number1, number2, number3);
        func.minOfThreeNumbers(number1, number2, number3);

        /////////////////////////////1.3/////////////////////////////////

        System.out.print("Input code");
        int code = check_input_int();
        func.HTTPError(code);

        /////////////////////////////2/////////////////////////////////

        Dog dog1 = new Dog("Tom", Breeds.CORGI, 6);
        Dog dog2 = new Dog("Gigi", Breeds.POODLE, 4);
        Dog dog3 = new Dog("Gigi", Breeds.GOLDEN_RETRIEVER, 7);

        String new_name;
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Please change the name of the dog, " + dog2.getName() + " with age " + dog2.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            new_name = check_input_string(new_name);
            dog2.setName(new_name);
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Please change the name of the dog, " + dog3.getName() + " with age " + dog3.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            new_name = check_input_string(new_name);
            dog3.setName(new_name);
        } else if (dog3.getName().equals(dog1.getName())) {
            System.out.println("Please change the name of the dog, " + dog3.getName() + " with age " + dog3.getAge() + " there is already a dog with that name. New name: ");
            new_name = in.next();
            new_name = check_input_string(new_name);
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


    static float check_number_greater_then_zero(float number) {
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

    static float check_input_float() {
        Scanner in_temp = new Scanner(System.in);
        float number;
        while (true) {
            try {
                number = Integer.parseInt(in_temp.nextLine().trim());
                number = check_number_greater_then_zero(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        return number;
    }

    static int check_number_greater_then_zero_int(int number) {
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

    static int check_input_int() {
        Scanner in_temp = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = Integer.parseInt(in_temp.nextLine().trim());
                number = check_number_greater_then_zero_int(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        return number;
    }

    static String check_input_string(String str){
        Scanner in_temp = new Scanner(System.in);
        String pattern;
        pattern = "([\\s|a-z|A-Z])+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while(!m.matches()){
            System.out.print("Input error! Please enter the letters of the English alphabet. ");
            str = in_temp.nextLine();
            m = p.matcher(str);
        }
        return str;
    }

}


