package com.thread.basic;

public class TestMulTask1 extends Thread {
    public void run(){
        System.out.println("Task 1");
    }
    public static void main(String[] args) {
        TestMulTask1 t1 = new TestMulTask1();
        TestMulTask1 t2 = new TestMulTask1();

        t1.start();
        t2.start();
    }
}
