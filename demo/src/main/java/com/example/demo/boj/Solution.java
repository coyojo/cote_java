package com.example.demo.boj;

public class Solution {
    public int solution1(int N){
        return N * (N+1) / 2;
    }

    public  int solution2(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public int solution3(int N) {
        if (N == 1) {
            return 1;
        }
        return N + solution3(N - 1);
    }



    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int N = 20;
        System.out.println("Solution1 결과: " + sol.solution1(N));
        System.out.println("Solution2 결과: " +sol.solution2(N));
        System.out.println("Solution3 결과: " + sol.solution3(N));
    }
}