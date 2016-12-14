package com.zhangdi.demo;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * Created by hzzhandi3 on 2016/12/14.
 */
public class InetAddressTest {

    public static void main(String[] args){

        try{
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
            while (interfaceList.hasMoreElements()){
                NetworkInterface networkInterface = interfaceList.nextElement();
                Enumeration<InetAddress> addressList = networkInterface.getInetAddresses();
                while (addressList.hasMoreElements()){
                    InetAddress address = addressList.nextElement();
                    System.out.println(address.getHostAddress());
                }
            }
        }catch (Exception e){

        }


    }


}
