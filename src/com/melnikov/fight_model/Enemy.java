package com.melnikov.fight_model;

import com.melnikov.fight_model.Utills.Utils;

public abstract class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name ,int health) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage){
        setHealth(health - damage);
    }

    public abstract void attackHero(Hero hero);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

}
