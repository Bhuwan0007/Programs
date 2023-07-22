package com.programs.basics;

public class Top2Nos {
    public static void main(String[] args) {
        int[] nos = {23,14,56,89,47,63,72,15,7,9,34};
        int maxFirst = 0, maxSecond = 0;

        for(int n : nos){
            if(maxFirst < n){
                maxSecond = maxFirst;
                maxFirst =n;
            } else if(maxSecond < n){
                maxSecond = n;
            }
        }
        System.out.println("MaxFirst : "+maxFirst+" & MaxSecond : "+maxSecond);
    }
}
