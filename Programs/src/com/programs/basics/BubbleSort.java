package com.programs.basics;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,-6,77,2,-52,65,-82,48};
        int len = array.length;
        int temp = 0;

        for(int i=0; i<len; i++){
            for(int j=1; j<len-i; j++){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] +" ");
        }
    }
}
