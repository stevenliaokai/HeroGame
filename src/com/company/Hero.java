package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Hero {
    public String firstName;
    public String lastName;
    public int attDmg;
    public int def;
    public String weapon;
    public int health;
    public int shield;
    public boolean isBoss;

    public Hero(String firstName, String lastName, int attDmg, int def, String weapon, int health, int shield, boolean isBoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.weapon = weapon;
        this.health = health;
        this.shield = shield;
        this.isBoss = isBoss;
    }

    public void Attack(Hero defender) {
        if (defender.shield > 0) {
            defender.shield--;
        } else {
            int attDmgThisTime = this.attDmg;
            if (this.isBoss && this.health < 200) {
                attDmgThisTime = this.attDmg * 3;
            }
            defender.health -= attDmgThisTime - defender.def;
        }
    }
}
