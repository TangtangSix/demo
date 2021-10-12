package com.example.demo;

import com.example.demo.bean.DataBaseLink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
//        Connection conn=DataBaseLink.getConn();
//        if(conn!=null){
//            String sql="select name from account";
//            try {
//                PreparedStatement pst = conn.prepareStatement(sql);
//                ResultSet results = pst.executeQuery();
//                while (results.next()){
//                    System.out.println(results.getString("name"));
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }

}
