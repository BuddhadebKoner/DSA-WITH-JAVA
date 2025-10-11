package com.buddhadeb.arraysstrings;

import java.util.Arrays;

/**
 * Sort Array of 0s, 1s, 2s - Dutch National Flag Algorithm
 * Brute Force O(nlogn) vs Optimal Counting O(n)
 */
public class SortArray012 {

   public static void demo() {
      System.out.println("4. SORT ARRAY OF 0s, 1s, 2s");
      System.out.println("-------------------------------------------");
      int[] nums = { 0, 0, 0, 0, 1, 1, 1, 2, 2, 2 };
      System.out.println("Original Array: " + Arrays.toString(nums));
      System.out.println("Brute Forse Approch : " + Arrays.toString(bruteForse(nums.clone())));
      System.out.println("Optimize way to do : " + Arrays.toString(optimizeSolns(nums.clone())));
      System.out.println();
   }

   // brute fouce method o(nlogn)
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

   // duch natanal
}
