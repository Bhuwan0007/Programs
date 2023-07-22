package com.programs.basics.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,19,25,98,32);
        myList.stream()
        .map(i->i + "").
        filter(i->i.startsWith("1")).forEach(System.out::println);
    }
}
