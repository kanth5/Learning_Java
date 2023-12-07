package com.educative.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String args[]) {

        // Creating a TreeMap which will store all the elements in reverse order.
        TreeMap<String, Integer> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put("Oracle", 43);
        reverseMap.put("Microsoft", 56);
        reverseMap.put("Apple", 43);
        reverseMap.put("Novartis", 87);
        System.out.println("Elements are stored in reverse order: " + reverseMap);

        // Creating a HashMap which will store all the elements in random order.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);
        System.out.println("Elements are stored in random order: " + hashMap);

        // Creating a TreeMap using existing HashMap. This will store the elements in ascending order.
        TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
        System.out.println("Elements are stored in ascending order: " + treeMap1);

        // Creating a TreeMap using existing TreeMap. This will store the elements in the same order as it was in the passed Map.
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(reverseMap);
        System.out.println("Elements are stored in descending order: " + treeMap2);

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 43);
        map.put("Novartis", 87);

        System.out.println(map);

        TreeMap<String, Integer> finalMap = new TreeMap<>();

        map.put("Google", 65);
        map.put("Audi", 32);
        finalMap.putAll(map);

        System.out.println(finalMap);
        System.out.println(map);

        //Fetching the first entry in the Map.
        Entry<String, Integer> firstEntry = map.firstEntry();
        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());

        //Fetching the last entry in the Map.
        Entry<String, Integer> lastEntry = map.lastEntry();
        System.out.println("Largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        System.out.println("Removing Oracle from Map. This will return the value corresponding to Oracle: " + map.remove("Oracle"));
        System.out.println("Removing Fiserve from Map. This will return null as Fiserve is not present in the Map: " + map.remove("Fiserve"));

        System.out.println("Replacing the value of Novartis : " + map.replace("Novartis", 67));
        System.out.println("Latest value of Novartis : " + map.get("Novartis"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + map.replace("Apple", 50, 90));
        System.out.println("Latest value of Apple : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 43 : " + map.replace("Apple", 43, 90));
        System.out.println("Latest value of Apple : " + map.get("Apple"));

    }
}