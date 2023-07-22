package com.programs.basics;

public class ReverseStringPreserveSpace {
    static String reverse(String str){
        char[] inputChar = str.toCharArray();
        int len = inputChar.length;
        char[] result = new char[len];

        for(int i=0; i<len; i++){
            if(inputChar[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for(int i=0; i<len; i++){
            if(inputChar[i] != ' '){
                if(result[j] == ' '){
                    j--;
                }
                result[j] = inputChar[i];
                j--;
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        String str = "I am not String";
        String result = reverse(str);
        System.out.println(str);
        System.out.println(result);
    }
}
