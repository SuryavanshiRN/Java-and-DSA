package com.java;
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int low = in.nextInt();
        System.out.print("Enter the upper range: ");
        int upp = in.nextInt();
        for(int i = low;i<=upp;i++) {
            if(armstrongNum(i)){
                System.out.println(i);
            }
        }
    }
    static boolean armstrongNum(int i){
            int org = i;
            int ans=0;
            while(i>0){
                int n=i%10;
                ans=ans+(n*n*n);
                i=i/10;
            }
            return (ans==org);
        }}
