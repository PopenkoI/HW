package com.company;

public class Employee implements CalculatePay {
    private String name;
    private String employeeId;

    public Employee() {
    }

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public float calculatePay() {
        return 0;
    }

    public void output() {
        System.out.println("Name: " + this.name + " ID: " + this.employeeId);
        System.out.println("Average Monthly wage:  " + this.calculatePay());
    }
}
