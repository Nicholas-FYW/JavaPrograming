package com.igeek.Project08.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        //1、零钱通明细
        Scanner scanner = new Scanner(System.in);
        String chooice = "";
        boolean loop = true;
        //2、收益明细
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        double money = 0;
        double balance = 0;
        String detail = "----------零钱通明细----------";
        //3、消费
        //定义消费原因
        String note = "";
        //4、退出确认
        String key = "";
        do {
            System.out.println("--------零钱通菜单-------\n");
            System.out.println("\t\t\t1、零钱通明细\n");
            System.out.println("\t\t\t2、收益入账\n");
            System.out.println("\t\t\t3、消费\n");
            System.out.println("\t\t\t4、退出\n");

            System.out.print("请选择（1-4）：");
            chooice = scanner.next();
            switch (chooice) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    //业务逻辑待会处理
                    if (money <= 0) {
                        System.out.println("收益入账金额大于零");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n入账明细\t+" + money + "\t" + sdf.format(date) +"\t" +balance;
                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    //业务逻辑等会再写
                    if(money <= 0 || money > balance) {
                        System.out.println("消费金额在0-" + balance);
                        break;
                    }
                    System.out.print("消费地点:");
                    note = scanner.next();
                    date = new Date();
                    balance -= money;
                    detail += "\n"+ note +"\t-" + money + "\t" + sdf.format(date) +"\t" +balance;
                    break;
                case "4":
                    while(true) {
                        System.out.print("确认退出吗？y/n");
                        key = scanner.next();
                        if("y".equals(key) || "n".equals(key)) {
                            break;
                        }
                    }
                    if(key.equals("y")) {
                        loop = false;
                    }

                    break;
                default:
                    System.out.println("请选择（1-4）");
            }

        } while (loop);
        System.out.println("退出成功");
    }
}
