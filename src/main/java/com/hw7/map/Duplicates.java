package main.java.com.hw7.map;

import java.util.*;

public class Duplicates {

    public static Map<Integer, Integer> createMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 4);
        map.put(6, 6);
        return map;
    }

    public static void removeDuplicates(Map<Integer, Integer> map) {
        Set<Integer> uniqueValues = new HashSet<>(map.values());
        System.out.println(uniqueValues);
    }
}
