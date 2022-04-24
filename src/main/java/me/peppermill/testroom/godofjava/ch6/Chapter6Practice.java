package me.peppermill.testroom.godofjava.ch6;

public class Chapter6Practice {

    public static void main(String[] args) {
        Chapter6Practice chap6 = new Chapter6Practice();

        System.out.println(chap6.getInterestRate(100));
        double amount = 0.0;
        for (int i = 1; i <= 365; i++) {
            amount = chap6.getInterestRate(i);
        }
        System.out.println(amount);
    }

    private double getInterestRate(int day) {
        double res;
        if (day >= 1 && day <= 90) {
            res = day * 0.5;
        } else if(day >= 91 && day <= 180 ) {
            res = day * 1;
        } else if(day >= 181 && day <= 364) {
            res = day * 2;
        } else {
            res = day * 5.6;
        }

        return res;
    }

    public double calculateAmout(int day, long amount) {
        double interRate = getInterestRate(day);
        double res = amount + interRate;
        return res;
    }
}
