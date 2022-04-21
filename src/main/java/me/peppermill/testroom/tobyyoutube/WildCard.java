package me.peppermill.testroom.tobyyoutube;

import java.util.Arrays;
import java.util.List;

public class WildCard {

    static <T> void method1(List<T> list) {

    }

    static void method2(List<?> list) {
        list.add(null);
//        list.add(10);
        list.size();
        list.clear();
        list.iterator();
    }

    // 권장 안함
    static <T> boolean isEmpty(List<T> list) {
        return list.size() == 0;
    }

    // 자바에서 권장하는 방법 why? 외부로 불필요하게 노출할 필요가 있나?
    static boolean isEmptyWildCard(List<?> list) {
        return list.size() == 0;
    }

    static <T> long frequency(List<T> list, T elem) {
        return list.stream().filter(s -> s.equals(elem)).count();
    }

    static <T> long frequency2(List<?> list, Object elem) {
        return list.stream().filter(s -> s.equals(elem)).count();
    }

    static <T extends Comparable> T max(List<T> list) {
        return list.stream().reduce((a, b) -> a.compareTo(b) > 0 ? a : b).get();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,3,3,3,3,3,4);
        method1(list);
//        method2(list);

        List<Integer> list2 = Arrays.asList();
        System.out.println(isEmpty(list2));
        System.out.println(isEmptyWildCard(list2));
        // T를 반드시 써야한다면...
        System.out.println(frequency(list, 3));
        // Object로 상관이 없다면...
        System.out.println(frequency2(list, 3));

        System.out.println(max(list2));
    }
}
