package com.buddhadeb.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Iteration Operations for HashMap
 * Demonstrates different ways to iterate through HashMap
 */
public class IterationOperations {

   public static void demo(HashMap<String, Integer> map) {
      System.out.println("\n=== Iteration Operations ===");

      // Iterate using entrySet
      System.out.println("Using entrySet():");
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
         System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
      }

      // Iterate using keySet
      System.out.println("\nUsing keySet():");
      for (String key : map.keySet()) {
         System.out.println("  " + key + " -> " + map.get(key));
      }

      // Iterate using values
      System.out.println("\nUsing values():");
      for (Integer value : map.values()) {
         System.out.println("  Population: " + value);
      }
   }
}
