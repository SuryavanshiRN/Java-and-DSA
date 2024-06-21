package com.java;

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("Today we're going to study the input function of java.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the flower name you like the most: ");
        String flower = input.next();
        System.out.println("The flower is " + flower);

    }
}