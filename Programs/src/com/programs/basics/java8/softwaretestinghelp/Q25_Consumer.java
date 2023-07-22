package com.programs.basics.java8.softwaretestinghelp;

import java.util.function.Consumer;

public class Q25_Consumer {
    public static void main(String[] args) {
        Consumer<String> consumer = consumer1 -> System.out.println(consumer1);
        consumer.accept("Hello");

    }
}
