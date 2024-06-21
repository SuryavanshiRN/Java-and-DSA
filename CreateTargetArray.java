package com.java;
import java.util.*;

public class CreateTargetArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));

    }
    static int[] createTargetArray(int[] nums, int[] index) {

        int ln = nums.length;

        int[] target = new int[ln];

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < ln; i++) {

            arrlist.add(index[i], nums[i]);
        }

        for (int i = 0; i < ln; i++) {
            target[i] = arrlist.get(i);
        }

        return target;
    }
}
