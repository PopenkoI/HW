package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
            String s;
            int i = -1;

            while ((s = br.readLine()) != null) {
                String[] words = s.split(" ");
                SalariedEmployee sEm = new SalariedEmployee();
                ContractEmployee cEmt = new ContractEmployee();

                if (words.length == 3) {
                    ++i;
                    float temp = Float.parseFloat(words[2]);
                    employees[i] = new SalariedEmployee(words[0], words[1], temp);
                }

                if (words.length == 4) {
                    ++i;
                    int temp = Integer.parseInt(words[2]);
                    int temp2 = Integer.parseInt(words[2]);
                    employees[i] = new ContractEmployee(words[0], words[1], temp, temp2);
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
/*
        SalariedEmployee sEm1 = new SalariedEmployee("Tom", "12Dl",15007);
        SalariedEmployee sEm2 = new SalariedEmployee("Bil", "13Dl",20050);
        SalariedEmployee sEm3 = new SalariedEmployee("Fred", "14Dl",30400);
        ContractEmployee cEm1 = new ContractEmployee("Fill", "14HJ5", 232, 32);
        ContractEmployee cEm2 = new ContractEmployee("Devid", "14HJ6", 178, 34);

        Employee[] employees = new Employee[]{
                sEm1,sEm2,sEm3,cEm1,cEm2
        };*/

        QuickSort(employees, 0, employees.length - 1);

        for (Employee em : employees) {
            em.output();
        }

    }

    static int Partition(Employee arr[], int start, int end) {
        float x = arr[end].calculatePay();
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j].calculatePay() <= x) {
                i++;
                Employee temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Employee temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    static void QuickSort(Employee employees[], int left, int right) {
        int s;
        if (left < right) {
            s = Partition(employees, left, right);
            QuickSort(employees, left, s - 1);
            QuickSort(employees, s + 1, right);
        }
    }
}
