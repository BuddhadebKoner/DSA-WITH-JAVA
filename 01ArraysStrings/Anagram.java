package com.buddhadeb.arraysstrings;

import java.util.Arrays;

public class Anagram {
   public static void demo() {
      String s = "anagram";
      String t = "nagarxam";

      char[] sArr = s.toCharArray();
      char[] tArr = t.toCharArray();

      Arrays.sort(sArr);
      Arrays.sort(tArr);

      boolean isAnagram = Arrays.equals(sArr, tArr);

      System.out.println(isAnagram);
   }

   public static void base() {
      String s = "anagram";
      String t = "nagaram";

      int[] count = new int[256];

      for (char c : s.toCharArray()) {
         count[c]++;
      }

      for (char c : t.toCharArray()) {
         count[c]--;
      }

      boolean isAnagram = true;
      for (int i : count) {
         if (i != 0) {
            isAnagram = false;
            break;
         }
      }

      System.out.println(isAnagram);
   }
}
