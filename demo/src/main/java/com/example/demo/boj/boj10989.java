package com.example.demo.boj;

import java.util.Scanner;

public class boj10989 {
    /*
    문제 : N 개의 수가 주어졌을 때 , 이를 오름차순으로 정렬하는 프로그램을 작성
    입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
    출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다

    int[] cnt = new int[10001];
    for(int i =0 ; i < N; i++)
        cnt[sc.nextInt()]++;  // 입력을 받을때 마다 하나씩올려줌 시간복잡도 O(N)
    for(int i = 1 ; i <= 10000; i++)
        while(cnt[i]-- >0) { 각각의 숫자가 존재할때 까지 출력해주면 된다
        System.out.println(i);
        }

        java를 사용하고 있다면 , Scanner와 System.out.println
        대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는
        맨 마지막에 한 번만 하면 된다.
        아래의 코드로 하면 시간초과가 뜬다
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] cnt = new int[10001];

        for (int i =0; i<N; i++)
            cnt[sc.nextInt()]++;

        for (int i=1 ; i <= 1000; i++)
            while (cnt[i]-- >0){
                System.out.println(i);
            }
    }


}
