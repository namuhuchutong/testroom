package me.peppermill.testroom.collections.godofjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample {

    public static void main(String[] args) {
        HashSetSample hashSetSample = new HashSetSample();

        Set<String> carSet = new HashSet<>();
        carSet.add("hi");
        carSet.add("hello");
        carSet.add("hi");
        carSet.add("hello");

        hashSetSample.printCarSet(carSet);
        System.out.println(carSet.size());
        hashSetSample.iteratorSample(carSet);
    }

    private void iteratorSample(Set<String> carSet) {
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    private void printCarSet(Set<String> carSet) {
        for(String car : carSet) {
            System.out.println(car);
        }
    }
}
