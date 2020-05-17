package com.company;

public class Car {
    final String producer;
    final String model;

   private double year;
    public Car(String  producer, String model, Integer year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
    }
    public Double getyear() {
        return year;
    }

    public void setMileage(Double mileage) {
        this.year = mileage;
    }

}