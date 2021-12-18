package com.company;

public class Skeleton extends Boss{
    private int number_of_arrows;

    public int getNumber_of_arrows() {
        return number_of_arrows;
    }

    public Skeleton(int height, int damage, int number_of_arrows) {
        super(height, damage);
        this.number_of_arrows = number_of_arrows;
    }

    public void setNumber_of_arrows(int number_of_arrows) {
        this.number_of_arrows = number_of_arrows;
    }

    public String info(){
        return super.info() + "\nnumber_of_arrows: " + number_of_arrows;
    }
}
