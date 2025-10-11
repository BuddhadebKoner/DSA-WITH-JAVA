package com.buddhadeb.searchingsorting;

import java.util.Arrays;

/**
 * Binary Search Algorithm
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * Note: Works only on sorted arrays
 */
public class BinarySearch {

   public static void demo() {
      System.out.println("2. BINARY SEARCH");
      System.out.println("-------------------------------------------");
      int[] nums = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
      int targetElement = 99;
      int ans = binarySearch(nums, targetElement);
      System.out.println("Array: " + Arrays.toString(nums));
      System.out.println("Target: " + targetElement);
      if (ans == -1) {
         System.out.println(targetElement + " is Not Found in Array");
      } else {
         System.out.println("The " + targetElement + " is found in : " + ans + " Index");
      }
      System.out.println();
   }

   static int binarySearch(int[] nums, int targetElement) {
      int start = 0;
      int end = nums.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;

         if (nums[mid] == targetElement) {
            return mid;
         } else if (nums[mid] < targetElement) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return -1;
   }
}
