package com.igeek.Project08;

public class Account {
    private String name;
    private double deposit;
    private String password;

    public Account() {
    }

    public Account(String name, double deposit, String password) {
        setName(name);
        setDeposit(deposit);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len >= 2 && len <= 4) {
            this.name =name;
        } else {
            System.out.println("长度为2、3、4");
            this.name = "none";
        }

    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        if(deposit > 20) {
            this.deposit = deposit;
        } else {
            System.out.println("存款>20");
            this.deposit = 22;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if(len == 6) {
            this.password = password;
        } else {
            System.out.println("密码为6位s");
            this.password = "123456";
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", deposit=" + deposit +
                ", password='" + password + '\'' +
                '}';
    }
}
