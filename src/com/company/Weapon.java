package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Weapon {
    //attributes
    private double lifeSteal;
    private double crit;
    private Gem critGem;

    //constructors
    public Weapon(double lifeSteal, double crit){
        this.lifeSteal = lifeSteal;
        this.crit = crit;
    }

    public Weapon(double lifeSteal, double crit, Gem critGem){
        this.lifeSteal = lifeSteal;
        this.crit = crit;
        this.critGem = critGem;
    }

    //methods
    public double getCrit(){
        if(this.critGem != null){
            return this.crit + this.critGem.crit;
        } else {
            return this.crit;
        }
    }

    public double getLifeSteal() {
        return lifeSteal/100;
    }
}


