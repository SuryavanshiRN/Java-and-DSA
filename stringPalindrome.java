// package com.java;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the desired string: ");
        String s = in.next();
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
