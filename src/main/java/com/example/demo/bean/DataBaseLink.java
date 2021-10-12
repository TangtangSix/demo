package com.example.demo.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseLink {
    static public Connection getConn() {
//	String serverName="com.mysql.jdbc.Driver";
//	String dbURL="jdbc:mysql://rm-2vc1c41ri34wjh84sso.mysql.cn-chengdu.rds.aliyuncs.com:3306/bridge_db";
//	String userName="user";
//	String userPwd="User_123456";
        String serverName="com.mysql.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/studentAdmin";
        String userName="root";
        String userPwd="123456";
        try {
            Class.forName(serverName);
            Connection tmp = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("成功连接数据库");
            return tmp;
        }
        catch(Exception e) {
            System.out.println("连接数据库失败");
            System.out.println(e);
        }
        return null;
    }
}
