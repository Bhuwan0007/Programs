package com.thread.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
    private String message;

    WorkerThread(String i){
        this.message = i;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Start : "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" End : "+message);
    }

    private void processMessage(){
        try{
            Thread.sleep(500);
        }catch (InterruptedException exception){
            System.out.println(exception);
        }
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            Runnable runnable = new WorkerThread(" "+i);
            executorService.execute(runnable);
        }
        executorService.shutdown();

        /*while (!executorService.isTerminated()){
            System.out.println("Finish all Thread");
        }*/
    }
}
