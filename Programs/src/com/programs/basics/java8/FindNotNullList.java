package com.programs.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNotNullList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("xyz",null,"pwr","ght",null);
        list.stream().collect(Collectors.toList()).forEach(System.out::println);

       // Optional<String> opt = (Optional<String>) Optional.ofNullable(list);

        System.out.println("-------------------------\n");
        Optional<List<String>> listOptional = Optional.ofNullable(Arrays.asList("Rupad",null, "Mastana", "Jago",null));
        listOptional.ifPresent(list1 -> list1.forEach(value -> System.out.println(value)));

    }
}
