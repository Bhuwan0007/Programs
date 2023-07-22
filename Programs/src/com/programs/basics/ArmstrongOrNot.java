package com.programs.basics;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        int no = 153;
        int temp = no;
        int c = 0;

        while(no != 0){
            int mod = no % 10;
            no = no / 10;
            c += mod*mod*mod;
        }

        if(c==temp){
            System.out.println("yes "+temp+" is Armstrong");
        }else{
            System.out.println("No "+temp+" is not Armstrong");
        }
    }
}
