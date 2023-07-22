package com.designPatterns.Builder;

public class StudentReceiver {
    private volatile Student student;

    public StudentReceiver(){
        Thread t1 = new Thread(new Runnable(){
                    public void run(){
                        student = Student.Builder.newInstance().
                                setId(1).setName("Bhuwan1").setAddress("Delhi1").build() ;
                    }
                }
        );

        Thread t2 = new Thread(new Runnable(){
                    public void run(){
                        student = Student.Builder.newInstance().
                                setId(2).setName("Vinod2=1").setAddress("Mumbai1").build();
                    }
                }
        );

        t1.start();
        t2.start();
    }

    public Student getStudent(){
        return student;
    }
}
