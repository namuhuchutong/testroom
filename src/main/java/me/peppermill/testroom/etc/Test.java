package me.peppermill.testroom.etc;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
    }
}

class A {

    static final boolean flag;

    static {
        flag = asd();
        System.out.println("flag = " + flag);
    }

    static boolean asd() {
        return true;
    }


    {
        System.out.println("hi im block 1");
    }

    A() {
        System.out.println("hi im constructor");
    }

    {
        System.out.println("hi im block 2");
    }
}
