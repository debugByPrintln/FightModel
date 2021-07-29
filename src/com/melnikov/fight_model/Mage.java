package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class Mage extends Hero{
    public static int MAGE_DAMAGE;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        int damage = Utils.getRandomNumber(7, 15);
        enemy.takeDamage(damage);
        System.out.println(super.getName() + " just casted a fireball into the enemy!(" + damage + ")");

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
