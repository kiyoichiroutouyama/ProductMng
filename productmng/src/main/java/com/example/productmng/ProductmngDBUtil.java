package com.example.productmng;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductmngDBUtil {
    public static Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/productmng", "testuser", "test");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
