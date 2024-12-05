package com.example.demo.boj;
//애너그램 만들기

import java.util.Scanner;

/*
문제 : 두 단어를 애너그램으로 만들기 위해 제거해야하는 문자의 최소 개수
애너그램 : 단어의 구성(알파벳과 그 개수) 이 완전히 같은 단어

    1: A = "aabbcc" 이고  B = "xxyybb" 의 답은 왜 8일까??
     - A의 {a,a,c,c} 가 B에 없으니 지워야만 함
     - B의 {x,x,y,y} 가 A에 없으니 지워야만 함
     2. 없애야만 하는 문자 : 공통 문자를 제외한 전부

     문제에서 예시로나온 단어
     A = dared { a: 1 개 , b: o개 , d:2개 , e:1개 , r: 1개}
     B = bread { a:1 개 , b: 1개, d :1개 , e :1개 , r: 1개 }
     위에서 알파벳 개수 차이가 나는 b 1개와 d 1개는 삭제되어야 할 문자 이므로 2개 제거 하면 된다

 */
public class boj1919 {

    public static void main (String[] args){
        // 1. 두개의 단어를 입력 받음
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        //각 String의 알파벳 구성을 배열로 구함
        int[] countA = new int[26]; // 알파벳이 26자이므로 26개의 인덱스로 구성된 배열생성
        int[] countB = new int[26];
        for (int i=0 ; i<a.length(); i++)
            countA[a.charAt(i)-'a']++; //a를 빼주는 이유는 0번 인덱스부터 abcd 순서대로 0,1,2,3 이렇게 매핑하려고
            //countA배열은 int값을 갖는 배열로서 단어 bread의 charAt(0)은 b이고 b에서 a의 거리차는 1이므로 countA[1]이
            // 의미하는것은 알파벳 b의 인덱스 이므로 b가 1개 있으므로 ++ 에 의해서 1로 증가
        for(int i=0; i<b.length(); i++)
            countB[b.charAt(i)-'a']++;

        // 두개의 단어에 알파벳 숫자 비교
        int ans = 0;
        for(int i = 0; i<26; i++){
            if(countA[i] > countB[i])
                ans += countA[i] - countB[i];
                else if (countB[i] > countA[i])
                    ans += countB[i] - countA[i];
            }
                System.out.println(ans);
            }



            /*
             자바에서 문자 char는 ascii 값을 기반으로 처리됩니다.
             위 코드에서 countA은 알파벳 26개('a' 부터 'z')를 나타내는 배열입니다.
            'a'를 0번 인덱스에 매핑하려면, 'a'의 ASCII 값에서 'a'의 ASCII 값을 빼줘야 합니다.
            'a'-'a' = 97 - 97 = 0 => 베열의 0번 인덱스
            'b' -'a' = 98 - 97 = 1 => 배열의 1번 인덱스
            'z' - 'a' = 122 - 97 = 25=> 배열의 25번 인덱스  따라서 a.charAt(i)-'a' 는 해당 알파벳을
            배열의 0~25 사이 인덱스로 변환하는 역할을 합니다.

            만약 입력 문자열이 "aabbcc"라면:

            1.첫 번째 문자인 'a'는 'a' - 'a' = 0 → countA[0]++ → countA[0] = 1
            2.두 번째 문자인 'a'는 'a' - 'a' = 0 → countA[0]++ → countA[0] = 2
            3.세 번째 문자인 'b'는 'b' - 'a' = 1 → countA[1]++ → countA[1] = 1 이런 식으로 진행됩니다.
            결과적으로 countA는 [2, 2, 2, 0, 0, 0, ..., 0]이 됩니다.

            요약:
              'a'를 빼줌으로써 알파벳 'a'부터 'z'까지를 배열의 인덱스 0부터 25까지 매핑할 수 있습니다.
             */

        }


