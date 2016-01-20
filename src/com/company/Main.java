package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //setup
        Weapon infiniteBlade = new Weapon(20, 0.2, new Gem(0.3));
        Hero Steven = new Hero("Steven", "Liao", 35, 20, 600, 1, false);
        Hero Garen = new Hero("Garen", "Garen", 30, 20, 600, 5, true);
        Steven.setWeapon(infiniteBlade);
        Hero Max = new Hero("Max", "Zeng", 30, 15, 500, 10, true);
        Max.setSkill(5, 100);
        int showDetail = askShowDetail();

        //game started
        battle(Steven, Garen, showDetail);
        Steven.restoreHealth();
        Garen.restoreHealth();
        battle(Steven, Max, showDetail);
    }

    public static void battle(Hero playerA, Hero playerB, int showDetail) {
        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            playerA.attack(playerB, showDetail);
            playerB.attack(playerA, showDetail);
        }
        printLine(playerA.getFirstName() + " health : " + playerA.getHealth());
        printLine(playerB.getFirstName() + " health: " + playerB.getHealth());
        if (playerA.getHealth() > 0) {
            printLine(playerA.getFirstName() + " is the winner.");
        } else {
            printLine(playerB.getFirstName() + " is the winner.");
        }
    }

    public static void printLine(String output) {
        System.out.println(output);
    }

    public static int askShowDetail() {
        printLine("Do you want to know the detail of this match?\nPlease enter1 for yes or 0 for no");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}




