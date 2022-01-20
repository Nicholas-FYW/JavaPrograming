package com.igeek.Project08;

public class B {
    public void f1() {
        A a = new A();
        System.out.println(a.n1 + a.n2 + a.n3 );
        a.f1();
        a.f2();
        a.f3();
    }
}
