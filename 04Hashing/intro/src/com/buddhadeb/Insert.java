package com.buddhadeb;

import java.util.HashMap;

public class Insert {

    public static HashMap<String, Integer> insertOperations(HashMap<String, Integer> map) {
        System.out.println("\n=== Insert Operations ===");

        // Insert new entry
        map.put("Germany", 83);
        map.put("Brazil", 213);
        map.put("India", 120);
        
        System.out.println("After insertion: " + map);

        // Update existing entry
        map.put("India", 140);

        System.out.println("Insertion is successful");
        return map;
    }
}
