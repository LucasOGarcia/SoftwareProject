/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseworkProject;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alwin
 */
public class connectDB {
    
      public static Connection getConnection() {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
//           Host: sql4.freesqldatabase.com
//           Database name: sql4483459
//           Database user: sql4483459
//           Database password: hkycry1n2M
//           Port number: 3306
//           http://www.phpmyadmin.co use this link to access the DB using the details above. If under Services Connection does not Exist,
//           setup a new connection using a MySQL connector and adding "mysql-connector-java-8.0.27.jar" onto it. Then fill in the details above

            String url = "jdbc:mysql://sql4.freesqldatabase.com:3306/sql4483459?zeroDateTimeBehavior=convertToNull";
            String user = "sql4483459";
            String pw =  "hkycry1n2M"  ;   
            Connection con = DriverManager.getConnection(url,user,pw);

            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    
}
