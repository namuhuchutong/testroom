package me.peppermill.testroom.thread;

public class LockTest {

    public static void main(String[] args) throws InterruptedException {

        TheChosenOne1 theChosenOne1 = new TheChosenOne1();
        Thread tester1 = new Thread(
                () -> {
                    for (int i = 0; i<1000; i++){
                        theChosenOne1.inc1();
                    }
                }
        );
        Thread tester2 = new Thread(
                () -> {
                    for (int i = 0; i<1000; i++){
                        theChosenOne1.inc1();
                    }
                }
        );

        tester1.start();
        tester2.start();

        tester1.join();
        tester2.join();

        System.out.println(theChosenOne1.getA());
        System.out.println(theChosenOne1.getB());

    }
}

class TheChosenOne1 {
    int a = 0;
    int b = 0;
    final Object lock1 = new Object();
    final Object lock2 = new Object();

    public void inc1() {

        //
        synchronized (lock1) {
            a++;
        }
            // do something
        // so on...
        //. ..
        //...
    }

    public void inc2() {
            b++;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
