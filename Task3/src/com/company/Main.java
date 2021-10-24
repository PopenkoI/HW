package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //////////////////////////1)/////////////////////////////
        System.out.print("Input flower bad radius: ");
        Scanner in = new Scanner(System.in);

        float r = in.nextFloat();
        r = check_number_greater_then_zero(r);

        double perimeter = 2 * r * Math.PI;
        double area = r * r * Math.PI;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        //////////////////////////2)/////////////////////////////
        System.out.println();

        System.out.print("What is your name? ");
        String name = in.next();
        System.out.print("Where are you live, " + name + "? ");
        String address = in.next();

        System.out.print("Your name is " + name);
        System.out.println(" and you live in " + address);


        //////////////////////////3)/////////////////////////////
        System.out.println();

        System.out.print("Roaming in the first country is ");
        float c1 = in.nextFloat();
        c1 = check_number_greater_then_zero(c1);
        System.out.print("Roaming in the second country is ");
        float c2 = in.nextFloat();
        c2 = check_number_greater_then_zero(c2);
        System.out.print("Roaming in the third country is ");
        float c3 = in.nextFloat();
        c3 = check_number_greater_then_zero(c3);

        System.out.print("Time of the first call is ");
        float t1 = in.nextFloat();
        t1 = check_number_greater_then_zero(t1);
        System.out.print("Time of the second call is ");
        float t2 = in.nextFloat();
        t2 = check_number_greater_then_zero(t2);
        System.out.print("Time of the third call is ");
        float t3 = in.nextFloat();
        t3 = check_number_greater_then_zero(t3);

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

    static float check_number_greater_then_zero(float number){
        Scanner in_temp = new Scanner(System.in);
        while (number <= 0) {
            System.out.println("Value must be positive!");
            System.out.print("Input positive value: ");
            number = in_temp.nextFloat();
        }
        return number;
    }

}
