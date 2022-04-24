package me.peppermill.testroom.godofjava.ch7;

public class ManagerHeight {

    int[][] gradeHeights;

    private void setData() {
        gradeHeights = new int[][]
                {
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186, 0},
                {158, 177, 187, 176, 0},
                {173, 182, 181, 0, 0},
                {170, 180, 165, 177, 172}
        };
    }

    private void printHeight() {
        for (int i = 0; i<5; i++) {
            System.out.println("class No. : " + i+1);
            for (int j = 0; j<5; j++) {
                if (gradeHeights[i][j] != 0) {
                    System.out.println(gradeHeights[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        ManagerHeight manager = new ManagerHeight();
        manager.setData();
        manager.printHeight();
    }
}
