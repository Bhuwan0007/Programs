package com.programs.basics.java8.softwaretestinghelp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q29_MapUpperCase {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
        System.out.println("List : "+name);

        System.out.println("\nNow Map");
        name.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
}
