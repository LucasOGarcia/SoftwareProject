/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage2
     */
    public LoginPage() {
        initComponents();
        initialise();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        errorLabels = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(363, 655));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo128x.png"))); // NOI18N

        emailLabel1.setText("Email:");

        passLabel.setText("Password:");

        registerButton.setText("Register");
        registerButton.setMaximumSize(new java.awt.Dimension(105, 40));
        registerButton.setMinimumSize(new java.awt.Dimension(105, 40));
        registerButton.setPreferredSize(new java.awt.Dimension(105, 40));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.setMaximumSize(new java.awt.Dimension(105, 40));
        loginButton.setMinimumSize(new java.awt.Dimension(105, 40));
        loginButton.setPreferredSize(new java.awt.Dimension(105, 40));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Don't have an account? Click below to register");

        errorLabels.setMaximumSize(new java.awt.Dimension(244, 129));
        errorLabels.setMinimumSize(new java.awt.Dimension(244, 129));
        errorLabels.setPreferredSize(new java.awt.Dimension(244, 129));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordInput)
                                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel1)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passLabel)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(errorLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginUser();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        startregisterPage();
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel errorLabels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables

   private void loginUser() {
            errorLabels.setText("");

            String email = emailInput.getText().toLowerCase().trim();
            String input_password = passwordInput.getText().trim();

            if(!checkIfValidEmail(email)){
                return;
            } 
            
            
            if(!checkIfEmailInDataBase(email)){
                return;
            }
            getPassDB();
            getSaltDB();
            
            if (!verifyPassword(input_password, getPassDB(), getSaltDB())){//if verify password is false
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email or Password invalid </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
            }
            
            
            else{
 
            double width = ApplicationInfo.detectScreenWidth();
            double height = ApplicationInfo.detectScreenHeight();
 
            System.out.print(accountTypeCheck());
            User user = new User(email, getFirstNameDB(), getLastNameDB(), accountTypeCheck(), width, height);
            ApplicationInfo.setUser(user);

            userLoginTimestamp();

            System.out.println("width is: " + width + " and height is: "+height);
            if(accountTypeCheck() == 1){
                    //admin home
                    adminLogin();
            }else{
                //normal home
                System.out.println(user.userFirstName);
                normalLogin();
            }
            
            }
    
    } 
            

        private boolean checkIfValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  // local part
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        boolean result = emailPattern.matcher(email).matches();
        
        if(!result){
            System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Enter a valid email</html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
        }
        return result;
    }    
      


    private boolean checkIfEmailInDataBase(String email) {
        boolean result = JdbcCrud.checkIfEmailExists(email);
        if (!result){
            System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email or Password invalid </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
        }
        return result;
    }

        public Integer accountTypeCheck(){
        String email = emailInput.getText().toLowerCase().trim();
        Connection con = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_account_type FROM client_Info WHERE client_email=?"; //or prepared statement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            Integer accType = rs.getInt(1);
            return accType;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, account type", e);}
        finally {
            try {
                if (con != null) {
                    con.close();
                }
            }
            catch (SQLException ex) {;
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            }
        }             
    }   
        
    public String getFirstNameDB(){
        String email = emailInput.getText().toLowerCase().trim();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_forename FROM client_Info WHERE client_email=?"; //or prepared statement
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();
            String fname = rs.getString(1);
            return fname;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, surname", e);}        
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (rs != null){
                    rs.close();
                }
                if (pst != null){
                    pst.close();
                }
            }
            catch (SQLException ex) {
            }
        }     
    }
    
    public String getLastNameDB(){
                String email = emailInput.getText().toLowerCase().trim();
                Connection con = null;
                ResultSet rs = null;
                PreparedStatement pst = null;       
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_surname FROM client_Info WHERE client_email=?"; //or prepared statement
             pst = con.prepareStatement(query);
            pst.setString(1, email);
            rs = pst.executeQuery();
            String sname = rs.getString(1);
            return sname;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, surname", e);}
                finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (rs != null){
                    rs.close();
                }
                if (pst != null){
                    pst.close();
                }
            }
            catch (SQLException ex) {
            }
        }
    }
    
     public String getPassDB(){
        String email = emailInput.getText().toLowerCase().trim();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String pw_query = "SELECT client_encrypted_password FROM client_Info WHERE client_email=?"; //or prepared statement
             pst = con.prepareStatement(pw_query);
            pst.setString(1, email);
             rs = pst.executeQuery();
            String password_2 = rs.getString(1);
            System.out.println(password_2);
            return password_2;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, password", e);}
         finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (rs != null){
                    rs.close();
                }
                if (pst != null){
                    pst.close();
                }
            }
            catch (SQLException ex) {
            }
        }
    }
     
     public String getSaltDB(){
         String email = emailInput.getText().toLowerCase().trim();
         Connection con = null; 
         PreparedStatement pst = null;
         ResultSet rs = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String salt_query = "SELECT client_salt FROM client_Info WHERE client_email=?";
             pst = con.prepareStatement(salt_query);
            pst.setString(1, email);
             rs = pst.executeQuery();
            String salt_2 = rs.getString(1);
            return salt_2;
         }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, salt", e);}
                        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (rs != null){
                    rs.close();
                }
                if (pst != null){
                    pst.close();
                }
            }
            catch (SQLException ex) {
            }
        }
         }
     
    public static boolean verifyPassword(String input_password,  String pw_query, String salt_query){ //find place to put input_password
        boolean result = false;
        String newSecurePassword = PasswordManager.generateSecurePassword(input_password, salt_query);
        result = newSecurePassword.equalsIgnoreCase(pw_query);
        return result;
    }
    
        private void userLoginTimestamp() {
        try {
            JdbcCrud.updateClientLoginTimestamp();
        } catch (Exception ex) {
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "<html>Error!<br/> Unable to connect to the server, try again later... </html>";
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void startregisterPage(){
        //code to go to register page
        ApplicationInfo.createRegistrationPage();
        ApplicationInfo.getLoginPage().dispose();
    }
    
    private void normalLogin(){
        //code to go to homepage
        ApplicationInfo.createHomePage();
        ApplicationInfo.getLoginPage().dispose();
    }
    
    private void adminLogin(){
       ApplicationInfo.createadminHomePage(); 
       ApplicationInfo.getLoginPage().dispose();
    }
    
    private void initialise() {
        // set window icon for the JFrame
        if (ApplicationInfo.getPageIconName() != null) {
            String imageName = ApplicationInfo.getPageIconName();
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            this.setIconImage(icon.getImage());
        }
    }
}
