package com.example.demo.boj;

import java.util.Scanner;

public class boj1543_ver2 {  // String.indexOf를 사용하여 좀 더 편하게 풀 수 있다.
    public static void main(String[] args){
        //doc 문자열의 startIndex부터 처음으로 등장하는 word 문자열을 찾는다. 찾았다면 일치하는 시작 인덱스를 반환, 못찾으면 -1을 반환
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int startIndex = 0;
        int count = 0;
        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            //indexOf(String str, int fromIndex) : str은 검색할 문자열 , fromIndex는 검색을 시작할 시작 인덱스
            if(findIndex< 0)
                break;
            startIndex = findIndex + word.length(); // 다음에 검색할 위치를 word의 길이만큼 옯겨줘야하니까
            count++;
        }
        System.out.println(count);
    }
}
