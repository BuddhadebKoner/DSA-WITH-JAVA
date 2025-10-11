package com.buddhadeb.searchingsorting;

import java.util.Arrays;

/**
 * Linear Search Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinearSearch {

   public static void demo() {
      System.out.println("1. LINEAR SEARCH");
      System.out.println("-------------------------------------------");
      int[] nums = { 12, -7, 34, -21, 0, 5, -3, 19, -15, 8 };
      int targateElement = 34;
      int ans = linearSearch(nums, targateElement);
      System.out.println("Array: " + Arrays.toString(nums));
      System.out.println("Target: " + targateElement);
      System.out.println("Found at index: " + ans);

      // Additional Linear Search Examples
      System.out.println("\nLinear Search Variants:");

      // Even Digit Count
      int[] arr1 = { 762, 1642, 121, 129, 1442, 111, 23 };
      System.out.println("Even digit numbers count in " + Arrays.toString(arr1) + ": " + findNumbers(arr1));

      // Find Minimum
      int[] arr2 = { 98, 12, 31, 23, 46, 13, 93 };
      System.out.println("Minimum in " + Arrays.toString(arr2) + ": " + min(arr2));

      // Search in Range
      int[] arr3 = { 98, 12, 31, 23, 46, 13, 93 };
      int target = 93;
      int start = 0;
      int end = 4;
      System.out.println(
            "Search " + target + " in range [" + start + ", " + end + "]: " + search(arr3, target, start, end));

      // Search in String
      String name = "Buddhadeb";
      char charTarget = 'x';
      System.out.println("Search '" + charTarget + "' in \"" + name + "\": " + searchInString(name, charTarget));

      System.out.println();
   }

   static int linearSearch(int[] arr, int targateElement) {
      if (arr.length == 0) {
         return -2;
      }

      // fun a for loop
      for (int i = 0; i < arr.length; i++) {
         // check for element index if it is equal to target
         int element = arr[i];
         if (element == targateElement) {
            return i;
         }
      }

      // if no element is not exist in the array
      return -1;
   }

   // worst case
   static int findNumbers(int[] nums) {
      int count = 0;
      for (int index = 0; index < nums.length; index++) {
         int number = nums[index];
         int digitCount = 0;
         if (number == 0) {
            digitCount = 1;
         }
         while (number > 0) {
            digitCount++;
            number /= 10;
         }
         if (digitCount % 2 == 0) {
            count++;
         }
      }
      return count;
   }

   static int min(int[] arr) {
      int minimum = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if (minimum > arr[i]) {
            minimum = arr[i];
         }
      }

      return minimum;
   }

   static int search(int[] arr, int target, int start, int end) {
      if (arr.length == 0) {
         return -1;
      }

      for (int index = start; index <= end; index++) {
         int element = arr[index];
         if (element == target) {
            return index;
         }
      }

      return -1;
   }

   static boolean searchInString(String str, char target) {
      if (str.length() == 0) {
         return false;
      }

      // for each loop
      for (char ch : str.toCharArray()) {
         if (ch == target) {
            return true;
         }
      }

      // for (int i = 0; i < str.length(); i++) {
      // if (target == str.charAt(i)) {
      // return true;
      // }
      // }
      return false;
   }
}
