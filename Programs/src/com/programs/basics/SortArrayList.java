package com.programs.basics;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(11);
        list.add(55);
        list.add(034);
        list.add(98);
        list.add(67);
        list.add(83);

        int len = list.size();

        System.out.println("List before sorting");
        System.out.print(list+" ");
        for(int i=0 ; i<len; i++){
            for(int j=1; j<len; j++){
                if(list.get(j-1) > list.get(j)){
                    int temp = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("\n\nList after sorting");
        System.out.print(list+" ");
    }
}
