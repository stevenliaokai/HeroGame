package com.company;

/**
 * Created by liaokai on 16/1/20.
 */
public class Hero {

    //attributes
    private String firstName;
    private int attDmg;
    private int def;
    private double health;
    private double maxHealth;
    private int shield;
    private boolean isBoss;
    private Weapon weapon;
    private int mana;
    private Skill skill;

    //constructors
    public Hero(String firstName, int attDmg, int def, double health, int shield, boolean isBoss) {
        this.firstName = firstName;
        this.attDmg = attDmg;
        this.def = def;
        this.health = health;
        this.maxHealth = health;
        this.shield = shield;
        this.isBoss = isBoss;
        this.mana = 0;
    }

    //methods
    public void attack(Hero defender, int showDetail) {

        boolean isShielded = false;
        double physicalDmg = 0;
        double magicDmg = 0;

        //start attacking
        this.mana += 1;
        if (defender.shield > 0) {
            defender.shield--;
            isShielded = true;
        } else {
            double attDmgThisTime = this.attDmg;
            if (this.weapon != null) {
                attDmgThisTime = attDmgThisTime * (1 + this.weapon.getCrit());
            }
            if (this.isBoss && this.health < 200) {
                attDmgThisTime = attDmgThisTime * 3;
            }
            physicalDmg = attDmgThisTime - defender.def;
            defender.health -= physicalDmg;
            if (this.weapon != null) {
                this.health += (attDmgThisTime - defender.def) * this.weapon.getLifeSteal();
            }

            if (skill != null && mana > skill.getCost()) {
                magicDmg = skill.getDamage();
                defender.health -= magicDmg;
                this.mana = 0;
            }
        }

        //show detail
        if(showDetail == 1){
            if(isShielded) {
                System.out.print(defender.firstName + " used shield to block the " + this.firstName + "'s attack\n");
            }
            if(physicalDmg > 0){
                System.out.print(this.firstName + " basic attacked " + defender.firstName + " by " + physicalDmg + "\n");
            }
            if(magicDmg > 0){
                System.out.print(this.firstName + " used magic and damaged " + defender.firstName + " by " + magicDmg + "\n");
            }
        }
    }

    public void restoreHealth() {
        this.health = this.maxHealth;
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
