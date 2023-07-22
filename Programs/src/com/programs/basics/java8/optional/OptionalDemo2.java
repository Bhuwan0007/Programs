package com.programs.basics.java8.optional;

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        String[] str = {"bhu","xyz","pqr","abc"};

        for(String i : str){
            Optional<String> strOpt = Optional.ofNullable(str.toString());
            if(strOpt.isPresent()){
                System.out.println(strOpt.get());
            }else{
                System.out.println("Null");
            }
        }

    }
}
