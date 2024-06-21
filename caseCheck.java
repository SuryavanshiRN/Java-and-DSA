// package com.java;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the word: ");
        char c = in.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
