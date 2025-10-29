package com.buddhadeb.arraysstrings;

public class RemoveAllOccurrencesSubstring {
   public static String demo() {
      String s = "daabcbaabcbc";
      String part = "abc";
      // StringBuilder result = new StringBuilder();

      // int m = part.length();

      // for (int i = 0; i < s.length(); i++) {
      // result.append(s.charAt(i));
      // if (result.length() >= m) {
      // boolean match = true;
      // for (int j = 0; j < m; j++) {
      // if (result.charAt(result.length() - m + j) != part.charAt(j)) {
      // match = false;
      // break;
      // }
      // }

      // if (match) result.setLength(result.length() - m);
      // }
      // }
      // return result.toString();

      while (s.contains(part)) { // keep looping while 'part' exists
         s = s.replaceFirst(part, ""); // remove only the first occurrence
      }
      System.out.println(s);
      return s;
   }
}
