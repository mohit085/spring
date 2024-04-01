package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

// here  we making seprate connection class because if we want to more than  one class to execute query we doesn't have to
// make connection again just we call this method

public class BookDb {
    // add methods to open and close connection
    static Connection connection;

    public static Connection openConnection(){
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username="root";
        String password="root";
        try{
            connection = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
