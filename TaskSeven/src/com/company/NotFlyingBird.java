package com.company;

public abstract class NotFlyingBird extends Bird {

    public NotFlyingBird(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Walk!");
    }
}
