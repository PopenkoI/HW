package com.company;

public class Eagle extends FlyingBird
{
    public Eagle(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Eagle have feathers " + this.getFeathers() + " in length.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");
    }


}
