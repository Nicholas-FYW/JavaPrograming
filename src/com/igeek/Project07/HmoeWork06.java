package com.igeek.Project07;

public class HmoeWork06 {
    public static void main(String[] args) {

    }
}
class Cale {
    double a;
    double b;
    public Cale(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double sum() {
        return a +b;
    }
    public double sub() {
        return a - b;
    }
    public double multiply() {
        return a * b;
    }
    public Double div() {
        if(b == 0) {
            return null;
        } else {
            return a / b;
        }
    }
 }
