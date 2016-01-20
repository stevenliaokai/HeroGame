package com.company;


public class Main {

    public static void main(String[] args) {
        Hero Steven = new Hero("Steven", "Liao", 35, 20, "shuangdao", 600);
        Hero Max = new Hero("Max", "Zeng", 30, 15, "", 500);
        int i = 0;
        while(i < 10){
            i++;
            Attack(Max, Steven);
        }
        System.out.print(Steven.health);
    }

    public static void Attack(Hero Attacker, Hero defender){
        defender.health -= Attacker.attDmg - defender.def;
    }
}

