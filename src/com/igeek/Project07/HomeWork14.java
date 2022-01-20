package com.igeek.Project07;

import java.util.Random;

public class HomeWork14 {
}

class Tom {
    int a;
    int win;
    int fail;

    public Tom(int a) {
        this.a = a;
    }

    public int Computer() {
        Random rand = new Random();
        int com = rand.nextInt(3);
        System.out.println(com);
        return com;
    }

    public void playCom() {
        int com = this.Computer();
        if (com == a) {
            System.out.println("平了");
        } else {
            if (a != 0 && com != 2 || a != 2 && a != 0) {
                if (a < com) {
                    System.out.println("赢了");
                    win++;
                } else {
                    System.out.println("输了");
                    fail++;
                }
            } else {
                if (a > com) {
                    System.out.println("赢了");
                    win++;
                } else {
                    System.out.println("输了");
                    fail++;
                }
            }
        }
    }
}