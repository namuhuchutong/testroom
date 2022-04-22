package me.peppermill.testroom.nio;

import java.nio.IntBuffer;
import java.util.LinkedHashMap;

public class NioDetailSample {

    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        sample.checkBuffer();
    }
    private void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int i = 0; i < 100; i++) {
                buffer.put(i);
            }

            System.out.println(buffer.capacity());
            System.out.println(buffer.limit());
            System.out.println(buffer.position());
            buffer.flip();
            System.out.println("---------------");
            System.out.println(buffer.limit());
            System.out.println(buffer.position());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
