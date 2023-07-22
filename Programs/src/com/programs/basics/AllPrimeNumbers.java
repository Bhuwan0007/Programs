package com.programs.basics;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static boolean isPrime(int no){
        for(int i=2; i<no/2; i++){
            if(no%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter no to list Prime numbers ");
        Scanner sc =  new Scanner(System.in);
        int no = sc.nextInt();
        boolean b = isPrime(no);
        if(b){
            System.out.println("Yes "+no+" is Prime");
        }else{
            System.out.println("No "+no+" is not Prime");
        }
    }
}
