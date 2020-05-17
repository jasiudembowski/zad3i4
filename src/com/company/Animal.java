package com.company;

import java.io.File;

public class Animal implements sell1 {
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
    public void sellMe(Human seller, Human buyer, Double price) throws Exception {
        if (this.getClass().getName() == "com.company.Human") {
            throw new Exception("You can buy a pepople!");
        }
        if (buyer.cash < price) {
            throw new Exception("You don't have enough cash");
        }
        if (seller.getPet() != this) {
            throw new Exception("It isn't your pet");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.setPet(this);
        seller.setPet(null);
        System.out.println(buyer.getFirstName() + " You bought " + this + " from " + seller.getFirstName());
    }



}





