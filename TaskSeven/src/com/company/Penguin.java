package com.company;

public class Penguin extends NotFlyingBird
{
    public Penguin(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Penguin have feathers " + this.getFeathers() + " in length.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");

    }
}
