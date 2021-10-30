package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            double num1,num2;
            while (true) {
                try {
                    System.out.print("Input first double number: ");
                    num1 = Double.parseDouble(in.nextLine().trim().replace(",", "."));
                    System.out.print("Input second double number: ");
                    num2 = Double.parseDouble(in.nextLine().trim().replace(",", "."));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Input error! Please enter a number.");
                }
            }

        try{
            double result1 = div(num1,num2);
            System.out.println(result1);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        main();
    }

    static double div(double num1, double num2) throws Exception {
        if (num1 / num2 == 7.0 / 0 || num1 / num2 == -7.0 / 0)
            throw new Exception("You divided by 0! This is a mistake.");
        return num1 / num2;
    }

    static int readNumber(int start, int end) throws Exception {
        int number;
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input integer number: ");
                number = Integer.parseInt(in.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please enter a number.");
            }
        }
        if (number > end || number < start) throw new Exception("Number out from range [" + start + ":" + end + "]");
        return number;
    }

    static void main(){
        int number, num_next = 1;
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            while (true) {
                try {
                    arr[i] = num_next = readNumber(num_next, 100);
                    break;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }

        for (int j = 0; j < arr.length - 1; ++j) {
            System.out.print(arr[j] + " < ");
        }
        System.out.print(arr[9]);
    }
}