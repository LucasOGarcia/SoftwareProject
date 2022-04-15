/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseworkProject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Alwin
 */
public class connectDB {
    
      public static Connection getConnection() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://phpmyadmin.ecs.westminster.ac.uk:3306/w1783737_0?zeroDateTimeBehavior=convertToNull";
            String url = "jdbc:mysql://sql4.freesqldatabase.com:3306/sql4483459?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(url);

            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    
}
