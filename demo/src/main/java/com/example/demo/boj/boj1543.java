package com.example.demo.boj;

import java.util.Scanner;

/*
 문제 : 주어진 단어가 문서에 등장하는 횟수
 1. 문서의 첫 글자부터 순회한다.
 2. 문서의 지금 글자부터 주어진 단어와 한글자씩 비교한다.
 3. 단어와 완전히 일치하면 개수를 올린다.
    해당 단어가 등장한 이후부터 2를 반복한다.
    3-1. 단어와 매치되지 않았다면 다음 글자에서 2를 반복한다/

 */

public class boj1543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String doc =sc.nextLine();
        String word = sc.nextLine();
        int count = 0;
        for(int i=0; i<doc.length(); i++){
            boolean isMatch = true;
            for(int j=0; j<word.length(); j++){
                if(i + j >= doc.length() ||
                        doc.charAt(i+j) != word.charAt(j)){
                    isMatch = false;
                    break;
                    //문서에서 i번째 인덱스부터 시작하는 단어는 주어진 단어와 일치하지 않는다.
                }
            }
            if(isMatch){
                count++;
                i += word.length() -1 ;
            }
        }

        System.out.println(count);
    }
}


/*
	1. i = 0 에서 시작 :
			 j = 0 : doc.charAt(0) == 'a' (일치)
			 j = 1 : doc.charAt(1) == 'b'( 일치)
			 isMatch = true 이고 count = 1로 증가, 그리고 i += word.length() -1 인데 i는 반복문 돌면서 1이 증가하므로 word.length() -1 을 해줘서 i =2 가 된다
			 그래서 i=2로 이동

		2. i = 2 에서 시작 ('a')
			 j = 0 일때 doc.charAt(2)== word.charAt(0)=='a'
			 j = 1 일때 doc.charAt(3) == word.charAt(1) == 'b'
			 isMatch = true
			 count = 2는 2로 증가, i += 2-1 로 i는 i++로 인해서 3이 되었으니 4로 증가

		3. i = 4에서 시작: ('a')
		   j = 0 : doc.chartAt(4) == 'a'
		   j = 0 일때 doc.charAt(4)== word.charAt(0)=='a'
			 j = 1 일때 doc.charAt(5) == word.charAt(1) == 'b'
			 isMatch = true
			 count = 3는 3로 증가, i += 2-1 로 i는 i++로 인해서 5이 되었으니 6로 증가

		4. i=6에서 종료

		결과 count = 3


 */
