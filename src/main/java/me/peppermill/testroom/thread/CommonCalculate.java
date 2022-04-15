package me.peppermill.testroom.thread;

public class CommonCalculate {

    private int amount;

    public CommonCalculate() {
        this.amount = 0;
    }

    public void plus(int value) {
        this.amount += value;
    }

    public void minus(int value) {
        this.amount -= value;
    }

    public int getAmount() {
        return this.amount;
    }
}
