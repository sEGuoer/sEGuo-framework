package com.sEGuo.druid.method;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sEGuo.Config.Configuration1;
import com.sEGuo.druid.Config.DruidConfig;
import com.sEGuo.druid.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Component
public class DruidDemo {


    private static DataSource  dataSource;



    public List<User> testPreparedStatement() {
        String query = "select id, email, password, username, account from user";
        try (PreparedStatement ppstmt = dataSource.getConnection().prepareStatement(query);) {
            List<User> list = new ArrayList<>();
            ResultSet rs = ppstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String username = rs.getString("username");
                String account = rs.getString("account");
                User user = new User(username, email, password, account);
                list.add(user);
                System.out.println(id + "\t" + email + "\t" + password + "\t" + username + account);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(DruidConfig.class);
        DruidConfig druidConfig= (DruidConfig)ac.getBean("DruidConfig");
        dataSource = druidConfig.dataSource();
        DruidDemo druidDemo = new DruidDemo();
        druidDemo.testPreparedStatement();
    }
}
