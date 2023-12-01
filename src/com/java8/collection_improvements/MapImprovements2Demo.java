package com.java8.collection_improvements;

import java.util.HashMap;
import java.util.Map;

public class MapImprovements2Demo {

    public static void main(String[] args) {

        // replace(K key, V value)

        // This method replaces the entry for the specified key only if it is currently mapped to some value. If the key
        // is not present then nothing is done.

        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 20);
        fruits.put("banana", 20);
        fruits.put("grapes", null);

        System.out.println(fruits);

        fruits.replace("apple", 50);
        fruits.replace("grapes",0);
        fruits.replace("kiwi",0);

        System.out.println(fruits);

        // replace(K key, V oldValue, V newValue)

        // This method replaces the entry for the specified key only if it is currently mapped to the specified value.

        fruits.replace("apple", 30, 50);

        System.out.println(fruits.get("apple"));

        fruits.replace("apple", 50, 100);

        System.out.println(fruits.get("apple"));

        // replaceAll(BiFunction<? super K, ? super V, ? extends V> function)

        // This method replaces each entry’s value with the result of invoking the given function on that entry until
        // all the entries have been processed or the function throws an exception.

        fruits.replaceAll((k, v) -> 50);

        System.out.println(fruits);

        // remove(Object key)

        // This method removes the mapping for a key from this map if it is present.

        fruits.remove("apple");
        fruits.remove("kiwi");
        System.out.println(fruits);

        // remove(Object key, Object value)

        // This method removes the entry for the specified key only if it is currently mapped to the specified value.

        fruits.remove("banana", 30);
        fruits.remove("banana", 50);
        System.out.println(fruits);

        // iterating over a map using the new forEach method

        // forEach(BiConsumer<? super K,? super V> action)

        fruits.forEach((k,v)-> System.out.println(k + " : " + v));
    }
}
