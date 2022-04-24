package me.peppermill.testroom.tobyyoutube;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        List<Map<Integer, Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 12);
        list.add(map);
        tester(list);
        System.out.println(list.get(0));
    }

    static void tester(List<Map<Integer, Integer>> list) {
        list.remove(0);
    }
}
