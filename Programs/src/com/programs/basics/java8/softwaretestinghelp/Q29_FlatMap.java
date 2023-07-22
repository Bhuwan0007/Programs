package com.programs.basics.java8.softwaretestinghelp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q29_FlatMap {
    public static void main(String[] args) {
        List<List<String>> name =
                Arrays.asList(Arrays.asList("Saket1", "Trevor1", "Franklin1", "Michael1"),
                              Arrays.asList("Saket2", "Trevor2", "Franklin2", "Michael2"),
                              Arrays.asList("Saket3", "Trevor3", "Franklin3", "Michael3"),
                              Arrays.asList("Saket4", "Trevor4", "Franklin4", "Michael4")
                );

                name.stream()
                    .flatMap(firstName -> firstName.stream().filter(s -> s.contains("k")))
                        .collect(Collectors.toList())
                            .forEach(System.out::println);
    }
}
