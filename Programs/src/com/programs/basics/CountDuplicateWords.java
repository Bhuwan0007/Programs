package com.programs.basics;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String word = "Big black bug bit a big black dog on his big buscket";
        int count;

        String[] words = word.toLowerCase().split(" ");
        int len = words.length;

        for(int i=0; i<len; i++){
            count=1;
            for(int j=i+1; j<len; j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }

            if(count>1 && words[i]!="0"){
                System.out.println(words[i]+" : "+count);
            }
        }
    }
}
