package me.peppermill.testroom.thread;

public class MyThreadTest {


    public static void main(String[] args) {
        CommonVariable commonVariable = new CommonVariable();
        Object lock1 = new Object();
        Thread tester1 = new Thread(() -> {
           synchronized (lock1) {
           commonVariable.a = 11;
           try {
               Thread.sleep(10000);
               System.out.println("A out");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           }
        });
        Thread tester2 = new Thread(() -> {
           synchronized (lock1) {
           commonVariable.a = 12;
           try {
               Thread.sleep(10000);
               System.out.println("B out");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }}
        });

       tester1.start();
       tester2.start();


    }


}

class CommonVariable {
    int a = 10;
}
