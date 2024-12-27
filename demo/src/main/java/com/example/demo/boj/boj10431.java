package com.example.demo.boj;

import java.util.Scanner;

public class boj10431 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();  // 테스트 케이스의 수
        while (P-- > 0) {
            int T = sc.nextInt();  //테스트 케이스 번호
            int[] h = new int[20]; // 20개의 양의 정수
            //20개의 정수를 담을 반복문 1개
            for(int i = 0; i<20; i++)
                h[i] = sc.nextInt();
            // 정렬을 할 반복문( 학생들을 줄 새울 배열)
            int cnt = 0;  // 정답( 물러난 횟수)
            int[] sorted = new int[20];
            for (int i=0; i<20; i++){
                //1.줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                //1-1 찾지 못했다면, 줄의 가장 뒤에 선다
                boolean find = false;
                 for (int j=0; j<i; j++)// 자신보다 앞이니까 i 보다 작을 경우를 조건으로 한다
                    if(sorted[j]> h[i]){
                        //2. 찾았다면, 그 학생의 앞에 선다
                        ///3.그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        for (int k = i - 1; k >= j ; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                 if(!find) sorted[i] = h[i];
            }
            System.out.println(cnt);
        }
    }
}
