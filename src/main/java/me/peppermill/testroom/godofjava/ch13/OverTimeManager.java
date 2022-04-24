package me.peppermill.testroom.godofjava.ch13;

public class OverTimeManager {

    public int getOverTImeAmount(EnumClassOne value) {
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR:
                amount =100;
                break;
        }

        return amount;
    }

    public static void main(String[] args) {
        OverTimeManager overTimeManager = new OverTimeManager();
        int myAccount = overTimeManager.getOverTImeAmount(EnumClassOne.THREE_HOUR);
        System.out.println("myAccount = " + myAccount);
    }
}
