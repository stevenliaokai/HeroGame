package com.company;


public class Main {

    public static void main(String[] args) {
        Gem critGem = new Gem(0.3);
        Weapon infiniteBlade = new Weapon(20, 0.2, critGem);
        Weapon infiniteBladeWithNoGem = new Weapon(20, 0.2);
        Hero Steven = new Hero("Steven", "Liao", 35, 20, 600, 1, false);
        Steven.setWeapon(infiniteBladeWithNoGem);
        Hero Max = new Hero("Max", "Zeng", 30, 15, 500, 10, true);
        while(Max.getHealth() > 0 && Steven.getHealth() > 0) {
            Max.Attack(Steven);
            Steven.Attack(Max);
        }
        System.out.println("Max health : "  + Max.getHealth());
        System.out.println("Steven health : " + Steven.getHealth());
    }
}

