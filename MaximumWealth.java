// package com.java;

import java.util.*;

public class MaximumWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(Arrays.toString(maximumWealth(accounts)));

    }
    static long[] maximumWealth(int[][] accounts) {
        int k=0,max=0;
        for (int[] account : accounts) {
            for (int j = 0; j < account.length; j++) {
                k = k + account[j];
            }
            if (k > max) {
                max = k;
            }
            k = 0;
        }
        return new long[]{max};
    }
}
