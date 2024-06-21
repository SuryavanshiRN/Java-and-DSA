package com.java;

import java.util.Arrays;

public class Sum_1d_Array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }
    static int[] runningSum(int[] nums){
        int len=nums.length;
        int [] ans = new int[len];
        int s=0;
        for(int i=0;i<len;i++){
            ans[i]=nums[i]+s;
            s=s+nums[i];
        }
        return (ans);
    }
}
