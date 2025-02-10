package com.example.demo.boj;

import java.util.HashMap;
import java.util.Map;

public class DonationSolution {

    public static Map<Integer, Integer> distributeDonations(int people, int totalAmount) {
        int[] donationTypes = {10000, 5000, 1000}; // 가능한 후원 금액 (큰 금액부터)
        Map<Integer, Integer> donationCount = new HashMap<>();

        // 초기화
        for (int donation : donationTypes) {
            donationCount.put(donation, 0);
        }

        int remainingPeople = people;
        int remainingAmount = totalAmount;

        // 1차 배분: 최대한 공정하게 분배
        for (int donation : donationTypes) {
            int maxPossible = remainingAmount / donation; // 해당 금액으로 후원 가능한 최대 인원
            int count = Math.min(maxPossible, remainingPeople); // 남은 인원 수 고려

            donationCount.put(donation, count);
            remainingAmount -= count * donation;
            remainingPeople -= count;

            // 모든 인원에게 배분이 완료되면 종료
            if (remainingPeople == 0) break;
        }

        return donationCount;
    }
    public static void main(String[] args) {
        testDonation(9, 22000);
        testDonation(11, 50000);
        testDonation(3, 15000);
    }

    public static void testDonation(int people, int totalAmount) {
        Map<Integer, Integer> result = distributeDonations(people, totalAmount);
        System.out.println("인원: " + people + ", 금액: " + totalAmount);
        System.out.println("1000원 : " + result.get(1000) + "명, " +
                "5000원 : " + result.get(5000) + "명, " +
                "10000원 : " + result.get(10000) + "명");
        System.out.println();
    }
}
