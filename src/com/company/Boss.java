package com.company;

public class Boss extends GameEntity{
Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int height, int damage) {
        super(height, damage);
    }

    public String info(){
        return  "HP: " + getHeight() + "\nDamage: " + getDamage() + "\nweapon type: " + weapon.getWeapon_type() + "\nweapon name: "
                + weapon.getWeapon_name();
    }
}
