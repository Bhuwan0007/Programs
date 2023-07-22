package com.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"(Start) message = "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+"(End)");
    }

    private void processMessage(){
        try{
            Thread.sleep(2000);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
public class ThreadPoolExecutors {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++){
            Runnable workerThread = new WorkerThread(""+i);
            executorService.execute(workerThread);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {   }

        System.out.println("Finished all threads");
    }
}
