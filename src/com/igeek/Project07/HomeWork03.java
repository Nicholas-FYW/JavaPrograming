package com.igeek.Project07;

public class HomeWork03 {
    public static void main(String[] args) {

    }
}
class Book {
    double price;
    public Book(double price) {
        this.price = price;
    }
    public void updatePrice() {
        if(this.price > 150) {
            this.price = 150;
        } else if(price > 100) {
            this.price = 100;
        }
    }
}
