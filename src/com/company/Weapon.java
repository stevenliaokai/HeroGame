package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Weapon {
    public double lifeSteal;
    public double crit;
    public Weapon(double lifeSteal, double crit){
        this.lifeSteal = lifeSteal/100;
        this.crit = crit;
    }
}


