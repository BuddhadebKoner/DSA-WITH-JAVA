package com.buddhadeb.arraysstrings;

public class Palindrom {
   public static boolean demo() {
      String s = "A man, a plan, a canal: Panama";

      // remove all space and only a to z small caps
      s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

      // System.out.println(s);

      int left = 0;
      int right = s.length() - 1;

      while (left < right) {
         if (s.charAt(left) != s.charAt(right)) {
            return false;
         }
         left++;
         right--;
      }

      return true;

   }
}
