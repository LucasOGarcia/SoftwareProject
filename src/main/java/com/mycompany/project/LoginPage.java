/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import static com.mycompany.project.PasswordManager.generateSecurePassword;
//import static com.mycompany.project.User.User;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Gabriel
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        //setMinimumSize(new Dimension(374, 667));
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        emailLabel1 = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        errorLabels = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo128x.png"))); // NOI18N

        emailLabel1.setText("Email:");

        passLabel.setText("Password:");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Don't have an account? Click below to register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(errorLabels)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordInput)
                                .addComponent(emailInput, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel1))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel))
                .addGap(41, 41, 41)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(errorLabels)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputActionPerformed

    
        @SuppressWarnings("empty-statement")
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
                // TODO add your handling code here: 

                loginUser();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        startregisterPage();
    }//GEN-LAST:event_registerButtonActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
//PROBLEMS
        //connecting to user class
            //Telling that the user is admin or not
            
    
    
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
            //getEmailDB();
            getPassDB();
            getSaltDB();
            
            if (!verifyPassword(input_password, getPassDB(), getSaltDB())){//if verify password is false
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email or Password <-- is invalid </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
            }
            
            
            else{
 
            System.out.print(accountTypeCheck());
            User user = new User();
            user.userEmail = email;
            user.userFirstName = getFirstNameDB();
            user.userLastname = getLastNameDB();
            user.accountType = accountTypeCheck();
            
            
            userLoginTimestamp();
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
            errorMessage += "Email is invalid </html>";
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
            errorMessage += "Email does not exist </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
        }
        return result;
    }
    
    /*
    private String getEmailDB() {
         String email = emailInput.getText().toLowerCase().trim();
         
         
         
        boolean valid = checkIfValidEmail(email);
        boolean exists = JdbcCrud.checkIfEmailExists(email);
        if (!valid){ //!exists is false
           System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Please eneter a valid email </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
        }
        else if (!exists){
                       System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email or Password is incorrect </html>";
            errorLabels.setText(errorMessage);
            errorLabels.setForeground(Color.red);
        }
        return email;
    }
    */
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
            con.close();
            return accType;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, account type", e);}       
            
            
            
            
            
    }
        
        
    public String getFirstNameDB(){
        String email = emailInput.getText().toLowerCase().trim();
        Connection con = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_forename FROM client_Info WHERE client_email=?"; //or prepared statement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            String fname = rs.getString(1);
            con.close();
            return fname;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, surname", e);}     
    }
        
    
    
    public String getLastNameDB(){
                String email = emailInput.getText().toLowerCase().trim();
                Connection con = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_surname FROM client_Info WHERE client_email=?"; //or prepared statement
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            String sname = rs.getString(1);
            con.close();
            return sname;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, surname", e);}     
    }
    
     public String getPassDB(){
        String email = emailInput.getText().toLowerCase().trim();
        Connection con = null;
        //PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String pw_query = "SELECT client_encrypted_password FROM client_Info WHERE client_email=?"; //or prepared statement
            PreparedStatement pst = con.prepareStatement(pw_query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            String password_2 = rs.getString(1);
            con.close();
            System.out.println(password_2);
            return password_2;
        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database, password", e);}  
    }
     
     public String getSaltDB(){
         String email = emailInput.getText().toLowerCase().trim();
         Connection con = null; 
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String salt_query = "SELECT client_salt FROM client_Info WHERE client_email=?";
            PreparedStatement pst = con.prepareStatement(salt_query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            String salt_2 = rs.getString(1);
            con.close();
            return salt_2;
         }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, salt", e);}  
         }
     
    public static boolean verifyPassword(String input_password,  String pw_query, String salt_query){ //find place to put input_password
        boolean result = false;
        String newSecurePassword = generateSecurePassword(input_password, salt_query);
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
     
     
     /*
     public static boolean verifyPassword(String input_password, String securePassword, String salt){
        boolean result = false;
        String newSecurePassword = generateSecurePassword(passwordInput, salt);
        result = newSecurePassword.equalsIgnoreCase(securePassword);
        return result;
    }
*/ 
     
 
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
    
    private void adminLogin(){ //temporary - puts admin into performance page
       ApplicationInfo.createPerformancePage(); 
       ApplicationInfo.getLoginPage().dispose();
    }
    
    
    
    //get client_salt from database
    //get client_password from database
    
    
    //verify code is input_password client_password and client_salt
    //createuserobject
    //logintimestamp
}
