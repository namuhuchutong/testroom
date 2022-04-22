package me.peppermill.testroom.io;

import java.io.File;

public class FileSample {

    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "/Users/hoyeonjang/csrf.html";
        sample.checkPath(pathName);
        System.out.println();
        sample.makeDir(pathName);
        System.out.println();
        sample.canRead(pathName);
    }

    private void canRead(String pathName) {
        File file = new File(pathName);
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(file.exists());
    }

    private void makeDir(String path) {
        File file = new File(path);
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
    }
}
