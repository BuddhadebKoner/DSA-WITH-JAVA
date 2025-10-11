package com.buddhadeb.hashing;

import java.util.HashMap;

/**
 * Search Operations for HashMap
 * Demonstrates containsKey() method usage
 */
public class SearchOperations {

   public static void demo(HashMap<String, Integer> map) {
      System.out.println("\n=== Search Operations ===");

      String key = "India";
      if (map.containsKey(key)) {
         System.out.println(key + " Key is present in the map");
      } else {
         System.out.println(key + " not present");
      }

      // Test with non-existing key
      String key2 = "USA";
      if (map.containsKey(key2)) {
         System.out.println(key2 + " Key is present in the map");
      } else {
         System.out.println(key2 + " not present");
      }
   }
}
