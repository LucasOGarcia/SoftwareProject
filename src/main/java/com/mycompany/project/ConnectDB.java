/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class ConnectDB {
        
    static String url = "jdbc:sqlite:coursework.db";
    
      public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(url);
            con.setAutoCommit(false);
            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (SQLException  | ClassNotFoundException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
//    String hostName = "sql4.freesqldatabase.com";
//    String databasePort = "3306";
//    String databaseName = "sql4484735";
//    String userName = "sql4484735";
//    String password = "MKxsG3f8yK";
    
//      public Connection getConnection() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            String url = "jdbc:mysql://"+this.hostName+":"+this.databasePort+"/"+this.databaseName+"?zeroDateTimeBehavior=convertToNull";
//            Connection con = DriverManager.getConnection(url, userName, password);
//            JOptionPane.showMessageDialog(null, "Connection Established");
//            return con;
//        } catch (Exception e) {
//            System.out.println(e);
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//    }
      

