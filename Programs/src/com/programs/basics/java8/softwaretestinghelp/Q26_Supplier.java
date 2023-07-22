package com.programs.basics.java8.softwaretestinghelp;

import java.util.function.Supplier;

public class Q26_Supplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Q26_Supplier";
        System.out.println(supplier.get());
    }
}
