// package com.java;

import java.util.Scanner;

public class largestInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,l=0;
        do{System.out.print("Enter the number: ");
            num = in.nextInt();
            if(num>l){
                l=num;
            }
        }while(num!=0);
        System.out.println("Largest = "+ l);
    }
}
