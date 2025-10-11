package com.buddhadeb.hashing;

import java.util.HashMap;

/**
 * Get Value Operations for HashMap
 * Demonstrates retrieving values by key
 */
public class GetValueOperations {

   public static void demo(HashMap<String, Integer> map) {
      System.out.println("\n=== Find Value by Key ===");

      String key = "India";
      Integer value = map.get(key);
      if (value != null) {
         System.out.println(key + " is present in the map, value is : " + value);
      } else {
         System.out.println(key + " is not present in the map");
      }

      // Test with non-existing key
      String key2 = "USA";
      Integer value2 = map.get(key2);
      if (value2 != null) {
         System.out.println(key2 + " is present in the map, value is : " + value2);
      } else {
         System.out.println(key2 + " is not present in the map");
      }
   }
}
