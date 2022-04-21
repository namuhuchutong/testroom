package me.peppermill.testroom.tobyyoutube;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Generics {

    static class Hello<T> {

    }

    static void print(String value){
        System.out.println("value = " + value);
    }

    public static void main(String[] args) {
        // 컴파일 시점에 일관성 있게 작성하는 방법

        Pair<String, Integer> p1 = new OrderedPair<>("hoyeon", 1);
        Pair<String, String> p2 = new OrderedPair<>("hello", "world");
        Pair<Integer, Pair> p3 = new OrderedPair<>(1, p2);
        Pair<Integer, Pair<Integer, Pair>> p4 = new OrderedPair<>(1, p3);

        OrderedPair.<Double>staticPrint(1000.000);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Generics generics = new Generics();
        generics.ErrorExample();


//        String[] strs = Generics.pickTwo("hell", "worl", "d");


        String[] arr = new String[] {"a", "b", "c", "d"};
        System.out.println(countGreaterThan(arr, "b"));

        println(Arrays.asList(1,2,3,4,5));
    }

    static <T extends Comparable<T>> long countGreaterThan(T[] arr, T elem) {
        return Arrays.stream(arr).filter(s -> s.compareTo(elem) > 0).count();
    }

    static void println(List<?> list) {
        list.forEach(System.out::println);
    }


    private void ErrorExample() {
        List<Integer> ints = Arrays.asList(1,2,3);
        List raw = ints;
//        @SuppressWarnings("unchecked")
//        List<Integer> ints2 = raw;
//        List<Map<String, Object>> map = new ArrayList<>();
//        dataList((Map[]) map.toArray());
    }

    @SafeVarargs
    static void dataList(Map<String, Object>... pmap) {
        Object[] ca = pmap;
        Map<String, Object> b = pmap[1];
        b.get("asdf");
    }

    //effective java
    static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError();
    }

    @SafeVarargs
    static <T> T[] toArray(T... args) {
        return args;
    }
}

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // 타입 추론이 가능함. 심지어 static임!
    static <V> void staticPrint(V value) {
        System.out.println(value);
    }

    <V> void print(V value) {
        System.out.println(value);
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}