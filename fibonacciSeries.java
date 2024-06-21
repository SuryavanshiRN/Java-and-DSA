// package com.java;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = in.nextLong();
        Fib(num);

    }
    static void Fib(long n){
        long n1=0,n2=1,n3=0,k;
        if (n<=1) {
            System.out.println("Fibonacci number at place " + n + " = " + n);
        }
        k = 2;
        if(n>1) {
            while (k <= n) {
                n3=n1+n2;
                n1=n2;
                n2=n3;
                k++;
            }

            System.out.println("Fibonacci number at place " + n + " = " + n3);
        }
    }
}
