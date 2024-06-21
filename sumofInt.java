// package com.java;

import java.util.Scanner;

public class sumofInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum=0;
        do{System.out.print("Enter the number: ");
            num = in.nextInt();
            sum = sum + num;
        }while(num!=0);
        System.out.println("Sum = "+ sum);
    }
}
