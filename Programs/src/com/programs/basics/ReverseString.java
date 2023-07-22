package com.programs.basics;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I am not String";
        char[] charArray = str.toCharArray();
        int len = charArray.length;

        for(int i=len-1; i>=0; i--){
            System.out.print(charArray[i]+" ");
        }
    }
}
