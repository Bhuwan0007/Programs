package com.programs.basics.java8;

import java.util.Arrays;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted().forEach(System.out::println);

    }
}
