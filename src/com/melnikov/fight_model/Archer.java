package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class Archer extends Hero{

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        int damage = Utils.getRandomNumber(9, 19);
        int chance = Utils.getRandomNumber(0, 100);

        if (chance > 15){
            enemy.takeDamage(damage);
            System.out.println(super.getName() + "attacked " + enemy.getName() + " with a demon sword! (" + damage + ")");
        }
        else {
            System.out.println(super.getName() + " missed");
        }
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
