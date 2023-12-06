package com.educative.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56); //Inserting share price of Oracle in the Map.
        System.out.println(stockPrice);

        stockPrice.put("Oracle", 60); //Inserting share price of Oracle again. This will update the value.
        System.out.println(stockPrice);

        //Inserting share price of Oracle again using putIfAbsent() method. This will not update the value.
        stockPrice.putIfAbsent("Oracle", 70);
        System.out.println(stockPrice);

        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        System.out.println(stockPrice.get("Oracle"));
        System.out.println(stockPrice.get("Google")); //This will return null.

        //Since Google is not present in our Map, this will return a default value of 100.
        System.out.println(stockPrice.getOrDefault("Google", 100));

        System.out.println(stockPrice);

        // This will not replace the value of Oracle because current value is not 70.
        stockPrice.replace("Oracle", 70, 76);
        System.out.println(stockPrice.get("Oracle"));

        // This will replace the value of Oracle because current value is 56.
        stockPrice.replace("Oracle", 56, 76);
        System.out.println(stockPrice.get("Oracle"));

        // This will replace the value of Fiserv as current value does not matter.
        stockPrice.replace("Fiserv", 100);
        System.out.println(stockPrice.get("Fiserv"));

        // Using the replaceAll() method to add 10 to the price of each stock.
        stockPrice.replaceAll((k,v) -> v + 10);
        System.out.println(stockPrice);

        //This will remove Oracle from the Map and return 56.
        System.out.println(stockPrice.remove("Oracle"));

        //This will return null as Google is not present in the Map.
        System.out.println(stockPrice.remove("Google"));

        //This will return false because the value passed does not match the value of BMW in the Map.
        System.out.println(stockPrice.remove("BMW", 45));

        System.out.println(stockPrice);

        System.out.println(stockPrice.containsKey("Oracle"));

        System.out.println(stockPrice.containsValue(83));

        System.out.println("HashMap Keys");
        Set<String> keys = stockPrice.keySet();
        for(String key : keys) {
            System.out.println(key);
        }

        System.out.println("HashMap Values");
        Collection<Integer> values = stockPrice.values();
        for(Integer value : values) {
            System.out.println(value);
        }

        Map<String, Integer> map = new HashMap<>();

        map.put("abc", 23);
        map.put("def", 34);
        map.put("ghi", 56);

        System.out.println(map.isEmpty());
    }

}
