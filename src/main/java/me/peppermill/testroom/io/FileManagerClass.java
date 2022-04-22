package me.peppermill.testroom.io;

import java.io.File;
import java.io.IOException;

public class FileManagerClass {

    public static void main(String[] args) {
        FileManagerClass sample = new FileManagerClass();
        String pathName = File.separator+"hi"+File.separator+"text";
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    private void checkFile(String pathName, String fileName) {
        File file = new File("/Users/hoyeonjang/csrf.html");
        try {
            System.out.println("result = " + file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getFileInfo(File file) throws IOException {
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        System.out.println(file.getCanonicalPath());

        System.out.println(file.getName());
        System.out.println(file.getPath());
    }
}
