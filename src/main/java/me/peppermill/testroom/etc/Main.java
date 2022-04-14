package me.peppermill.testroom.etc;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable print100 = new PrintNum(100);

        Thread thread1 = new Thread(print100);
        Thread thread2 = new Thread(print100);
        Thread thread3 = Thread.currentThread();

        thread1.setPriority(1);
        thread2.setPriority(2);
        thread3.setPriority(10);

        thread1.start();
        thread2.start();
        for(int i = 0; i<100; i++) {
            System.out.println("i = " + i);
        }
    }
}

class PrintNum implements Runnable{
    private int lastNum;

    public PrintNum(int n){
        lastNum = n;
    }

    @Override
    public void run(){
        for (int i = 0; i <= lastNum; i++) {
            System.out.println(this.toString() + " - "+ i);
        }
    }
}