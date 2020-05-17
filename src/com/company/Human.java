package com.company;

import java.math.BigDecimal;

public class Human {
    String firstName;
    String lastName;
   private  Phone phone;
     Animal pet;
    private Car auto;
    private BigDecimal salary;
    private SalaryHistory SalaryHistory;
    private Car car;


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

    public Car getCar(Car car) {

        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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


}
