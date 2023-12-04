package com.java.interviewbit.collections;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i=0; i < 10 ; i++) {
            list.add("A"+i);
        }

        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.indexOf("A4"));
        System.out.println(list.set(1,"B1"));
        System.out.println(list);
        System.out.println(list.contains("A10"));
        System.out.println(list.remove(8));
        System.out.println(list);

        Iterator it = list.iterator();
        System.out.println("---");
        System.out.println(it.next());
        System.out.println("---");
        it.remove();
        System.out.println("---");
        System.out.println(list);

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(list);

        System.out.println(list);

        list.add(null);
        list.add(null);

        list.add("B1");
        list.add("A2");

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        List<String> newList = list.subList(2,5);

        System.out.println(newList);

        newList.addAll(1,list);

        System.out.println(newList);

        System.out.println(newList.lastIndexOf("A2"));
        System.out.println(newList.indexOf("A2"));
    }
}
