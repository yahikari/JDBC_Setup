package com.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", "Kathmandu123@$");
            con.close();
        }
            catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
            }
        }

    }

