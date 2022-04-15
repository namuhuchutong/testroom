package me.peppermill.testroom.thread;

public class MovieTheater {

    public static void main(String[] args) {
        MovieSeat movieSeat = new MovieSeat();

        Runnable runnable = () -> {
            synchronized (movieSeat) {
                movieSeat.addMe(System.nanoTime());
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
