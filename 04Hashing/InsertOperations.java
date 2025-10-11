package com.buddhadeb.hashing;

import java.util.HashMap;

/**
 * Insert Operations for HashMap
 * Demonstrates insertion and update operations
 */
public class InsertOperations {

   public static void demo(HashMap<String, Integer> map) {
      System.out.println("\n=== Insert Operations ===");

      // Insert new entry
      map.put("Germany", 83);
      map.put("Brazil", 213);
      map.put("India", 120);

      System.out.println("After insertion: " + map);

      // Update existing entry
      map.put("India", 140);

      System.out.println("After update: " + map);
      System.out.println("Insertion is successful");
   }
}
