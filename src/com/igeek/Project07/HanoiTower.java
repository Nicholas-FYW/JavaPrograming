package com.igeek.Project07;
//汉诺塔
public class HanoiTower {
    public static void main(String[] args) {
        Text text = new Text();
        text.move(5, 'a', 'b', 'c');
    }
}
class Text {
    public void move(int num, char a, char b, char c){
        if(num == 1) {
            System.out.println(a + "->" + c);
        } else {
            move(num - 1, a ,c ,b);
            System.out.println(a +"->" + c);
            move(num - 1, b, a ,c);
        }
    }
}
