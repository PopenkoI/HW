package com.company;

public class ContractEmployee extends Employee implements CalculatePay {
    private String federalTaxIdmember;
    private int hourly_rate;
    private int number_of_hours_worked;

    public ContractEmployee() {
    }

    public ContractEmployee(String name, String federalTaxIdmember, int hourly_rate, int number_of_hours_worked) {
        super(name, federalTaxIdmember);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourly_rate = hourly_rate;
        this.number_of_hours_worked = number_of_hours_worked;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public int getNumber_of_hours_worked() {
        return number_of_hours_worked;
    }

    public void setNumber_of_hours_worked(int number_of_hours_worked) {
        this.number_of_hours_worked = number_of_hours_worked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public float calculatePay() {
        return hourly_rate * number_of_hours_worked;
    }

}
