package com.zhangdi.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * User: hzzhandi3
 * Date: 2017-01-17 22:37
 */
@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    @RequestMapping("/ds")
    @ResponseBody
    public void testJdbc(){
        try {
            Context context = new InitialContext();
            DataSource dataSource = (DataSource)context.lookup("java:comp/env/jndi/jdbc");
            /*Future<Connection> future = dataSource.getConnectionAsync();
            while (!future.isDone()) {
                System.out.println("Connection is not yet available. Do some background work");
                try {
                    Thread.sleep(100); //simulate work
                }catch (InterruptedException x) {
                    Thread.currentThread().interrupted();
                }
            }
            */

            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            int a=10;






        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
