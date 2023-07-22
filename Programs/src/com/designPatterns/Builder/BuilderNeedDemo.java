package com.designPatterns.Builder;

public class BuilderNeedDemo {
    public static void main(String[] args) {
        StudentReceiver studentReceiver = new StudentReceiver();
        System.out.println(studentReceiver.getStudent());
    }
}
