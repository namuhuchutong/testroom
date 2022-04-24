package me.peppermill.testroom.godofjava.ch14;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.printDivide(1, 2);
        calc.printDivide(1, 0);
    }

    private void printDivide(int i, int i1) {
//       try {
//           double result = i / i1;
//           System.out.println(result);
//       } catch (ArithmeticException e) {
//           System.out.println("divde by zero");
//           e.printStackTrace();
//       }

        if ( i1 == 0 || i == 0) {
            throw new ArithmeticException("0은 나눌 수 없습니다.");
        }

        double result = i / i1;
        System.out.println(result);
    }
}
