package me.peppermill.testroom.etc;

import java.util.Arrays;
import java.util.List;

public class DynamicDispatch1 {
    static class Service {
        void run() {
            System.out.println("im run()");
        }

        void run(String msg) {
            System.out.println("im run(msg) - " + msg);
        }
    }

    static abstract class AbstractService {
        abstract void run();
    }

    static class MyService1 extends AbstractService {

        @Override
        void run() {
            System.out.println("im service1 overrride run()");
        }
    }

    static class MyService2 extends AbstractService {

        @Override
        void run() {
            System.out.println("im service2 override run()");
        }
    }


    public static void main(String[] args) {
        Service service = new Service();
        service.run();
        service.run("hi");

        MyService1 svc1 = new MyService1();
        MyService2 svc2 = new MyService2();

        svc1.run();
        svc1.run();
        // 난 상위 타입으로 지정했는데 어디있는 메서드를 실행하냐?
        // 이것이 dynamic dispatch 런타임 때 결정이 됨.
        // receiver parameter

        List<AbstractService> svc = Arrays.asList(new MyService1(), new MyService2());
        svc.forEach(AbstractService::run);

    }
}
