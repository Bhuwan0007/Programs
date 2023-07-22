package com.programs.basics;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        System.out.println("enter two nos : ");
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        int lcm,hcf,denominator,numerator,reminder;

        if(no1>no2){
            numerator = no1;
            denominator = no2;
        }else{
            numerator = no2;
            denominator = no1;
        }

        reminder = numerator%denominator;
        while(reminder!=0){
            numerator = denominator;
            denominator = reminder;
            reminder = numerator % denominator;
        }
        hcf = denominator;
        lcm = no1 * no2 / hcf;

        System.out.println("LCM : "+lcm+"\nHCF : "+hcf);

    }
}
