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
        
    static String url = "jdbc:sqlite:"+ApplicationInfo.getDatabaseName();
    
      public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(url);
            con.setAutoCommit(false);
//            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (SQLException  | ClassNotFoundException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
      

