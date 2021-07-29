package com.melnikov.fight_model;

public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy("E", 100);
        Hero one = new Warrior("W", 100);

        System.out.println(enemy.getHealth() + " " + one.getHealth());
        one.attackEnemy(enemy);
        enemy.attackHero(one);
        System.out.println(enemy.getHealth() + " " + one.getHealth());


    }

//    public static void heroesAttackTest(Hero... heroes){
//        for (Hero hero : heroes) {
//            hero.attackEnemy();
//        }
//    }

}
