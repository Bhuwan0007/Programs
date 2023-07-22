package com.thread.basic;

class SimpleTask1 extends Thread{
    public void run(){
        System.out.println("SimpleTask1");
    }
}

class SimpleTask2 extends Thread{
    public void run(){
        System.out.println("SimpleTask2");
    }
}

public class TestMulTask2 {
    public static void main(String[] args) {
        SimpleTask1 t1 = new SimpleTask1();
        SimpleTask2 t2 = new SimpleTask2();

        t1.start();
        t2.start();

    }
}
