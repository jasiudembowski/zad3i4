package com.company;

import java.math.BigDecimal;

public class Human implements sell {
    String firstName;
    String lastName;
    private  Phone phone;
    Animal pet;
    private Car auto;
    private BigDecimal salary;
    private SalaryHistory SalaryHistory;
    private Car car;
    public Double cash=400.0;


    public Human() { this.SalaryHistory = new SalaryHistory();}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public String getFirstName() {
        return firstName;
    }






    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }


    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Car getCar() {

        return car;
    }

    public void setCar(Car car) {
        if(this.salary.compareTo(BigDecimal.valueOf(car.getvalue()/1))==1 ){
            System.out.println("You can buy it");
            this.car=car;
        }
        else if( this.salary.compareTo(BigDecimal.valueOf(car.getvalue() / 12.0)) == 1)
        {
            System.out.println("You can take a credit");
            this.car=car;

        }
        else
        {
            System.out.println("this car is too expensive sorry :/");
        }

    }

    public Double getSalary() {
        this.SalaryHistory.displayHistoryOfSalary();
        return salary.doubleValue();
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("Payment cannot be reduced from scratch");
        } else {
            System.out.println("Everything was covered by the accounting system, the annex to the contract, ZUS and the US got everything");
            this.SalaryHistory.saveHistoryAccountCharge(salary);
            this.salary = BigDecimal.valueOf(salary);
        }
    }
    public String toString() {
        return firstName + "   " + lastName + "   " + phone;
    }
    @Override
    public void sellMe(Human buyer, Human seller, Double price)  {

    }


}
