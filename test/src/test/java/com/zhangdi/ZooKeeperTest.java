package com.zhangdi;

/**
 * Created by hzzhandi3 on 2016/12/5.
 */
public class ZooKeeperTest {

    /*private static String connectionString = "127.0.0.1:2181,127.0.0.1:3181,127.0.0.1:4181";

    private static ExponentialBackoffRetry retryPolicy = new ExponentialBackoffRetry(1000, 3);


    @Test
    public void testZK() throws Exception {
        CuratorFramework clientSimple = CuratorFrameworkFactory.newClient(connectionString, retryPolicy);

        CuratorFramework client = CuratorFrameworkFactory.builder()
                .connectString(connectionString)
                .retryPolicy(retryPolicy)
                .connectionTimeoutMs(20000)
                .sessionTimeoutMs(20000)
                .build();

        client.start();

        //client.create().forPath("/test","demo".getBytes());
        String s = new String(client.getData().forPath("/test"));
        int a = 10;
    }*/


}
