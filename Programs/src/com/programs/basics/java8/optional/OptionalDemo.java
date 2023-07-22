package com.programs.basics.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        /*String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);*/

        String[] words = new String[10];
        Optional<String> opt = Optional.ofNullable(words[5]);
        if(opt.isPresent()){
            String word = words[5].toLowerCase();
            System.out.println(word);
        }else
            System.out.println("Empty Word");
    }
}
