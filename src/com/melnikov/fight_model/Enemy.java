package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name ,int health) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage){
        setHealth(health - damage);
    }

    public void attackHero(Hero hero){
        int damage = Utils.getRandomNumber(3, 8);
        hero.takeDamage(damage);
        System.out.println("Enemy attacks hero! (" + damage + ")");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
