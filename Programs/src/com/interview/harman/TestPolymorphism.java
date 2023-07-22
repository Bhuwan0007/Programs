package com.interview.harman;

class A{
    void m1(){
        System.out.println("execute A class M1 method");
    }
}
class B extends A{
    void m2(){
        System.out.println("execute B class M2 method");
    }
}
public class TestPolymorphism {
    public static void main(String[] args) {
        A a=new B();
        // a.m2();  // error due to not have m2() in class A
    }
}
