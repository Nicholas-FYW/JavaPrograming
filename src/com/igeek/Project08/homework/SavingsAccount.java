package com.igeek.Project08.homework;

public class SavingsAccount extends BankAccount{
    private double yearRate = 0.01;
    private int count = 3;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public void earnMonthlyInterest() {
        super.deposit(yearRate / 12 * getBalance());
        count = 3;
    }
    @Override
    public void deposit(double amount) {
        if(count > 0) {
            super.deposit(amount - 1);
        } else {
            super.deposit(amount);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0) {
            super.deposit(amount + 1);
        } else {
            super.deposit(amount);
        }
        count--;
    }

}
