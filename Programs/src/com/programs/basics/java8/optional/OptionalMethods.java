package com.programs.basics.java8.optional;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        String[] str = new String[10];

        str[2] = "This is Optional keyword";

        Optional<String> data = Optional.ofNullable(str[3]);
        if(data.isPresent()){
            System.out.println(data.get());
        }else{
            System.out.println("Nullable");
        }

        /*System.out.println("data.get() : "+data.get());
        System.out.println("data.hashCode() : "+data.hashCode());
        System.out.println("data.isPresent() : "+data.isPresent());
        data.ifPresent(value -> System.out.println(value.toUpperCase()));*/

        // No output due to null value
        Optional<String> nullOptional = Optional.ofNullable(null);
        nullOptional.ifPresent(value -> System.out.println("The null value is " + value));
    }
}
