package com.java;
import java.util.Arrays;
public class ShuffleTheArray {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
    static int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            ans[i+k]=nums[i];
            k++;
            ans[i+k]=nums[i+n];
        }
        return ans;
    }
}
