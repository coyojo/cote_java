package com.example.demo.boj;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ByteSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("바이트 수를 입력하세요: ");
        int byteSize = scanner.nextInt();
        scanner.close();

        String input = "이노룰스Innorules";
        List<String> result = splitByByteSize(input, byteSize);

        System.out.println(result);
    }

    public static List<String> splitByByteSize(String input, int byteSize) {
        List<String> result = new ArrayList<>();
        StringBuilder currentSegment = new StringBuilder();
        int currentByteCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int charByteSize = String.valueOf(c).getBytes(StandardCharsets.UTF_8).length;

            // 한글이 잘리는 경우 방지
            if (currentByteCount + charByteSize > byteSize) {
                result.add(currentSegment.toString());
                currentSegment.setLength(0); // 버퍼 초기화
                currentByteCount = 0;
            }

            currentSegment.append(c);
            currentByteCount += charByteSize;
        }

        if (currentSegment.length() > 0) {
            result.add(currentSegment.toString());
        }

        return result;
    }
}

