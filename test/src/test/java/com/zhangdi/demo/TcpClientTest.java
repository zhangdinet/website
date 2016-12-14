package com.zhangdi.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by hzzhandi3 on 2016/12/14.
 */
public class TcpClientTest {

    public static void main(String[] args) {

        String server = args[0];
        byte[] data = args[1].getBytes();
        int port = Integer.parseInt(args[2]);

        try {
            Socket socket = new Socket(server, port);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.write(data);
            int total = 0;
            int receive = 0;
            while (total < data.length) {
                if ((receive = in.read(data, total, data.length - total)) == -1) {
                    throw new SocketException("closed");
                }
                total += receive;
            }
            System.out.println(new String(data));
        } catch (Exception e) {
            int a = 10;
        }

    }

}
