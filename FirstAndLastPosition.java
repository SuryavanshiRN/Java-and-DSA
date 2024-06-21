// package com.java;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,7,8,8,8,9,12};
        int target= 4;
        boolean isStart = false;
        System.out.println((Arrays.toString(positions(arr, target, isStart))));
    }
    static int [] positions(int[] arr, int target, boolean isStart){
        int [] ans={-1,-1};
        int start= searchIndex(arr, target,true);
        int end= searchIndex(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int searchIndex(int[] arr, int target, boolean b) {
        int len = arr.length;
        int start = 0, end = len - 1;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (b) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
