package com.programs.basics.java8.javahungry;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,45,18,67,43,67,12,23,56,12,89,95,83,53);
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
