package com.java;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,23,45,67,89};
        int target = 40;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] nums,int target){
        int len = nums.length;
        int start = 0, end = len-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return nums[mid];
            }
        }return nums[start];
    }
}
