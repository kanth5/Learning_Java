package com.educative.collections;

// unmodifiableList(List<? extends T> list)
// unmodifiableSet(Set<? extends T> s)
// unmodifiableMap(Map<? extends K, ? extends V> m)
// unmodifiableCollection(Collection<? extends T> c)
// unmodifiableSortedMap(SortedMap<K,? extends V> m)
// unmodifiableSortedSet(SortedSet<T> s)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionDemo {

    public static void main(String args[]) {
        List<String> list = new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Russia");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        // This will throw exception because element can't be added to unmodifiable list.
        unmodifiableList.add("China");
    }

}
