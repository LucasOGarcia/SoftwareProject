/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ConnectDB {
    
    String hostName = "sql4.freesqldatabase.com";
    String databasePort = "3306";
    String databaseName = "sql4484735";
    String userName = "sql4484735";
    String password = "MKxsG3f8yK";
    
      public Connection getConnection() {
//        Connection con = null;
//        Properties connectionProps = new Properties();
//        connectionProps.put("userName", this.userName);
//        connectionProps.put("password", this.password);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://phpmyadmin.ecs.westminster.ac.uk:3306/w1783737_0?zeroDateTimeBehavior=convertToNull";
//            String url = "jdbc:mysql://sql4.freesqldatabase.com:3306/sql4483459?zeroDateTimeBehavior=convertToNull";

            String url = "jdbc:mysql://"+this.hostName+":"+this.databasePort+"/"+this.databaseName+"?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(url, userName, password);
//
//        conn = DriverManager.getConnection(
//                   "jdbc:" + this.dbms + "://" +
//                   this.serverName +
//                   ":" + this.portNumber + "/",
//                   connectionProps);

            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    
}
