package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Skill {
    //attributes
    private int cost;
    private double damage;

    //constructors
    public Skill(int cost, double damage){
        this.cost = cost;
        this.damage = damage;
    }

    //method
    public double getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }
}


