package com.company;

public class Boss extends GameEntity{
    public Boss(String weapon_type, String weapon_name, int height, int damage) {
        super(weapon_type, weapon_name, height, damage);

    }
    public String info(){
        return ("HP " + getHeight() + "Damage " + getDamage() + "type name " + getWeapon_type() + "weapon name "
                + getWeapon_name());
    }
}
