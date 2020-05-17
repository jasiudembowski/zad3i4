package com.company;

import com.company.creatures.Animal;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");

        dog.name = "ława";
        dog.name = "ława";



        System.out.println("I am " + dog.name);


        dog.feed();

        Car golf4 = new Car("golf", "golf4", (double) 2000);

        Human me = new Human();
        me.firstName = "Jan";
        me.lastName = "Dembowski";
        me.pet = dog;
        Animal cat = new Animal("cat");

        cat.feed();
        cat.takeForAWalk();


        me.setSalary(200.0);
        me.getSalary();
        Human myGirlfriend = new Human();
        myGirlfriend.setFirstName("Monika");
        myGirlfriend.setLastName("Waleryś");
        Animal sonia = new Animal("dog");
        myGirlfriend.setSalary(3000.0);


        System.out.println(me.toString());


        try {
            me.getPet().sellMe(me, myGirlfriend, 20.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.println("My girlfriend pet  " + me.pet + " her cash: " + me.cash);
            System.out.println("My pet  " + me.pet + " my cash: " + me.cash);
            //sell bob my pet
            me.sellMe(myGirlfriend, me, 100.00);
            System.out.println("My sister pet  " + myGirlfriend.pet + " her cash " + me.cash);
            System.out.println("My pet  " + me.pet + " my cash:" + me.cash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}









