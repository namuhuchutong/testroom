package me.peppermill.testroom.godofjava;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    static List<Object> strong =  new ArrayList<Object>();

    public static void main(String[] args) {
//        Object strong = new Object();
        strong.add(new Object());
        strong.add(new Object());
        strong.add(new Object());
        strong.add(new Object());
        strong.add(new Object());
        strong.add(new Object());
//        WeakReference<Object> refer = new WeakReference<>(strong.get(1));

        Object dummy = strong.get(1);
        strong = null;
        System.gc();

        System.out.println(strong);
//        System.out.println(refer.get());
        System.out.println(dummy);
    }
}