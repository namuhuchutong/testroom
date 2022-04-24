package me.peppermill.testroom.collections.godofjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapSample {

    public static void main(String[] args) throws InterruptedException {
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new ConcurrentHashMap<>();
        List<Integer> subList = parrelSum100(map, 100);

        System.out.println(map);
        System.out.println(subList);
    }

    private static List<Integer> parrelSum100(Map<String, Integer> map, int count) throws InterruptedException{
        List<Integer> sumList = new ArrayList<>(1000);

        for (int i = 0; i < count; i++) {
            map.put("test", 0);
            ExecutorService executorService = Executors.newFixedThreadPool(4);

            for (int j = 0; j < 10; j++) {
                executorService.execute( () -> {
                    for (int k = 0; k < 10; k++) {
                        map.computeIfPresent(
                                "test",
                                (key, value) -> value + 1
                                );
                    }
                });
            }
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
            sumList.add(map.get("test"));
        }
        return sumList;
    }
}
