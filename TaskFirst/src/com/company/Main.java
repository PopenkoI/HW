package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        while (a <= 0) {
            System.out.println("a must be positive!");
            System.out.print("Input positive a: ");
            a = in.nextInt();
        }
        System.out.print("Input b: ");
        int b = in.nextInt();
        while (b <= 0) {
            System.out.println("b must be positive!");
            System.out.print("Input positive b: ");
            b = in.nextInt();
        }
        System.out.print("Input c: ");
        int c = in.nextInt();
        while (c <= 0) {
            System.out.println("c must be positive!");
            System.out.print("Input positive c: ");
            c = in.nextInt();
        }
        System.out.print("Input x: ");
        int x = in.nextInt();
        while (x <= 0) {
            System.out.println("x must be positive!");
            System.out.print("Input positive x: ");
            x = in.nextInt();
        }
        System.out.print("Input y: ");
        int y = in.nextInt();
        while (y <= 0) {
            System.out.println("y must be positive!");
            System.out.print("Input positive y: ");
            y = in.nextInt();
        }

        if ((x >= a && y >= b) || (x >= b && y >= a)) {
            System.out.println("The brick will pass");
        } else if ((x >= b && y >= c) || (x > c && y > b)) {
            System.out.println("The brick will pass");

        } else if ((x >= c && y >= a) || (x >= a && y >= c)) {
            System.out.println("The brick will pass");
        } else {
            System.out.println("The brick will not pass");
        }

        in.close();
    }
}
