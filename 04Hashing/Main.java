package com.buddhadeb.hashing;

import java.util.HashMap;

/**
 * Hashing - Main Demo File
 * This file demonstrates HashMap operations and usage
 * 
 * Run command:
 * cd x:\DSA-WITH-JAVA\04Hashing; javac -d . *.java
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
      InsertOperations.demo(map);

      // 2. Search Operations
      SearchOperations.demo(map);

      // 3. Get Value by Key
      GetValueOperations.demo(map);

      // 4. Iteration Operations
      IterationOperations.demo(map);
   }
}
