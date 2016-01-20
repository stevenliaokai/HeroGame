package com.company;


public class Main {

    public static void main(String[] args) {
        // writegit  your code here
        int hurt = getDmg(300, 150);
        System.out.print("Hurt:" + hurt);

    }

    public static int getDmg(int attackDamage, int defence) {
        return attackDamage - defence;
    }
}

