package com.company;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        System.out.print("Input a: ");
        a = check_input(a);

        int b = 0;
        System.out.print("Input b: ");
        b = check_input(b);

        int c = 0;
        System.out.print("Input c: ");
        c = check_input(c);

        int x = 0;
        System.out.print("Input x: ");
        x = check_input(x);

        int y = 0;
        System.out.print("Input y: ");
        y = check_input(y);


        if ((x >= a && y >= b) || (x >= b && y >= a)) {
            System.out.println("The brick will pass");
        } else if ((x >= b && y >= c) || (x > c && y > b)) {
            System.out.println("The brick will pass");

        } else if ((x >= c && y >= a) || (x >= a && y >= c)) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will not pass");
        }

    }

    static int check_number_greater_then_zero(int number) {
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

    static int check_input(int number) {
        Scanner in_temp = new Scanner(System.in);
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

}
