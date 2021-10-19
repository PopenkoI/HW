package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("n must be positive!");
            System.out.print("Input positive n: ");
            n = in.nextInt();
        }

        int n2;
        System.out.println("n^2=" + (n * n));
        n2 = n * n;
        ///////////////////////////////a)////////////////////////////////////
        boolean l = false;
        while ((n2 != 0) && (!l)) {
            if (n2 % 10 == 3) l = true;
            n2 = n2 / 10;
        }

        if (l)
            System.out.println("1) 3 included");
        else
            System.out.println("1) 3 not included");
        //////////////////////////////b)///////////////////////////////////////
        int revers_n = 0, temp, copy_n = n;
        do {
            temp = copy_n % 10;
            revers_n = (revers_n * 10) + temp;
            copy_n = copy_n / 10;
        } while (copy_n > 0);
        System.out.println("2) " +revers_n);
        //////////////////////////////c)///////////////////////////////////////
        int  begin_n, middle_n = 0, position = 1;
        copy_n = n;
        begin_n = copy_n % 10;
        copy_n = copy_n / 10;
        while (copy_n > 9) {
            begin_n *= 10;
            middle_n += (copy_n % 10) * position;
            position *= 10;//10  100
            copy_n /= 10;
        }
        copy_n = (begin_n * 10) + (middle_n * 10) + copy_n;
        System.out.println("3) " +copy_n);
        //////////////////////////////d)///////////////////////////////////////
        int result, first_1 = 10;
        copy_n = n;
        while (copy_n != 0) {
            copy_n /= 10;
            first_1 *= 10;
        }
        result = first_1 + n * 10 + 1;
        System.out.println("4) " + result);
        in.close();
    }
}
