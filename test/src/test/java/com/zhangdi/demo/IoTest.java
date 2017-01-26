package com.zhangdi.demo;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

/**
 * Created by hzzhandi3 on 2017/1/9.
 */
public class IoTest {
    public static void main(String[] args) {
        try {
            Selector[] selectors = new Selector[65535];
            for(int i=0;i<65535;i++){
                selectors[i] = Selector.open();
            }
            Thread.sleep(100000000000000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testChannel() {
        try {
            RandomAccessFile file = new RandomAccessFile("F:/demo.txt", "rw");
            FileChannel fileChannel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(20000);
            for (int count = fileChannel.read(buffer); count != -1; count = fileChannel.read(buffer)) {
                System.out.println("Read: " + count);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                System.out.println();

                buffer.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
