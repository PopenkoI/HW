package com.company;

public class SalariedEmployee extends Employee implements CalculatePay {
    private String socialSecurityNumber;
    private float fixed_monthly_payment;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, String socialSecurityNumber, float fixed_monthly_payment) {
        super(name, socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public float getFixed_monthly_payment() {
        return fixed_monthly_payment;
    }

    public void setFixed_monthly_payment(float fixed_monthly_payment) {
        this.fixed_monthly_payment = fixed_monthly_payment;
    }

    @Override
    public float calculatePay() {
        return fixed_monthly_payment;
    }

}
