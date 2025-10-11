package com.buddhadeb;

// run command
// javac .\com\buddhadeb\Main.java;java com.buddhadeb.Main

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // country(key), populations(value)
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(map);
        HashMap<String, Integer> updatedMap = Insert.insertOperations(map);
        System.out.println("Returned map from Insert.insertOperations: " + updatedMap);
        // search India in the map
        Search.searchOparation(map, "India");
        // get value by key
        Integer value = GetValueByKey.getValue(map, "India");
        if (value != null) {
            System.out.print("India" + " is present in the map value is : " + value);
        } else {
            System.out.print("India" + " is not present in the map");
        }
    }
}
