package me.peppermill.testroom.collections.godofjava;

import java.util.LinkedList;

public class QueueSample {

    public static void main(String[] args) {
        QueueSample queueSample = new QueueSample();
        queueSample.checkList1();
    }

    private void checkList1() {
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);
        link.addLast("D");
        System.out.println(link);
        link.offer("E");
        System.out.println(link);
        link.offerLast("F");
        System.out.println(link);
        link.push("G");
        System.out.println(link);
        link.add(0, "H");
        System.out.println(link);
        System.out.println("EX = " + link.set(0, "I"));
        System.out.println(link);
    }
}