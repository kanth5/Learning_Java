package com.java8.collection_improvements;

import java.util.HashMap;
import java.util.Map;

public class MapImprovements1Demo {

    public static void main(String args[]){
        Map<String , Integer> fruits = new HashMap<>();

        fruits.put("apple", 10);

        // We need to add 20 bananas in map. Below line will throw NullPointerException if banana is already not present
        // in the map.

        //fruits.put("banana", fruits.get("banana") + 20);

        //This is the correct way to update map value before Java 8

        if (fruits.containsKey("banana")) {
            fruits.put("banana", fruits.get("banana") + 20);
        } else {
            fruits.put("banana", 20);
        }

        System.out.println(fruits);

        // New way after Java 8 through getOrDefault method

        fruits.put("grapes",fruits.getOrDefault("grapes",0) + 30);
        fruits.put("cherry",fruits.getOrDefault("cherry",0) + 40);
        fruits.put("kiwi",fruits.getOrDefault("kiwi",0) + 50);
        System.out.println(fruits);

        // putIfAbsent

        // the put() method in Map either inserts a key-value pair in the Map or updates the value if the key is
        // already present. Now, what if you don’t want to update the value in the Map. You want to insert a key-value
        // pair only if it is not present in the Map.

        Map<String , Integer> fruits1 = new HashMap<>();

        fruits1.put("apple", 20);

        System.out.println(fruits1.get("apple"));

        fruits1.putIfAbsent("apple", 30);

        System.out.println(fruits1.get("apple"));

        // compute

        Map<String, Integer> fruits2 = new HashMap<>();
        fruits2.put("apple", 20);

        int val = fruits2.compute("apple", (k, v) -> v + 10);

        System.out.println("compute : " + val);

        // Below line will throw Null Pointer Exception.
        //val = fruits2.compute("banana", (k, v) -> v + 10);

        System.out.println("Before (fruits1) : " + fruits1);

        // computeIfAbsent (computed value if absent else original value)

        int val1 = fruits1.computeIfAbsent("apple", v->10);
        int val2 = fruits1.computeIfAbsent("banana", v->20);
        System.out.println("compute if absent : " + val1 + " " + val2);
        System.out.println(fruits1);

        System.out.println("Before (fruits2) : " + fruits2);

        // computeIfPresent (computed value if present else null)

        int val3 = fruits2.computeIfPresent("apple", (k,v) -> v+30);
//        int val4 = fruits2.computeIfPresent("banana", (k,v) -> v+30);
        System.out.println("compute if present : " + val3);
        System.out.println(fruits2);
    }
}