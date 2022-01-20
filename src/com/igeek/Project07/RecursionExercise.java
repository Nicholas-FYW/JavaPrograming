package com.igeek.Project07;

public class RecursionExercise {
    public static void main(String[] args) {
        A a = new A();
        int b = a.recursion(7);
        System.out.println(b);
        int peach = a.eat(1);
        System.out.println(peach);

    }
}
class A {

    public int recursion(int n) {
        if(n == 1 || n == 2){
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }
    //思路分析
    //第十天 ：1个桃子
    //第九天 : （1+1）*2 = 4
    //第八天 ：（4+1）*2 = 10
    public int eat(int days) {
        if(days >= 1){
            if( days == 10) {
                return 1;
            } else {
                return (eat(days + 1) + 1) * 2;
            }
        } else {
            System.out.println("天数在1-10");
            return -1;
        }

    }
}
