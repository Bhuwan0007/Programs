package com.programs.basics;

public class LcmHcf_1 {
    public static void main(String[] args) {
        int no1 = 8;
        int no2 = 6;
        int lcm,hcf,reminder,numerator, denominator;

        if(no1 >= no2){
            numerator = no1;
            denominator = no2;
        }else{
            numerator = no2;
            denominator = no1;
        }
        reminder = numerator % denominator;
        while (reminder !=0){
            numerator = denominator;
            denominator = reminder;
            reminder = numerator % denominator;
        }
        hcf = denominator;
        lcm = no1 * no2 / 2;

        System.out.println("HCF : "+hcf+"\nLCM : "+lcm);
    }
}
