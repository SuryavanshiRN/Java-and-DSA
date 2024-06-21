package com.java;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char [] letters= {'b','g','r','x','z'};
        char target = 'a';
        System.out.println(small_letter(letters,target));
    }
    static char small_letter(char [] arr,char target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return arr[start%arr.length];

        }

    }

