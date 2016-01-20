package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gem critGem = new Gem(0.3);
        Weapon infiniteBlade = new Weapon(20, 0.2, critGem);
        Weapon infiniteBladeWithNoGem = new Weapon(20, 0.2);
        Hero Steven = new Hero("Steven", "Liao", 35, 20, 600, 1, false);
        Hero Garen = new Hero("Garen", "Garen", 30, 20, 600, 5, true);
        Steven.setWeapon(infiniteBladeWithNoGem);
        Hero Max = new Hero("Max", "Zeng", 30, 15, 500, 10, true);
        Max.setSkill(5, 100);
        System.out.println("Do you want to know the detail of this match?\nPlease enter1 for yes or 0 for no");
        Scanner scanner = new Scanner(System.in);
        int showDetail = scanner.nextInt();// 输入整数，转为字符串
        battle(Steven, Garen, showDetail);
    }

    public static void battle(Hero firstAttacker, Hero secondAttacker, int showDetail) {
        while (firstAttacker.getHealth() > 0 && secondAttacker.getHealth() > 0) {
            firstAttacker.Attack(secondAttacker, showDetail);
            secondAttacker.Attack(firstAttacker, showDetail);
        }
        System.out.println(firstAttacker.getFirstName() + " health : " + firstAttacker.getHealth());
        System.out.println(secondAttacker.getFirstName() + " health: " + secondAttacker.getHealth());
        if (firstAttacker.getHealth() > 0) {
            System.out.print(firstAttacker.getFirstName() + " is the winner.");
        } else {
            System.out.print(secondAttacker.getFirstName() + " is the winner.");
        }
    }


}




