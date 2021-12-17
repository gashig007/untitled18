package com.company;

public class GameEntity extends Weapon {
    private int height;
    private int damage;

    public GameEntity(String weapon_type, String weapon_name, int height, int damage) {
        super(weapon_type, weapon_name);
        this.height = height;
        this.damage = damage;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String info(){
        return ("HP " + height + "Damage " + damage + "type name " + getWeapon_type() + "weapon name "
                + getWeapon_name());
    }
}
