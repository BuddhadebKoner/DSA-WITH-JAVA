package com.buddhadeb;

import java.util.HashMap;

public class Search {

    public static void searchOparation(HashMap<String, Integer> map, String key) {
        System.out.println("\n=== Search Operations ===");

        if (map.containsKey(key)) {
            System.out.println(key + " Key is present in the map");
        } else {
            System.out.println(key + " not present");
        }
    }
}
