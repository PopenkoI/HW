package com.company;

public class MyFunction {

    public boolean allBelongToRangeOrNot(float num1, float num2, float num3) {
        if ((num1 >= -5 && num1 <= 5) && (num2 >= -5 && num2 <= 5) && (num3 >= -5 && num3 <= 5)) {
            System.out.println("They are all belong to the range [-5;5]");
            return true;
        } else {
            System.out.println("They are all or some of them not belong to the range [-5;5]");
            return false;
        }
    }

    public int maxOfThreeNumbers(int number1, int number2, int number3) {
        //шукає тільки максимум з трьох різних чисел
        if (number1 > number2 && number1 > number3) {
            System.out.println("max = " + number1);
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max = " + number2);
            return number2;
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("max = " + number3);
            return number3;
        }
        //шукає тільки максимум, де два числа одинакові
        if (number1 == number2 && number1 > number3) {
            System.out.println("max = " + number1 + "," + number2);
            return number1;
        } else if (number2 == number3 && number2 > number1) {
            System.out.println("max = " + number2 + "," + number3);
            return number2;
        } else if (number3 == number1 && number3 > number2) {
            System.out.println("max = " + number3 + "," + number1);
            return number1;
        }
        return number1;
    }

    public int minOfThreeNumbers(int number1, int number2, int number3) {
        //шукає тільки мінімум з трьох різних чисел
        if (number1 < number2 && number1 < number3) {
            System.out.println("min = " + number1);
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("min = " + number2);
            return number2;
        } else if (number3 < number1 && number3 < number2) {
            System.out.println("min = " + number3);
            return number2;
        }

        //шукає тільки мінімум, де два числа одинакові
        if (number1 == number2 && number1 < number3) {
            System.out.println("min = " + number1 + "," + number2);
            return number1;
        } else if (number2 == number3 && number2 < number1) {
            System.out.println("min = " + number2 + "," + number3);
            return number2;
        } else if (number3 == number1 && number3 < number2) {
            System.out.println("min = " + number3 + "," + number1);
            return number1;
        }
        return number1;
    }

    public void HTTPError(final int code) {
        HTTPError[] errors = HTTPError.values();
        boolean not_error = false;
        for (HTTPError er : errors) {
            if(code == er.getCode()) {
                System.out.println(er);
            }else {
                not_error = true;

            }
        }
        if(not_error) {
            System.out.println("This is not an HTTP error code");
        }
    }
}
