// package com.java;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,23,45,67,89,99,78,75,72,68,61,38,24,3,2,1,0};
        int peak = 0;
        System.out.println(peak(arr,peak));
     }
     static int peak(int[] arr, int peak) {
         int len = arr.length;
         int start = 0, end = len-1;
         while(start<end){
             int mid = start + (end - start)/2;
             if(arr[mid]>arr[mid+1]){
                 end=mid;
             }
             else if(arr[mid]<arr[mid+1]){
                 start=mid+1;
             }
         }return arr[start];
    }
}
