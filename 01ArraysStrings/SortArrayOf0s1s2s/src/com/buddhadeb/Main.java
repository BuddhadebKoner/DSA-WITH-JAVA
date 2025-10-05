package com.buddhadeb;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2};

        System.out.println("Brute Forse Approch : " + java.util.Arrays.toString(bruteForse(nums)));
        System.out.println("Optimize way to do : " + java.util.Arrays.toString(optimizeSolns(nums)));
    }

    //  brute fouce method o(nlogn)
    static int[] bruteForse(int[] nums) {
        Arrays.sort(nums);

        return nums;
    }

    // o(n)
    static int[] optimizeSolns(int[] nums) {
       int count0 = 0;
       int count1 = 0;
       int count2 = 0;

       for (int i = 0; i < nums.length; i++) {
          switch (nums[i]) {
             case 0 ->
                count0++;
             case 1 ->
                count1++;
             case 2 ->
                count2++;
             default -> {
             }
          }
       }

       int indx = 0;
       for (int i = 0; i < count0; i++) {
          nums[indx++] = 0;
       }
       for (int i = 0; i < count1; i++) {
          nums[indx++] = 1;
       }
       for (int i = 0; i < count2; i++) {
          nums[indx++] = 2;
       }

       return nums;
    }
    
   //  duch natanal 
}
