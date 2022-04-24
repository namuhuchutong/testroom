package me.peppermill.testroom.collections.godofjava;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList1();
//        sample.checkArrayList2();
//        sample.checkArrayList3();
//        sample.checkArrayList4();
//        sample.checkArrayList5();
        sample.checkArrayList6();
    }

    private void checkArrayList1() {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");

        list1.forEach(System.out::println);
    }

    private void checkArrayList2() {
        List<String> list1 = new ArrayList<>();
        list1.add("1");

        List<String> list2 = list1;
        list1.add("hi");
        list2.forEach(System.out::println);
    }

    private void checkArrayList3() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();

        for(int i = 0; i < listSize; i++) {
            System.out.println(list.get(i));
        }
    }

    private void checkArrayList4() {
        List<String> list = new ArrayList<>();
        list.add("a");
        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);
    }

    private void checkArrayList5() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[] temp = new String[5];
        String[] strList = list.toArray(temp);
        for(String s : strList) {
            System.out.println(s);
        }
    }

    private void checkArrayList6() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

//        System.out.println("removed : " + list.remove(0));
        System.out.println(list.remove("A"));
        List<String> temp = new ArrayList<>(list);
        temp.add("adfasd");
        System.out.println(list.removeAll(temp));

        for(String s : list) {
            System.out.println(s);
        }

        System.out.println();

        for(String s : temp) {
            System.out.println(s);
        }

    }
}
