package com.buddhadeb.searchingsorting;

/**
 * Searching and Sorting - Main Demo File
 * This file demonstrates various searching and sorting algorithms
 * 
 * Run command:
 * cd x:\DSA-WITH-JAVA\02SearchingSorting; javac -d . *.java
 * java com.buddhadeb.searchingsorting.Main
 */
public class Main {

   public static void main(String[] args) {
      System.out.println("========================================");
      System.out.println("   SEARCHING & SORTING ALGORITHMS");
      System.out.println("========================================\n");

      // 1. Linear Search Demo
      LinearSearch.demo();

      // 2. Binary Search Demo
      BinarySearch.demo();

      // 3. Sorting Algorithms Demo
      SortingAlgorithms.demo();
   }
}
