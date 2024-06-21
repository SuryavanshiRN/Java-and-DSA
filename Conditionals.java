// package com.java;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of conversion:\n1. C ---> F\n2. F ---> C\nEnter :- ");
        int type = input.nextInt();
        if(type == 1){
            System.out.print("Enter the temperature in degree Celsius: ");
            float c = input.nextFloat();
            float f = c*9/5 +(32);
            System.out.println(c +" C = "+ f +" F");

        }
        else if(type == 2) {
            System.out.print("Enter the temperature in degree Fahrenheit: ");
            float f = input.nextFloat();
            float c = (f - 32)*5/9;
            System.out.println(f + " F = " + c + " C");
        }
        else{
            System.out.println("Invalid type chosen.");

        }
    }
}
