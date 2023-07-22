package com.programs.basics;

public class ReverseStringWithoutAffectSpecialChars {
    static void reverse(char[] str){
        int right = str.length-1, left=0;

        while(left<right){
            if(!Character.isAlphabetic(str[left])){
                left++;
            }else if(!Character.isAlphabetic(str[right])){
                right--;
            }else{
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        String str = "a!!b.c,d-e'f@g%hi";
        char[] charArray = str.toCharArray();
        System.out.println("Input String "+str);
        reverse(charArray);

        String reverseArray = new String(charArray);
        System.out.println("Reverse String "+reverseArray);

    }
}
