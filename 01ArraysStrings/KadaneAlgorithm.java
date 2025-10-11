package com.buddhadeb.arraysstrings;

import java.util.Arrays;

/**
 * Kadane's Algorithm - Maximum Subarray Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class KadaneAlgorithm {

   public static void demo() {
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
}
