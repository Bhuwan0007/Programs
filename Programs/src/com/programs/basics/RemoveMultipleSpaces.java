package com.programs.basics;

import java.util.StringTokenizer;

public class RemoveMultipleSpaces {
    public static void main(String[] args) {
        String str = ":  bhuwa  n tri  pa    thi   .";
        System.out.println(str);
        StringTokenizer st = new StringTokenizer(str," ");
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb);
    }
}
