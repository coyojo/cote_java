package com.example.demo.boj;

import java.util.Scanner;

public class boj1157_ver3 {
    // 단어마다 알파벳 갯수를 세는 방법
    public static int getAlphabetCount(String str, char alp){
        int count= 0;
        for(int i=0; i<str.length();i++)
            if(alp == str.charAt(i)) count++;
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int maxCount = -1;
        char maxAlphabet = '?';
        for(char alp ='A'; alp <='Z'; alp++){
            int count = getAlphabetCount(str, alp);
            if (count>maxCount) {
                maxCount = count;
                maxAlphabet = alp;
            } else if (count == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }

}
