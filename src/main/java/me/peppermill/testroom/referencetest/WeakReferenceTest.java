package me.peppermill.testroom.referencetest;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.*;

public class WeakReferenceTest {

    public static List<MyObject> hardReferences = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        hardReference();
    }

    public static void hardReference() throws InterruptedException {
        System.out.println("Please open JCONSOLE Heap Memory Graph. Waiting for 30 secs.");
        Thread.sleep(15000);
        System.out.println("Starting now ...");

        for (int i = 0; i < 100000; i++) {

            MyObject hardObj = new MyObject("Hard-MyObject-" + i);
            hardReferences.add(hardObj);
        }

        System.out.println("Completed !");

    }
}

class MyObject {

    private String name;

    private String heavyLoad = "";

    public MyObject(String name) {
        this.name = name;
        for (int i = 0; i < 2000; i++) {
            heavyLoad = heavyLoad + name;
        }
        System.out.println("Created - " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("#### Finalizing - " + name);
    }
}