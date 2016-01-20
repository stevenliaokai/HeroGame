package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Hero {
    //attributes
    private String firstName;
    private String lastName;
    private int attDmg;
    private int def;
    private double health;
    private int shield;
    private boolean isBoss;
    private Weapon weapon;

    //constructors
    public Hero(String firstName, String lastName, int attDmg, int def, double health, int shield, boolean isBoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.health = health;
        this.shield = shield;
        this.isBoss = isBoss;
    }

    //methods
    public void Attack(Hero defender) {
        if (defender.shield > 0) {
            defender.shield--;
        } else {
            double attDmgThisTime = this.attDmg;
            if (this.weapon != null){
                attDmgThisTime = attDmgThisTime*(1+this.weapon.getCrit());
            }
            if (this.isBoss && this.health < 200) {
                attDmgThisTime = attDmgThisTime * 3;
            }
            defender.health -= attDmgThisTime - defender.def;
            if (this.weapon != null) {
                this.health += (attDmgThisTime - defender.def)*this.weapon.getLifeSteal();
            }
        }
    }

    public double getHealth() {
        return health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
