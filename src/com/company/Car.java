package com.company;

public class Car implements sellACar {
      String producer;
     String model;
Double value;
    private Double year;
    public Car(String  producer, String model, Double year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value=value;
    }
    public Double getyear() {
        return year;
    }

    public void setproducer(Double year) {
        this.producer = producer;
    }

    public Double getvalue(){return this.value;}

    @Override
    public void sellMe() {

    }


}



