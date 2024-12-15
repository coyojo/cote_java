package com.example.demo.boj;


import java.util.Scanner;

//HH:MM:SS 포맷의 두 시각의 차이를 HH:MM:SS 포맷으로 출력하기
        /*

         1. ' : ' 문자를 기준으로 시간, 분, 초를 쪼갠다.
             각 단위의 인덱스에서 10의 자리와 1의 자리를 구해 계산할 수 있다.
             String time = "09:10:59";
             int hour = (time.charAt(0) - '0') * 10 + time.charAt(1)-'0';
             위 코드를 자세히 살펴보자면, String으로 받은 값이기 때문에 int로 바꾸기 위해서 아스키 값인 '0'을 빼줘야 int로 바꿀 수 있다.
             10을 곱해주는 이유는 10의 자리수 이므로 곱해준다!

             <다른 방법 1>
             String.substring을 사용하면 원하는 문자열만 떼올 수 있다.
             String time = "09:10:59";
             int hour = Integer.parseInt(time.substring(0,2)); substring 뒤에 1이 아니라 2를 쓰는 이유는 마지막 글자는 포함을 안시키는 특징이 있으므로 0,1 인덱스까지만 나온다
             int minute = Integer.parseInt(time.substring(3,5));

            <다른 방법 2>
            String[] time = "09:10:59".split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);

            2. 두 시간, 분, 초의 차이를 계산한다. (현재 시각으로부터 투하 시각까지 필요한 시간)
            <방법 1>
            int needHour = dropHour - currentHour ; (오전 6시에서 밤 22시를 빼면 음수가 나오는 문제 발생)
            if(needSecond < 0) { // 1분을 60초로 변환해 더해준다.
               needSecond += 60; needMinute-- ;
            if(needMinute < 0) { // 1시간을 60분으로 변환해 더해준다.
                needMinute += 60; needHour-- ;
             if(needHour<0)  //하루를 24시간으로 변환해 더해준다.
                needHour += 24;

            <방법 2> 가장 작은 단위로 통일
            int currentSecondAmount
                = currentHour * 3600 + currentMinute * 60 + currentSecond;
            int dropSecondAmount
                = dropHour * 3600 + dropMinute * 60 + dropSecond;

            int needSecondAmount = dropSecondAmount - currentSecondAmount;
            if( needSecondAmount < 0)
                needSecondAmount += 24 * 3600;

            int needHour = needSecondAmount / 3600;
            int needMinute = (needSecondAmount % 3600) / 60;
            int needSecond = needSecondAmount % 60;


         3. 구해진 시간을 HH:MM:SS 형태로 출력
            String ans = "";
            if(needHour < 10 ) ans += "0" + needHour + ":" ;
            else ans += needHour + ":";
            if(needMinute < 10 ) ans += "0" +needMinute + ":" ;
            else ans += needMinute + ":" ;

         */
public class boj13223 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currnetMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentSecondAmount = currentHour * 3600 + currnetMinute * 60 + currentSecond;

        String[] dropUnit = drop.split(":");
        int dropHour = Integer.parseInt(dropUnit[0]);
        int dropMinute = Integer.parseInt(dropUnit[1]);
        int dropSecond = Integer.parseInt(dropUnit[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmount = dropSecondAmount- currentSecondAmount ;
        if(needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60 ;  // 시간으로 나눈 나머지에 60초가 얼마나 있는지 계산하면 분
        int needSecond = needSecondAmount % 60 ;
        System.out.println(needSecond);
        System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);
    }
}
