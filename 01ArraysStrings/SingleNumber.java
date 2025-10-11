package com.buddhadeb.arraysstrings;

import java.util.Arrays;

/**
 * Single Number - Find the number that appears only once
 * Brute Force O(n²) vs Optimal XOR approach O(n)
 */
public class SingleNumber {

   public static void demo() {
      System.out.println("3. SINGLE NUMBER");
      System.out.println("-------------------------------------------");
      int[] nums = { 2, 2, 1, 1, 4 };
      System.out.println("Array: " + Arrays.toString(nums));
      System.out.println("Single Number : " + singleNumberFind(nums));
      System.out.println("Find single Number : " + singleNumberOptimal(nums));
      System.out.println();
   }

   // worst case o(n^2)
   static int singleNumberFind(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         int count = 0;

         for (int j = 0; j < nums.length; j++) {
            if (i != j && nums[i] == nums[j]) {
               count++;
            }
         }

         if (count == 0) {
            return nums[i];
         }
      }
      return -1;
   }

   // o(n) optimal solns ->>
   static int singleNumberOptimal(int[] nums) {
      int result = 0;

      for (int num : nums) {
         result ^= num;
      }

      return result;
   }
}
