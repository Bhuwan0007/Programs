package com.programs.basics.java8.softwaretestinghelp;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q22_Average {
    public static void main(String[] args) {
        //  Write a Java 8 program to square the list of numbers and then filter out the numbers greater than 100
        //  and then find the average of the remaining numbers?
        Integer[] arr = new Integer[] { 1200, 1100, 9, 8, 200 };
        List<Integer> list = Arrays.asList(arr);

        System.out.println("Find First : "+list.stream().findFirst());
        System.out.println("Find Any : "+list.stream().findAny());

        OptionalDouble avg = list.stream().mapToInt(n ->n*n) .filter(n -> n > 100).average();
        if(avg.isPresent()){
            System.out.println(avg.getAsDouble());
        }
    }
}
