package me.peppermill.testroom.etc;

public class AbstractOverloadTest {

    public static void main(String[] args) {
        OverLoadTest overLoadTest = new OverLoader();
        overLoadTest.tester(10);
        overLoadTest.tester();
    }
}

abstract class OverLoadTest {
    abstract void tester();

    public void tester(int a) {
        System.out.println(a);
    }
}

class OverLoader extends OverLoadTest {

    @Override
    void tester() {
        System.out.println("this is overloaded method");
    }
}
