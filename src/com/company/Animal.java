package com.company;

import java.io.File;

public class Animal implements   feeding, sell {
    final String species;
    String name;
    static final Double STANDARD_CAT_WEIGHT = 20.0;
    File pic;
    static final Double STANDARD_DOG_WEIGHT = 70.0;
    static final Double OTHER_WEIGHT  = 1.0;
    private Double weight;


    public Animal(String species) {
        this.species = species;
        if (species.equals("Cat")) {
            weight = STANDARD_CAT_WEIGHT;
        } else if (species.equals("Dog")) {
            weight = STANDARD_DOG_WEIGHT;
        } else {
            weight = OTHER_WEIGHT;
        }

    }



    public void feed() {
        weight++;
        System.out.println("New weight is" + weight);

        if (weight <= 0) {
            System.out.println("You can't walk with dead animal");
        }
    }

    public void takeForAWalk() {
        weight--;
        System.out.println("New weight is" + weight);

        if(weight<=0) {
            System.out.println("you can't go outside because they are dead");
        }
    }
    @Override
    public void sellMe() {
        if (this.getClass().getName() == "com.company.Human") {
            System.out.println("You can't sell pepople");
        } else {
            System.out.println("Price is 1500$");
        }
    }

    @Override
    public void beEaten() {
        weight = 0.0;
        System.out.println("Animal is dead");
    }



}





