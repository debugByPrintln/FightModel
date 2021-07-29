package com.melnikov.fight_model;

public class BattleGround {
    public static void main(String[] args) throws InterruptedException {
        Hero legolas = new Warrior("Legolas", 100);
        Enemy sauron = new DemonEnemy("Sauron", 500);


        while (sauron.isAlive() && legolas.isAlive()){
            legolas.attackEnemy(sauron);
            sauron.attackHero(legolas);

            System.out.println("Hero's health: " + legolas.getHealth() + "\n"
            + "Enemy's health: " + sauron.getHealth());
            System.out.println("-------------------------------------------------------------");

            Thread.sleep(10000);

        }
    }
}
