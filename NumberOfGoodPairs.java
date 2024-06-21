// package com.java;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans = ans + cnt[a];
            cnt[a]++;
        }
        return ans;
    }
}
