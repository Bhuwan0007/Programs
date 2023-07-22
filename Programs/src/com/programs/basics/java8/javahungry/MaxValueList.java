package com.programs.basics.java8.javahungry;

import java.util.Arrays;
import java.util.List;

public class MaxValueList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,45,18,67,43,67,124,12,23,56,12,89,95,83,53);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
