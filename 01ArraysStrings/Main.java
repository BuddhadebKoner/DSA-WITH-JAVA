package com.buddhadeb.arraysstrings;

import java.util.Arrays;

/**
 * Arrays and Strings - Main Demo File
 * This file demonstrates various array and string algorithms
 */
public class Main {

   public static void main(String[] args) {
      System.out.println("========================================");
      System.out.println("   ARRAYS AND STRINGS ALGORITHMS");
      System.out.println("========================================\n");

      // 1. Kadane's Algorithm Demo
      kadaneAlgorithmDemo();

      // 2. Majority Element Demo
      majorityElementDemo();

      // 3. Single Number Demo
      singleNumberDemo();

      // 4. Sort Array of 0s, 1s, 2s Demo
      sortArrayOf0s1s2sDemo();
   }

   // =============================================
   // 1. KADANE'S ALGORITHM
   // =============================================
   private static void kadaneAlgorithmDemo() {
      System.out.println("1. KADANE'S ALGORITHM (Maximum Subarray Sum)");
      System.out.println("-------------------------------------------");
      int[] nums = { -1 };
      int largestSum = kadane(nums);
      System.out.println("Array: " + Arrays.toString(nums));
      System.out.println("Largest Sum of the array : " + largestSum);
      System.out.println();
   }

   // ------ order of n^2
   // static int largestSum(int[] nums) {
   // int count = 1;
   // int largestSum = 0;
   // for (int st = 0; st < nums.length; st++) {
   // for (int end = st; end < nums.length; end++) {
   // int sumOfSubArray = 0;
   // System.out.print("Subarray " + count + ": [");
   // for (int i = st; i <= end; i++) {
   // System.out.print(nums[i]);
   // sumOfSubArray = sumOfSubArray + nums[i];
   // if (i < end) {
   // System.out.print(", ");
   // }
   // }
   // System.out.print("]");
   // System.out.println(sumOfSubArray);
   // if (largestSum < sumOfSubArray) {
   // largestSum = sumOfSubArray;
   // } else {
   // sumOfSubArray = 0;
   // }
   // count++;
   // }
   // }
   // return largestSum;
   // }

   // ------ order of n
   static int kadane(int[] nums) {
      int currentSum = 0;
      int maxSum = Integer.MIN_VALUE;

      for (int val : nums) {
         currentSum = Math.max(val, currentSum + val);
         maxSum = Math.max(currentSum, maxSum);
      }

      return maxSum;
   }

   // =============================================
   // 2. MAJORITY ELEMENT
   // =============================================
   private static void majorityElementDemo() {
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

   // =============================================
   // 3. SINGLE NUMBER
   // =============================================
   private static void singleNumberDemo() {
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

   // =============================================
   // 4. SORT ARRAY OF 0s, 1s, 2s
   // =============================================
   private static void sortArrayOf0s1s2sDemo() {
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
