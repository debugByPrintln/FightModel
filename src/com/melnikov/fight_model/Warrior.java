package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class Warrior extends Hero{

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        int damage = Utils.getRandomNumber(7, 15);
        enemy.takeDamage(damage);
        System.out.println(super.getName() + " attacking an enemy with the axe! (" + damage + ")");
    }

    @Override
    public boolean isAlive() {
        boolean res = true;
        int currentHealth = getHealth();
        if (currentHealth <= 0){
            res = false;
        }
        return res;
    }
}
