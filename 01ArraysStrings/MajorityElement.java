package com.buddhadeb.arraysstrings;

import java.util.Arrays;

/**
 * Majority Element - Find element appearing more than n/2 times
 * Multiple approaches: Brute Force O(n²), Sorted Array O(nlogn), Moore's Voting
 * O(n)
 */
public class MajorityElement {

   public static void demo() {
      System.out.println("2. MAJORITY ELEMENT");
      System.out.println("-------------------------------------------");
      int[] nums = { 3, 3, 3, 3, 3, 1, 2, 0 };
      System.out.println("Array: " + Arrays.toString(nums));
      System.out.println("Brute Force : " + bruteForce(nums));
      System.out.println("Sorted Array : " + sortedArrayApproch(nums));
      System.out.println("Moores Algo : " + mooresAlgo(nums));
      System.out.println();
   }

   // brute force method o(n^2)
   static int bruteForce(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
         int frequency = 0;
         for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
               frequency++;
            }
         }
         if (frequency > nums.length / 2) {
            return nums[i];
         }
      }
      return -1;
   }

   // effecient than previous time complexcity is o(nlogn)
   static int sortedArrayApproch(int[] nums) {
      // need to sort the array
      Arrays.sort(nums);
      int frequency = 1;
      int ans = nums[0];
      for (int i = 1; i < nums.length; i++) {
         ans = nums[i];
         if (nums[i - 1] == nums[i]) {
            frequency++;
         } else {
            frequency = 1;
         }
         if (frequency > nums.length / 2) {
            return ans;
         }
      }
      return ans;
   }

   // moores voting algo most eeficient algo o(1)
   static int mooresAlgo(int[] nums) {
      int frequency = 0;
      int ans = 0;
      for (int i = 0; i < nums.length; i++) {
         if (frequency == 0) {
            ans = nums[i];
         }
         if (ans == nums[i]) {
            frequency++;
         } else {
            frequency--;
         }
      }
      return ans;
   }
}
