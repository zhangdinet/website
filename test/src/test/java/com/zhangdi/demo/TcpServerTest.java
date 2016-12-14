package com.zhangdi.demo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by hzzhandi3 on 2016/12/14.
 */
public class TcpServerTest {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7999);
            byte[] buf = new byte[32];
            int receive;
            while (true) {
                Socket socket = serverSocket.accept();
                SocketAddress address = socket.getRemoteSocketAddress();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                while ((receive = inputStream.read(buf)) != -1) {
                    outputStream.write(buf, 0, receive);
                }
                socket.close();
            }

        } catch (Exception e) {
            int a = 10;
        }
    }
}
