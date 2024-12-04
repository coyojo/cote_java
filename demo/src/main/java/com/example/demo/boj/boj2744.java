package com.example.demo.boj;

import java.util.Scanner;

public class boj2744 {
    /*영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
     대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
     1.첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다
     2.첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
     아스키 코드를 보면 대문자 A~Z까지의 인덱스 차이가 소문자 a~z 인덱스 차이와 같다.

     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 띄어쓰기나 공백으로 구분된 문자열이 받아짐 w  asdg 이렇게 입력하면 w만 받아짐!
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // ch가 대문자니??
            if('A' <= ch && ch <='Z')
                //int dist = str.charAt(i) - 'A';
                //int lower_ascii = 'a' + dist;
                // 대문자면 소문자로 출력하하기 위해 소문자'a'에 인덱스 값을 더한 값을 char로 변환하여 출력
                System.out.print((char)('a'+ch-'A'));

            else System.out.print((char) ('A'+ch-'a'));
        }
    }
    /*
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            // 대문자니??
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                ans += (char)('a' + str.charAt(i) - 'A');
            } else ans += (char) ('A' + str.charAt(i) - 'a');


        }
        System.out.print(ans);
    }

  // 또 다른 풀이
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();

        for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if('A' <= ch && ch <= 'Z'){
        ans[i] += ('a' + ch - 'A');
        else ans[i] += ('A' + ch -'a');
    }
    System.out.print(ans);


     */


}
