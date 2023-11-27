package library;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migyu
 */
import java.sql.*;
import java.io.*;

public class DB_MAN extends javax.swing.JFrame {
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "jdbc:mysql://localhost:3306/JavaBook?characterEncoding=UTF-8&serverTimezone=UTC";
    String strUser = "root";
    String strPWD = "0000";

    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;

    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
            } catch(Exception e) {
                System.out.println("SQLException : " + e.getMessage());
            }
    }

    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch(SQLException e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
}