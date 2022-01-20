package com.igeek.Project08.homework;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        //调用父类的方法实现存款
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        //调用父类的方法实现取款
        super.withdraw(amount + 1);
    }
}
