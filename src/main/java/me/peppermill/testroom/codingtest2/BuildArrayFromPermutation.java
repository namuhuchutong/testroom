package me.peppermill.testroom.codingtest2;


import me.peppermill.testroom.etc.TestInterface;
import me.peppermill.testroom.etc.TestInterfaceConcreteClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {

        TestClass tester = new ConcreteClass();
        tester.doIt();
        tester.testMehtod2();
        TestClass.testMethod();

        System.out.println();

        TestInterface tester2 = new TestInterfaceConcreteClass();
        tester2.testMethod1();
        tester2.testMehtod2();
        TestInterface.testMethod3();

        var test = new ArrayList<Map<String, Object>>();
        List<Integer> test3 = new ArrayList<>();
        List<Map<String, Object>> test2 = new ArrayList<Map<String, Object>>();

    }

}


abstract class TestClass {
    private int testInt = 1;
    static final long testFloat = 1L;

    static {
        System.out.println("static block is called");
    }

    {
        System.out.println("init block called");
    }

    TestClass() {
        System.out.println("I'm Constructor!");
    }

    abstract void doIt();

    void testMehtod2() {
        System.out.println("I'm normal Method!");
    }

    static void testMethod() {
        System.out.println("I'm static Test Method!");
    }

    private void testPrivateMethod() {

    }

    protected void testProtectedMethod() {

    }
}

class ConcreteClass extends TestClass {

    @Override
    void doIt() {
        System.out.println("do it!");
    }
}