package com.map.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {
    public static void main(String[] args) {
        ConcurrentHashMap m = new ConcurrentHashMap();
        m.put(100, "Geeks");
        m.put(101, "For");
        m.put(102, "Geeks");
        System.out.println(m);
// Here we cant add Hello because 101 key
// is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Hello");
        System.out.println(m);
// We can remove entry because 101 key
// is associated with For value
        m.remove(101, "For");
        System.out.println(m);
// Now we can add Hello
        m.putIfAbsent(101, "Hello");
        System.out.println(m);
// We can replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println(m);
    }
}
