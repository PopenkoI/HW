package com.company;

public class Chicken extends NotFlyingBird
{
    public Chicken(int feathers, String layEggs) {
        super(feathers, layEggs);
    }


    public void output() {
        System.out.println("Chicken have feathers " + this.getFeathers() + " in length.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");
    }
}
