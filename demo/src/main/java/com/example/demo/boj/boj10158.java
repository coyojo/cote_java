package com.example.demo.boj;

import java.util.Scanner;

public class boj10158 {
    /*  W * H 격자 공간에서 대각선으로 이동하는 개미의 T시간 후 위치

    개미의 현재 위치를 나타내는 변수
        int currentX = P;
        int currentY = Q;

        개미의 이동방향을 나타내는 변수
        int deltaX = 1; 오른쪽 이동
        int deldaY = 1; 위쪽 이동

        while ( T --  > 0 ) {
            if ( currentX == W ) deltaX = -1;   => 즉 현재 X 위치가 오른쪽 경계인 W에 왔다는것이므로 deltaX값을 -1로 바꿔준다
            else if ( currentX == 0) deltaX = 1;  => 현재 X 위치가 왼쪽 경계인 0에 왔으면 다시 deltaX값을 1로 바꿔줘야한다
            if(currentY == H ) deltaY = -1;
            else if (currentY == 0 ) deltaY = 1;
            currentX += deltaX;
            currentY += deltaY;
        }   => 풀이가 간단하지만 시간 초과를 받게된다!

        10 22 34
        T시간의 X좌표 4초에 1

     */

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int W = sc.nextInt();
         int H = sc.nextInt();
         int P = sc.nextInt();
         int Q = sc.nextInt();
         int T = sc.nextInt();


         int timeX = T % (2 * W);
         int currentX = P;
         int deltaX = 1;
         while (timeX-- > 0 ) {  // timeX을 한시간씩 감소시키면서
             if(currentX == W) deltaX = -1;
             else if (currentX == 0) deltaX = 1;
             currentX += deltaX;
         }

         int timeY = T % (2 * H);
         int currentY = Q;
         int deltaY =1;
         while (timeY-- > 0) {
             if(currentY == H) deltaY = -1;
             else if (currentY == 0) deltaY = 1 ;
             currentY += deltaY;
         }
         System.out.println("currentX = " + currentX + "currentY =" + currentY);
     }



}
