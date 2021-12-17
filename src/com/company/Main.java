package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
        boss.setHeight(300);
        boss.setDamage(20);
        boss.setWeapon();
        System.out.println(boss.getHeight() + " " + boss.getDamage() + " " + boss.getWeapon());
    }
}
