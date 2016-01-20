package com.company;


public class Main {

    public static void main(String[] args) {
        Weapon infiniteBlade = new Weapon(20);
        Hero Steven = new Hero("Steven", "Liao", 35, 20, 600, 1, false);
        Steven.weapon = infiniteBlade;
        Hero Max = new Hero("Max", "Zeng", 30, 15, 500, 10, true);
        while(Max.health > 0 && Steven.health > 0) {
            Max.Attack(Steven);
            Steven.Attack(Max);
        }

        System.out.println("Max health : "  + Max.health);
        System.out.println("Steven health : " + Steven.health);

    }

}

