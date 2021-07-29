package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class Archer extends Hero{
    public static int ARCHER_DAMAGE = 10;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        int damage = Utils.getRandomNumber(7, 15);
        enemy.takeDamage(damage);
        System.out.println(super.getName() + " just shot an enemy with an arrow!(" + damage + ")");
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
