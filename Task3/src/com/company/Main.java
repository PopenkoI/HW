package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //////////////////////////1)/////////////////////////////
        System.out.print("Input flower bad radius: ");
        Scanner in = new Scanner(System.in);

        float r;
        r = check_input();

        double perimeter = 2 * r * Math.PI;
        double area = r * r * Math.PI;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        //////////////////////////2)/////////////////////////////
        System.out.println();


        System.out.print("What is your name? ");
        String name = in.nextLine();
        name = check_input_string(name);

        System.out.print("Where are you live, " + name + "? ");
        String address = in.nextLine();
        address = check_input_string(address);

        System.out.print("Your name is " + name);
        System.out.println(" and you live in " + address);


        //////////////////////////3)/////////////////////////////
        System.out.println();

        System.out.print("Roaming in the first country is ");
        float c1 = check_input();
        System.out.print("Roaming in the second country is ");
        float c2 = check_input();
        System.out.print("Roaming in the third country is ");
        float c3 = check_input();

        System.out.print("Time of the first call is ");
        float t1 = check_input();
        System.out.print("Time of the second call is ");
        float t2 = check_input();
        System.out.print("Time of the third call is ");
        float t3 = check_input();

        float result1 = c1 * t1;
        float result2 = c2 * t2;
        float result3 = c3 * t3;
        float resultAll = result1 + result2 + result3;

        System.out.println("The cost of the first call is " + result1);
        System.out.println("The cost of the second call is " + result2);
        System.out.println("The cost of the third call is " + result3);
        System.out.println("The cost of all calls is " + resultAll);
        in.close();
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

    static float check_input() {
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
