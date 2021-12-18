package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss(300, 20);
	boss.weapon.setWeapon_type("pistol");
        boss.weapon.setWeapon_name("p2000");
        System.out.println(boss.info());
        Skeleton skelet1 = new Skeleton( 300, 20, 15);
        skelet1.weapon.setWeapon_type("деревянный: ");
        skelet1.weapon.setWeapon_name("лук");
        Skeleton skelet2 = new Skeleton( 300, 20, 25);
        skelet2.weapon.setWeapon_type("огненный: ");
        skelet2.weapon.setWeapon_name("огненный лук:");
        System.out.println(skelet1.info() + "\n" + skelet2.info());
    }

}
