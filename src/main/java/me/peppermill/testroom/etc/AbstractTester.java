package me.peppermill.testroom.etc;

import java.util.ArrayList;
import java.util.List;

public class AbstractTester {

    public static void main(String[] args) {
        List<AbstractTypeClass> test = new ArrayList<>();

        test.add(new ConcreteA());
        test.add(new ConcreteB());
        test.add(new ConcreteC());

        test.forEach(a -> a.run());
    }
}

interface AbstractType {
    public abstract void run();
}

abstract class AbstractTypeClass {
    abstract void run();
}

class ConcreteA extends AbstractTypeClass {

    @Override
    public void run() {
        System.out.println("I'm A");
    }
}

class ConcreteB extends AbstractTypeClass {

    @Override
    public void run() {
        System.out.println("I'm B");
    }
}

class ConcreteC extends AbstractTypeClass {

    @Override
    public void run() {
        System.out.println("I'm C");
    }
}


