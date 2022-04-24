package me.peppermill.testroom.collections.godofjava;

import java.util.Stack;

public class StackSample {

    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
        sample.checkPop();
    }

    private void checkPeek() {
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.peek());
        }
        System.out.println("size = " + intStack.size());
    }

    private void checkPop() {
        Stack<Integer> intStack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            intStack.push(i);
            System.out.println(intStack.pop());
        }
        System.out.println(intStack.size());
    }
}
