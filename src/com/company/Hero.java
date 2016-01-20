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
    private int mana;
    private Skill skill;

    //constructors
    public Hero(String firstName, String lastName, int attDmg, int def, double health, int shield, boolean isBoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.health = health;
        this.shield = shield;
        this.isBoss = isBoss;
        this.mana = 0;
    }

    //methods
    public void Attack(Hero defender, int showDetail) {
        this.mana += 1;
        if (defender.shield > 0) {
            defender.shield--;
            if (showDetail == 1) {
                System.out.print(defender.firstName + " used shield to block the " + this.firstName + "'s attack\n");
            }
        } else {
            double attDmgThisTime = this.attDmg;
            if (this.weapon != null) {
                attDmgThisTime = attDmgThisTime * (1 + this.weapon.getCrit());
            }
            if (this.isBoss && this.health < 200) {
                attDmgThisTime = attDmgThisTime * 3;
            }
            double finalDamage = attDmgThisTime - defender.def;
            defender.health -= finalDamage;
            if (showDetail == 1) {
                System.out.print(this.firstName + " basic attacked " + defender.firstName + " by " + finalDamage + "\n");
            }
            if (this.weapon != null) {
                this.health += (attDmgThisTime - defender.def) * this.weapon.getLifeSteal();
            }


            if (skill != null && mana > skill.getCost()) {
                defender.health -= skill.getDamage();
                this.mana = 0;
                if (showDetail == 1) {
                    System.out.print(this.firstName + " used magic and damaged " + defender.firstName + " by " + skill.getDamage() + "\n");
                }
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public double getHealth() {
        return health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setSkill(int cost, double damage) {
        this.skill = new Skill(cost, damage);
    }


}
