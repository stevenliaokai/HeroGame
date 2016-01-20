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

    public Hero(String firstName, String lastName, int attDmg, int def){
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.weapon = "";
        this.health = 500;
    }
    public Hero(String firstName, String lastName, int attDmg, int def, String weapon, int health){
        this.firstName = firstName;
        this.lastName = lastName;
        this.attDmg = attDmg;
        this.def = def;
        this.weapon = weapon;
        this.health = health;
    }
}
