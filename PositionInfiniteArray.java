package com.java;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class PositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,7,8,8,8,9,12,23,45,56,67,77,79,99};
        int target = 45;
        System.out.println((Arrays.toString(range(arr, target))));
    }
    static int[] range(int[] arr, int target){
        int start = 0;
        int end =1;
        while(arr[end]<target){
            int l=end-start+1;
            int temp=end+1;
            end=end+(2*l);
            start=temp;
        }
        return new int[]{binarysearch(arr, target, start, end)};
    }

    static int binarysearch(int[] arr, int target,int start,int end){
       while(start<=end){
            int mid = start + (end - start)/2;
           if(arr[mid]>target){
               end=mid-1;
           }
          else if(arr[mid]<target){
              start=mid+1;
         }
         else{
               return mid;
           }
     }return -1;
}
}
