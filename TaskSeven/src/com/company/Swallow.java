package com.company;

public class Swallow extends FlyingBird
{
    public Swallow(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Swallow have feathers " + this.getFeathers() + " in length.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");
    }
}
