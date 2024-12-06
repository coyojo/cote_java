package com.example.demo.boj;

import java.util.Scanner;
//1. 각 알파벳의 개수를 구한다
//2. 그 중 최댓값을 구한다

public class boj1157 {
    public static int[] getAlphabetCount(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A'<= ch && ch <= 'Z')
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }
    public static void main(String[] args){
        //1. 단어를 입력받는다
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] count = getAlphabetCount(str);
        for (int i=0; i<26; i++){
            if(count[i]>0)
            System.out.println((char)('A'+i)+" : " + count[i]);
        }

        int maxCount = -1;  // 가장 큰 값으로 계속 갱신 시켜야 하므로 상관없는 값인 -1을 할당해놓기
        char maxAlphabet = '?';
        for(int i=0; i<26; i++){
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A'+i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
            System.out.println(maxAlphabet);

        //3. 알파벳 개수를 센다 (대소문자 구분하지 않는다)
        //4. 가장 많이 사용된 알파벳을 찾는다. 대문자로 출력



    }
}
