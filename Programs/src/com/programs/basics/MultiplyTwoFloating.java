package com.programs.basics;

import java.util.Scanner;

public class MultiplyTwoFloating {
    public static void main(String[] args) {
        System.out.println("Enter 2 floating nos");
        Scanner sc =  new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();

        System.out.println(f1*f2);
    }
}
