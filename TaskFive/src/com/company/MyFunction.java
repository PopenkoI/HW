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
        int[] numbers = new int[]{number1, number2, number3};
        int maxNumber = number1;
        for (int num : numbers) {
            if (maxNumber < num) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    public int minOfThreeNumbers(int number1, int number2, int number3) {
        int[] numbers = new int[]{number1, number2, number3};
        int minNumber = number1;
        for (int num : numbers) {
            if (minNumber > num) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public void HTTPError(final int code) {
        HTTPError[] errors = HTTPError.values();
        boolean not_error = false;
        for (HTTPError er : errors) {
            if (code == er.getCode()) {
                System.out.println(er);
            } else {
                not_error = true;
            }
        }
        if (not_error) {
            System.out.println("This is not an HTTP error code");
        }
    }
}
