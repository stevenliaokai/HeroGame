package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Hero {
    public String firstName;
    public String lastName;
    public int attDmg;
    public int def;
    public double health;
    public int shield;
    public boolean isBoss;
    public Weapon weapon;

    public Hero(String firstName, String lastName, int attDmg, int def, double health, int shield, boolean isBoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.health = health;
        this.shield = shield;
        this.isBoss = isBoss;
    }

    public void Attack(Hero defender) {
        if (defender.shield > 0) {
            defender.shield--;
        } else {
            double attDmgThisTime = this.attDmg;
            if (this.weapon != null){
                attDmgThisTime = attDmgThisTime*(1+this.weapon.crit);
            }
            if (this.isBoss && this.health < 200) {
                attDmgThisTime = attDmgThisTime * 3;
            }
            defender.health -= attDmgThisTime - defender.def;
            if (this.weapon != null) {
                this.health += (attDmgThisTime - defender.def)*this.weapon.lifeSteal;
            }
        }
    }
}
