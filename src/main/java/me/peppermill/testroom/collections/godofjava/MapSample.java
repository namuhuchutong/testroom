package me.peppermill.testroom.collections.godofjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {

    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
        mapSample.checkHashMap();
        System.out.println();
        mapSample.checkHashSet();
        System.out.println();
        mapSample.checkHashEntry();
        System.out.println();
        mapSample.checkContains();
    }

    private void checkContains() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        System.out.println(map.containsKey("B"));
        System.out.println(map.containsKey("E"));
        System.out.println(map.containsKey("G"));
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));

    }

    private void checkHashEntry() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> temp : entries) {
            System.out.println(temp.getKey() + " = " + temp.getValue());
        }
    }

    private void checkHashSet() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("E", "e");

        Set<String> keySet = map.keySet();
        for(String temp : keySet) {
            System.out.println(temp + " = " + map.get(temp));
        }
    }

    private void checkHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        map.put("A", "1");
        System.out.println(map.get("A"));
    }
}
