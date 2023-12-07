package com.educative.collections;

import java.util.*;
import java.util.Map.*;
import java.util.stream.Collectors;

public class HashMapExercise {

    public static void main(String args[]) {

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        // One way
        // Find maximum stock price

        Collection<Integer> stockValues = stockPrice.values();

        List<Integer> stockPriceList = new ArrayList(stockValues);

//        Collections.sort(stockPriceList,Comparator.reverseOrder());
//        System.out.println(stockPriceList.get(0));

        System.out.println(stockPriceList);

        Optional<Integer> maxStockPrice = stockPriceList.stream().
                max(Comparator.naturalOrder());

        System.out.println(maxStockPrice.get());

        // Find average stock price

        Iterator<Integer> itr = stockPriceList.iterator();

        double totalAmount=0;
        double avgStockPrice;

        while(itr.hasNext()) {
            totalAmount+=itr.next();
        }

        avgStockPrice = totalAmount / stockPriceList.size();

        System.out.println(avgStockPrice);

        // Another way
        int max = 0;
        String company = "";

        for(Entry<String, Integer> entry : stockPrice.entrySet()) {
            if(entry.getValue() > max) {
                company = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println("Company with max stock price is: " + company);

        Collection<Integer> values= stockPrice.values();

        int sum = 0;

        for(int i : values) {
            sum += i;
        }
        // Sum of values using Java 8 features
        //int sum = values.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("The average  stock price is " + sum / values.size());

        // Common way
        // Remove companies that have stock price less than 50 dollars

        Set<Entry<String,Integer>> entrySet = stockPrice.entrySet();

        Iterator<Entry<String,Integer>> itr1 = entrySet.iterator();

        while (itr1.hasNext()) {
            Entry<String,Integer> entry = itr1.next();
            if (entry.getValue() < 50) {
                itr1.remove();
            }
        }

        System.out.println(stockPrice);
    }
}
