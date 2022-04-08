package me.peppermill.testroom.etc;

public interface TestInterface {

    int THE_VALUE = 10;

    void testMethod1();

    default void testMehtod2() {
        privateMethod();
        System.out.println("I'm default Mehtod!");
    }

    static void testMethod3() {
        System.out.println("I'm static method!");
    }

    private void privateMethod() {
        System.out.println("Hello! private method is invoked!");
    }
    
}
