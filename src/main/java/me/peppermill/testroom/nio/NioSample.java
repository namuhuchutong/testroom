package me.peppermill.testroom.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

    public static void main(String[] args) {

        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = "test.txt";

        try {
            writeFile(fileName, "My NIO sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFile(String fileName) throws IOException {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.println((char)buffer.get());
        }

        channel.close();
    }

    private void writeFile(String fileName, String data) throws IOException {
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData);
        channel.write(buffer);
        channel.close();
    }
}
