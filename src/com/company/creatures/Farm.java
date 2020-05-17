package com.company.creatures;

public class Farm extends Animal implements Edible {
    public boolean life = true;

    public Farm(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Animal is dead");
        life = false;
    }
}