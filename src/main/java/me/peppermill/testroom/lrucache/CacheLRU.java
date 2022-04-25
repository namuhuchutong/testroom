package me.peppermill.testroom.lrucache;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CacheLRU {

    private static final int MAX_CAPACITY = 50;

    private static Map<Integer, WeakReference<Thumbnail>> lru = new HashMap<>();
    private static LinkedList<Thumbnail> strongReference = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {

        CacheLRU tester = new CacheLRU();

        for (int i = 0; i < 100; i++) {
            lru.put(i, tester.addThumbnail(i));
        }

        System.out.println(strongReference);
        System.out.println(lru);

        System.out.println();
        System.gc();


        for (Map.Entry<Integer, WeakReference<Thumbnail>> temp : lru.entrySet()) {
            System.out.println(temp.getKey() + " = " + temp.getValue().get());
        }

    }

    private WeakReference<Thumbnail> addThumbnail(int i) {
        WeakReference<Thumbnail> wk = new WeakReference<>(new Thumbnail(i));
        strongReference.addFirst(wk.get());

        if (strongReference.size() > MAX_CAPACITY) {
            strongReference.removeLast();
        }
        return wk;
    }
}

class Thumbnail {

    private int i;

    public Thumbnail(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Thumbnail{" +
                "i=" + i +
                '}';
    }
}
