package me.peppermill.testroom.thread;


public class MyThread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }

    public void run() {
       RunnableExample[] runnableExamples = new RunnableExample[5];
       ThreadExample[] threadExamples = new ThreadExample[5];

       for (int i=0; i<5; i++) {
           runnableExamples[i] = new RunnableExample();
           threadExamples[i] = new ThreadExample();

           new Thread(runnableExamples[i]).start();
           threadExamples[i].start();
       }
        System.out.println("end");
    }
}

class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable example");
    }
}

class ThreadExample extends Thread {

    public void run() {
        System.out.println("Thread example");
    }
}