package me.peppermill.testroom.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

    public static void main(String[] args) {
        FileWriterSample sample = new FileWriterSample();
//        sample.writeFile("test.txt", 100);
       sample.writeFileTryWithResource("test2.txt", 100);
    }

    private void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try{
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (int loop = 0; loop <= numberCount; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    private void writeFileTryWithResource(String fileName, int count) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (int loop = 0; loop <= count; loop++) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
