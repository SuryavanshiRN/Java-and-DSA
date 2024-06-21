package com.java;
import java.util.*;
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int [] numbs = {5,0,1,2,3,4};
        System.out.println("Original array is "+ Arrays.toString(numbs));
        int [] ans = new int[6];
        for(int i =0; i<6;i++){
            ans[i]=numbs[numbs[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
