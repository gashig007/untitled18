package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss("pistol", "p200", 300, 20);
        System.out.println(boss.info());
        Skeleton skelet1 = new Skeleton("pistol", "p200", 300, 20, 15);
        Skeleton skelet2 = new Skeleton("Bow ", "wooden bow ", 300, 20, 25);
        System.out.println(skelet1.info() + "\n" + skelet2.info());
    }

}
