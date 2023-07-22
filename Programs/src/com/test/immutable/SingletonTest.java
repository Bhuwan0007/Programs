package com.test.immutable;

import java.io.Serializable;

class Employee implements Serializable, Cloneable {
    private static Employee instance;

    private Employee(){

    }
    // colonable
    /*public Object readResolve(){

    }*/

    public static Employee getInstance(){
        if(instance==null){
            synchronized (Employee.class){
                if(instance==null){
                    instance = new Employee();
                }
            }
        }
        return instance;
    }
}

public class SingletonTest {
}
