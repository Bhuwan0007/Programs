package com.programs.basics.java8.javahungry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,45,18,67,43,67,12,23,56,12,89,95,83,53);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(no -> !set.add(no)).forEach(System.out::println);


        //list.stream().filter(no -> no % 2 == 0).forEach(System.out::println);

    }
}
