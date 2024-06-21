// package com.java;

public class countingOccurences{
    public static void main(String[] args) {
        long n = 863776983795873443L;
        int key = 7;
        int count = 0;
        while(n>0){
            if(n%10==key){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
