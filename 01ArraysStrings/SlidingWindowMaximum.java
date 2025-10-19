package com.buddhadeb.arraysstrings;

public class SlidingWindowMaximum {
   public static void demo() {
      System.out.println("\n=== Sliding Window Maximum ===");
      int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
      int k = 3;

      int[] result = maxSlidingWindow(nums, k);
      System.out.println("Sliding Window Maximums (Brute Force): " + java.util.Arrays.toString(result));

      int[] resultDeque = maxSlidingWindowDeque(nums, k);
      System.out.println("Sliding Window Maximums (Deque): " + java.util.Arrays.toString(resultDeque));
   }

   // brute force approach
   public static int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      // n - k + 1 because thats how many windows we can have
      int[] result = new int[n - k + 1];

      for (int i = 0; i <= n - k; i++) {
         // find max in the current window
         int max = Integer.MIN_VALUE;
         for (int j = i; j < i + k; j++) {
            max = Math.max(max, nums[j]);
         }
         result[i] = max;
      }

      return result;
   }

   // approach using deque
   public static int[] maxSlidingWindowDeque(int[] nums, int k) {
      
      return nums;
   }
}
