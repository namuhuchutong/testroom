package me.peppermill.testroom.thread;

public class MyThreadTest {

    static final CommonVariable commonVariable = new CommonVariable();

    public static void main(String[] args) {
       Thread tester1 = new Thread(() -> {
           synchronized (commonVariable) {
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
           synchronized (commonVariable) {
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
