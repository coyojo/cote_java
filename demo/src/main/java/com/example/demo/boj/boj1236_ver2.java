package com.example.demo.boj;

import java.util.Scanner;

public class boj1236_ver2 {
    // 행열을 한번에

    public static void main(String[] args){
           /*1. 각 행/열에 대해 경비원이 있는지 확인한다.

      2. 보호받지 못하는 행/열의 개수를 구한다.
      3. 둘 중 큰 값을 출력한다.
     */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] map= new char[N][M];
        for (int i=0; i<N; i++)
            map[i] = sc.next().toCharArray();
            /*
            toCharArray()는 문자열을 한 글자씩 쪼개서 문자 배열(char array)로 변환합니다.
            예를 들어, "abcd".toCharArray()는 {'a', 'b', 'c', 'd'}와 같은 배열이 됩니다.
            map[0] = {'a', 'b', 'c', 'd'}
             */
        //1. 각 행열에 대해 경비원이 있는지 확인
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        for (int i =0; i<N; i++)
            for(int j=0; j<M; j++)
                if (map[i][j] == 'X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }


        //보호받지 못하는 행열의 개수를 구한다
        int needRowConut = N;
        int needColCount = M;
        for(int i=0; i<N; i++)
            if(existRow[i]) needRowConut--;
        for(int i=0; i<M; i++)
            if(existCol[i]) needColCount--;
        //둘 중 큰 값을 출력한다.
        System.out.println(Math.max(needRowConut,needColCount));
    }


}
