package com.company;


public class Main {

    public static void main(String[] args) {
        Hero Steven = new Hero("Steven", "Liao", 35, 20, "shuangdao", 600, 1, false);
        Hero Max = new Hero("Max", "Zeng", 30, 15, "", 500, 10, true);
        while(Max.health > 0 && Steven.health > 0) {
            Max.Attack(Steven);
            Steven.Attack(Max);
        }
        System.out.println("Max health : "  + Max.health);
        System.out.println("Steven health : " + Steven.health);
    }

}

