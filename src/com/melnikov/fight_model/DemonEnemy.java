package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class DemonEnemy extends Enemy{
    public DemonEnemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        int damage = Utils.getRandomNumber(9, 19);
        int chance = Utils.getRandomNumber(0, 100);

        if (chance > 80){
            hero.takeDamage(damage);
            System.out.println(super.getName() + " attacked " + hero.getName() + " with a demon sword! (" + damage + ")");
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
