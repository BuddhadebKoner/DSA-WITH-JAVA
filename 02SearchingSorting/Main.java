package com.buddhadeb.searchingsorting;

import java.util.Arrays;

/**
 * Searching and Sorting - Main Demo File
 * This file demonstrates various searching and sorting algorithms
 */
public class Main {

   public static void main(String[] args) {
      System.out.println("========================================");
      System.out.println("   SEARCHING & SORTING ALGORITHMS");
      System.out.println("========================================\n");

      // 1. Linear Search Demo
      linearSearchDemo();

      // 2. Binary Search Demo
      binarySearchDemo();

      // 3. Sorting Algorithms Demo
      sortingAlgorithmsDemo();
   }

   // =============================================
   // 1. LINEAR SEARCH
   // =============================================
   private static void linearSearchDemo() {
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

   // =============================================
   // 2. BINARY SEARCH
   // =============================================
   private static void binarySearchDemo() {
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

   // =============================================
   // 3. SORTING ALGORITHMS
   // =============================================
   private static void sortingAlgorithmsDemo() {
      System.out.println("3. SORTING ALGORITHMS");
      System.out.println("-------------------------------------------");
      int[] arr1 = { 5, 3, 4, 1, 2 };
      int[] arr2 = arr1.clone();
      int[] arr3 = arr1.clone();

      System.out.println("Original : " + Arrays.toString(arr1));

      insertion(arr1, true);
      selection(arr2, true);
      bubble(arr3, true);

      System.out.println("\nSorted (Insertion): " + Arrays.toString(arr1));
      System.out.println("Sorted (Selection): " + Arrays.toString(arr2));
      System.out.println("Sorted (Bubble)   : " + Arrays.toString(arr3));
      System.out.println();
   }

   /*
    * -------------------------------------------------- *
    * Insertion Sort
    * --------------------------------------------------
    */
   static void insertion(int[] arr) {
      insertion(arr, false);
   }

   static void insertion(int[] arr, boolean verbose) {
      if (!isSortable(arr)) {
         return;
      }
      for (int i = 1; i < arr.length; i++) { // start from second element
         int key = arr[i];
         int j = i - 1;
         // shift larger elements to the right
         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = key;
         if (verbose) {
            printStep("Insertion i=" + i, arr);
         }
      }
   }

   /*
    * -------------------------------------------------- *
    * Selection Sort (chooses max each pass and places at end)
    * --------------------------------------------------
    */
   static void selection(int[] arr) {
      selection(arr, false);
   }

   static void selection(int[] arr, boolean verbose) {
      if (!isSortable(arr)) {
         return;
      }
      for (int i = 0; i < arr.length; i++) {
         int last = arr.length - i - 1;
         int maxIndex = getMaxIndex(arr, 0, last);
         swap(arr, maxIndex, last);
         if (verbose) {
            printStep("Selection pass=" + i, arr);
         }
      }
   }

   /*
    * -------------------------------------------------- *
    * Bubble Sort (optimized: stop early if no swaps in a pass)
    * --------------------------------------------------
    */
   static void bubble(int[] arr) {
      bubble(arr, false);
   }

   static void bubble(int[] arr, boolean verbose) {
      if (!isSortable(arr)) {
         return;
      }
      for (int pass = 0; pass < arr.length - 1; pass++) {
         boolean swapped = false;
         for (int j = 1; j < arr.length - pass; j++) {
            if (arr[j] < arr[j - 1]) {
               swap(arr, j, j - 1);
               swapped = true;
            }
         }
         if (verbose) {
            printStep("Bubble pass=" + pass, arr);
         }
         if (!swapped) {
            break;
         }
      }
   }

   /*
    * -------------------------------------------------- *
    * Helpers
    * --------------------------------------------------
    */
   private static void swap(int[] arr, int first, int second) {
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
   }

   private static int getMaxIndex(int[] arr, int start, int end) {
      int max = start;
      for (int i = start + 1; i <= end; i++) {
         if (arr[i] > arr[max]) {
            max = i;
         }
      }
      return max;
   }

   private static boolean isSortable(int[] arr) {
      return arr != null && arr.length > 1;
   }

   private static void printStep(String label, int[] arr) {
      System.out.println(String.format("%-18s => %s", label, Arrays.toString(arr)));
   }
}
