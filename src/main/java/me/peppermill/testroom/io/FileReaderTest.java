package me.peppermill.testroom.io;

import java.io.*;
import java.util.Scanner;

public class FileReaderTest {

    public static void main(String[] args) {
        FileReaderTest sample = new FileReaderTest();
//        sample.readFile("test.txt");
//        sample.readFileTryWithResource("test2.txt");
        sample.readFileWtihScanner("test2.txt");
    }

    private void readFile(String fileName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ( (data=bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                   bufferedReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    private void readFileTryWithResource(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String data;
            while ( (data=bufferedReader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFileWtihScanner(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
