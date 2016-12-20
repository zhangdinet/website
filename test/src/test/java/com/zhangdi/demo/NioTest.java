package com.zhangdi.demo;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by hzzhandi3 on 2016/12/16.
 */
public class NioTest {

    public static void main(String[] args) {

        LongBuffer longBuffer = LongBuffer.allocate(30);
        int a=10;
    }

    public static void read(){
        try {
            RandomAccessFile file = new RandomAccessFile("D:/demo.txt","rw");
            FileChannel inChannel = file.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(48);
            int bytes = inChannel.read(buf);
            while (bytes!=-1){
                System.out.println("Read "+bytes);
                buf.flip();
                while (buf.hasRemaining()){
                    System.out.print((char) buf.get());
                }
                buf.clear();
                bytes = inChannel.read(buf);
            }

        } catch (Exception e) {

        }
    }
}
