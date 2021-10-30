package com.company;

public class Main {

    public static void main(String[] args) {
        Swallow sw = new Swallow(10, "can");
        Eagle ea = new Eagle(32, "can");
        Chicken ch = new Chicken(6, "can");
        Penguin pe = new Penguin(7, "can");

        Bird[] birds = new Bird[]{sw, ea, ch, pe};

        for(Bird bird : birds){
            bird.output();
            bird.fly();
        }
    }
}
