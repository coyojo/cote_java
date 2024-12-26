package com.example.demo.boj;

import java.util.Scanner;

public class boj1236 {
    /*1. 각 행/열에 대해 경비원이 있는지 확인한다.
      2. 보호받지 못하는 행/열의 개수를 구한다.
      3. 둘 중 큰 값을 출력한다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();
        // 각 행열에 대해 경비원이 있는지 확인한다.
        // 먼저 Row에 대해서 확인
        int existRowCount = 0;
        for(int r = 0; r <N; r++){  // row를 보니까 N까지
            boolean exist = false;
            for (int c = 0; c < M; c++)
                if(map[r][c] == 'X'){
                    exist = true;
                    break;
                }
            if (exist) existRowCount++;  // exist가 true면 existRowCount를 1증가
        }

        // 이번에는 Coulumn에 대해서 확인
        int existColCount = 0;
        for(int c=0; c < M; c++){
            boolean exist = false;
            for(int r=0; r<N; r++)
                if(map[r][c]=='X'){
                    exist = true;
                    break;
                }
            if (exist) existColCount++;
        }


        //보호받지 못하는 행열의 개수를 구한다
        int needRowConut = N - existRowCount;
        int needColCount = M - existColCount;


        //둘 중 큰 값을 출력한다.
        System.out.println(Math.max(needRowConut,needColCount));
    }


}
