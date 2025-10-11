package com.buddhadeb;

import java.util.HashMap;

public class GetValueByKey {
   public static Integer getValue(HashMap<String, Integer> map, String key) {
      System.out.println("\n=== Find Value by Key ===");

      return map.get(key);
   }
}
