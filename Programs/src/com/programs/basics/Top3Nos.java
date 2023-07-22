package com.programs.basics;

public class Top3Nos {
    static void print3rdLargest(int arr[], int size){
        int i, first, second, third;

        if(size < 3){
            System.out.println("Invalid Input");
        }
        third = second = first = Integer.MIN_VALUE;
        for(i=0; i<size; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                third = second;
                second = arr[i];
            }

            else if(arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("first : "+first+" second : "+second+" third : "+third);
    }

    public static void main(String[] args) {
        int[] array = new int[] {23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
        int len = array.length;
        print3rdLargest(array,len);
    }
}
