package com.programs.basics.java8.softwaretestinghelp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q28_LowestHighest {
    public static void main(String[] args) {
        System.out.println("finding lowest highest...");
        List<Integer> list = Arrays.asList(11, 2, 3, 77, 6, 5);

        System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(list.stream().min(Comparator.comparing(Integer::valueOf)).get());

    }
}
