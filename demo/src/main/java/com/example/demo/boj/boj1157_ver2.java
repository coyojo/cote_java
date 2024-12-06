package com.example.demo.boj;

import java.util.Scanner;

//toUpperCase() 사용하여 작성
public class boj1157_ver2 {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'A']++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] count = getAlphabetCount(str);  // "Brecaaad" => "BRECAAAD" => [3,1,1,....]

        int maxCount = -1;
        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {

            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A' +i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }

}
