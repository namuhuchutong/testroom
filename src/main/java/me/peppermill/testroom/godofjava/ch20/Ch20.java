package me.peppermill.testroom.godofjava.ch20;

public class Ch20 {

    public static void main(String[] args) {
        Ch20 test = new Ch20();
        test.parseLong("dsafjads");
        test.printOtherBase(1024);
    }

    private void run() {
    }

    public long parseLong(String data) {
        long result = 0;
        try {
            result = Long.parseLong(data);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(data.toString() + " is not a number");
        }
        return result;
    }

    public void printOtherBase(long value) {
        System.out.println("value = " + value);
        System.out.println("value = " + Long.toBinaryString(value));
        System.out.println("value = " + Long.toHexString(value));
        System.out.println("value = " + Long.toOctalString(value));
    }
}
