package com.programs.basics;

public class ReverseStringPreserveSpace1 {
    static String reverse(String str){
        char[] inputArray = str.toCharArray();
        int len = inputArray.length;
        char[] result = new char[len];

        for(int i=0; i<len; i++){
            if(inputArray[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = result.length-1;
        for(int i=0; i<len; i++){
            if(inputArray[i] != ' '){
                if(result[j] == ' '){
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        String input = "I am not String";
        String output = reverse(input);
        System.out.println(input);
        System.out.println(output);
    }
}
