package com.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", "Kathmandu123@$");
            Statement st = con.createStatement();

            Scanner src = new Scanner(System.in);
            String choice;
            do{
            System.out.println("Enter Employee ID: ");
            int eId = src.nextInt();

            src.nextLine();
            System.out.println("Enter user Name: ");
            String eName = src.nextLine();

            System.out.println("Enter Employee salary: ");
            float eSalary = src.nextFloat();


            int result = st.executeUpdate("insert into employee values (" + eId + ",'" + eName + "'," + eSalary + ")");
            if (result > 0) {
                System.out.println("Record inserted");
            }

            System.out.println("Do u want to insert one more record (Y/N)");
            choice = src.next();
        }
        while(choice.equalsIgnoreCase("y"));
            con.close();

        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
