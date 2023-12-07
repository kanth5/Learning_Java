package com.educative.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImprovementsDemo {

    public static void main(String args[]) {

        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        // This will increment the value of India by 1 as it is present in the Map
        map.compute("India", (k, v) -> v == null ? 10 : v + 1);

        // This will insert Vietnam in the Map with default value of 10.
        map.compute("Vietnam", (k, v) -> v == null ? 10 : v + 1);

        System.out.println(map);

        // This will insert Germany in the Map.
        map.computeIfAbsent("Germany", k -> k.length());

        System.out.println(map);

        // This will increment the value of India by 1 as it is present in the Map
        map.computeIfPresent("India", (k, v) -> v == null ? 10 : v + 1);

        // This will not insert Japan in the Map.
        map.computeIfPresent("Japan", (k, v) -> v == null ? 10 : v + 1);

        System.out.println(map);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jay", 5000);
        map1.put("Rahul", 3000);
        map1.put("Nidhi", 4500);
        map1.put("Amol", 60000);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Jay", 7000);
        map2.put("Rahul", 4500);
        map2.put("Nidhi", 1200);
        map2.put("Saurav", 25000);

        map1.forEach((key,value) -> map2.merge(key, value, (v1, v2) -> v1 + v2));

        System.out.println(map2);
    }
}
