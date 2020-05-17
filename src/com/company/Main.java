package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");

        dog.name="Haiko";


        System.out.println("I am "+dog.name);

        dog.feed();
        dog.feed();
        dog.feed();

        Car golf4 = new Car("golf", "golf4", 2000);

        Human me = new Human();
        me.firstName="Jan";
        me.lastName="Dembowski";
        me.pet = dog;
        Animal cat = new Animal("cat");
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();


        me.setSalary(200.0);
        me.getSalary();


    }
}
