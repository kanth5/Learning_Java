package com.educative.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterationDemo {

    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        Set<Entry<String, Integer>> entrySet = stockPrice.entrySet(); // Returns a Set of Entries

        for (Entry<String, Integer> entry : entrySet) {
            System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());
        }

        Iterator<Entry<String, Integer>> itr = entrySet.iterator(); //Getting the iterator

        while (itr.hasNext()) {
            Entry<String,Integer> entry = itr.next();
            System.out.println("Company Name: " + entry.getKey() + " Stock Price: " + entry.getValue());

            if(entry.getKey().equals("Oracle")) {
                itr.remove();
            }
        }

        System.out.println(stockPrice);

        stockPrice.forEach((key, value) -> System.out
                .println("Company Name: " + key + " Stock Price: " + value));
    }
}