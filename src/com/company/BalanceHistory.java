package com.company;

import java.time.LocalDate;

public class BalanceHistory {
    private static final String MESSAGE = "Last salary equals %s %s";
    private Double lastSalary;
    private LocalDate accountChargeDate;

    public BalanceHistory() {
    }

    public Double getLastBalanceSalary() {
        return lastSalary;
    }

    public LocalDate getAccountChargeDate() {
        return accountChargeDate;
    }

    public void saveHistoryAccountCharge(Double valueOfSalary) {
        this.lastSalary = valueOfSalary;
        this.accountChargeDate = LocalDate.now();
    }

    public void displayHistoryOfSalary() {
        String message = String.format(MESSAGE, this.lastSalary, this.accountChargeDate);
        System.out.println(message);
    }
}
