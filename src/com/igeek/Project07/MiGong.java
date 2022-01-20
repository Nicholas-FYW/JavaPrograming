package com.igeek.Project07;
//老鼠出迷宫
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //表示地图 用0表示可以走的通  用1表示走不通
        //把地图的第一行和最后一行设置为 1 map[0][i]  map[7][i]
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //把地图的第一列和最后一列设置为 1 map[i][0]  map[i][6]
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        T t = new T();
        t.findWay(map, 1, 1);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
class T {
       public boolean findWay(int[][] map, int i, int j) {
           if(map[6][5] == 2) {
               return true;
           } else {
               if(map[i][j] == 0){
                    map[i][j] = 2;
                    if(findWay(map, i, j + 1)) {
                        return true;
                    } else if(findWay(map, i + 1, j)) {
                        return true;
                    } else if(findWay(map, i, j)) {
                        return true;
                    } else if(findWay(map, i, j -1)) {
                        return true;
                    } else if(findWay(map, i - 1, j + 1)){
                        return true;
                    } else {
                        map[i][j] = 3;
                        return false;
                    }
               } else {
                    return false;
               }
           }
       }



}

