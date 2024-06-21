package com.java;

import java.util.*;
public class areaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r = in.nextFloat();
        float pi = 3.1415f;
        System.out.println("Area = "+ pi*3*3+"\nCircumference = "+2*pi*r);
    }
}
