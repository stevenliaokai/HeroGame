package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gem critGem = new Gem(0.3);
        Weapon infiniteBlade = new Weapon(20, 0.2, critGem);
        Weapon infiniteBladeWithNoGem = new Weapon(20, 0.2);
        Hero Steven = new Hero("Steven", "Liao", 35, 20, 600, 1, false);
        Steven.setWeapon(infiniteBladeWithNoGem);
        Hero Max = new Hero("Max", "Zeng", 30, 15, 500, 10, true);
        Max.setSkill(5, 100);
        System.out.println("Do you want to know the detail of this match?\nPlease enter1 for yes or 0 for no");
        Scanner scanner = new Scanner(System.in);
        int showDetail = scanner.nextInt();// 输入整数，转为字符串

        while (Max.getHealth() > 0 && Steven.getHealth() > 0) {
            Steven.Attack(Max, showDetail);
            Max.Attack(Steven, showDetail);
        }
        System.out.println("Max health : " + Max.getHealth());
        System.out.println("Steven health: " + Steven.getHealth());
    }


}




