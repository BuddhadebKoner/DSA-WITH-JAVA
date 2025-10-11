package com.buddhadeb.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Hashing - Main Demo File
 * This file demonstrates HashMap operations and usage
 * 
 * Run command:
 * javac .\com\buddhadeb\hashing\Main.java
 * java com.buddhadeb.hashing.Main
 */
public class Main {

   public static void main(String[] args) {
      System.out.println("========================================");
      System.out.println("   HASHING (HashMap Operations)");
      System.out.println("========================================\n");

      // country(key), populations(value)
      HashMap<String, Integer> map = new HashMap<>();

      System.out.println("Initial Map: " + map);

      // 1. Insert Operations
      insertOperationsDemo(map);

      // 2. Search Operations
      searchOperationsDemo(map);

      // 3. Get Value by Key
      getValueByKeyDemo(map);

      // 4. Iteration Operations
      iterationOperationsDemo(map);
   }

   // =============================================
   // 1. INSERT OPERATIONS
   // =============================================
   private static void insertOperationsDemo(HashMap<String, Integer> map) {
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

   // =============================================
   // 2. SEARCH OPERATIONS
   // =============================================
   private static void searchOperationsDemo(HashMap<String, Integer> map) {
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

   // =============================================
   // 3. GET VALUE BY KEY
   // =============================================
   private static void getValueByKeyDemo(HashMap<String, Integer> map) {
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

   // =============================================
   // 4. ITERATION OPERATIONS
   // =============================================
   private static void iterationOperationsDemo(HashMap<String, Integer> map) {
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
