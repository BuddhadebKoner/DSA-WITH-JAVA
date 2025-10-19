package com.buddhadeb.hashing;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
   public static int bruteForce() {
      System.out.println("\n=== Find Duplicates ===");
      int[] nums = { 1, 3, 4, 2, 2 };
      System.out.println("Array: " + java.util.Arrays.toString(nums));

      HashSet<Integer> set = new HashSet<>();
      for (int num : nums) {
         if (!set.add(num)) {
            return num;
         }
      }

      System.out.println("No duplicate found");
      return -1;
   }

   // approach 2
   public static void findDuplicates() {
      int arr[] = { 1, 2, 3, 4, 1, 1, 1, 3, 4, 6, 7, 7, 7, 5 };
      Set<Integer> myset = new HashSet<>();
      for (int nums : arr) {
         myset.add(nums);
      }
      System.out.println("Array without duplicate Element :  " + myset);
   }
}
