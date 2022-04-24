package me.peppermill.testroom.godofjava.ch13;

public enum EnumClassTwo {
    THREE_HOUR(18000),
    FIVE_HOUR(30000);

    private final int amount;

    EnumClassTwo(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
