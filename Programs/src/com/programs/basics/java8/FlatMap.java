package com.programs.basics.java8;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> name =
                Arrays.asList(
                        Arrays.asList("Saket1", "Trevor1", "Franklin1", "Michael1", "Tiwari1"),
                        Arrays.asList("Saket2", "Trevor2"),
                        Arrays.asList("Saket3", "Trevor3", "Tiwari3"),
                        Arrays.asList("Saket4", "Trevor4", "Franklin4", "Michael4", "Tiwari4", "Joshi5")
                );

        /*name.stream()
                .flatMap(firstName -> firstName.stream().filter(s -> s.contains("k")))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        name.stream()
                .flatMap(firstName -> firstName.stream().filter(x->x.startsWith("F")))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /*----------------*/
        System.out.println("/*----------------*/");


        Map<String, List<String>> people = new LinkedHashMap<>();
        people.put("Cena", Arrays.asList("123-1123", "456-3389"));
        people.put("Undertaker", Arrays.asList("678-2243", "986-5264"));
        people.put("Khali", Arrays.asList("678-6654", "986-3242"));

        List<List<String>> phonesWithmap = people.values().stream().map(p -> p).collect(Collectors.toList());
        System.out.println("phones with map() : " + phonesWithmap);

        List<String> phonesWithFlatmap = people.values().stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("phones with flatmap() : " + phonesWithFlatmap);


    }
}
