package com.programs.basics.java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,12,54,65,72,91,88,57);
        //list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        list.stream().filter(i -> i%2==0).forEach(System.out::println);
    }
}
