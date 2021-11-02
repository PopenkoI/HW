package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Input n: ");
        int n = inputNumber();

        int n2 = n * n;
        System.out.println("n^2 = " + n2);
        ///////////////////////////////a)////////////////////////////////////
        boolean includedNumber3 = false;
        while ((n2 != 0) && (!includedNumber3)) {
            if (n2 % 10 == 3) {
                includedNumber3 = true;
            }
            n2 = n2 / 10;
        }

        if (includedNumber3) {
            System.out.println("a) 3 included");
        } else {
            System.out.println("a) 3 not included");
        }

        //////////////////////////////b)///////////////////////////////////////
        int revers_n = 0, temp, copy_n = n;
        do {
            temp = copy_n % 10;
            revers_n = (revers_n * 10) + temp;
            copy_n = copy_n / 10;
        } while (copy_n > 0);
        System.out.println("b) " + revers_n);
        //////////////////////////////c)///////////////////////////////////////
        int begin_n, middle_n = 0, position = 1;
        copy_n = n;
        begin_n = copy_n % 10;
        copy_n = copy_n / 10;
        while (copy_n > 9) {
            begin_n *= 10;
            middle_n += (copy_n % 10) * position;
            position *= 10;
            copy_n /= 10;
        }
        copy_n = (begin_n * 10) + (middle_n * 10) + copy_n;
        System.out.println("c) " + copy_n);
        //////////////////////////////d)///////////////////////////////////////
        int result, first_1 = 10;
        copy_n = n;
        while (copy_n != 0) {
            copy_n /= 10;
            first_1 *= 10;
        }
        result = first_1 + n * 10 + 1;
        System.out.println("d) " + result);
    }

    static int checkNumberGreaterThenZero(int number) {
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

    static int inputNumber() {
        Scanner in_temp = new Scanner(System.in);
        int number;
        while (true) {
            try {
                number = Integer.parseInt(in_temp.nextLine().trim());
                number = checkNumberGreaterThenZero(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        return number;
    }

}
