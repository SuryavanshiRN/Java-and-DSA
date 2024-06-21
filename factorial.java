package com.java;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int n=1;
        int fact=1;
        while(n<=num){
            fact=fact*n;
            n++;
        }
        System.out.println(fact);
    }
}
