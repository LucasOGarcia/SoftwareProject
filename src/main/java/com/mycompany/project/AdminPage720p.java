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
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class AdminPage720p extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage720p
     */
    public AdminPage720p() {
        initComponents();
        refreshDB();
        setPageIcon();

    }
    public ArrayList<ClientInfo> userList(){
        ArrayList<ClientInfo> usersList = new ArrayList<>();
            Connection con = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_email as 'Email', client_forename as 'Forename', client_surname as"
                    + " 'Surname', client_salt as 'Salt Code', client_encrypted_password as 'Password', client_last_login"
                    + " as 'Login Time', client_last_logout as 'Logout Time', client_account_type as 'Account Type' FROM client_Info"; //or prepared statement
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            ClientInfo clientinfo;
            while(rs.next()){
                String time_converted_login = "null";
                String time_converted_logout = "null";
                
                
             java.sql.Timestamp currSqlTS_login = rs.getTimestamp("Login time");
             if(currSqlTS_login != null){
                 java.util.Date currDate_login = new java.util.Date(currSqlTS_login.getTime());
                 time_converted_login = currDate_login.toString();}

             
             java.sql.Timestamp currSqlTS_logout = rs.getTimestamp("Logout time");
             if(currSqlTS_logout != null){
                 java.util.Date currDate_logout = new java.util.Date(currSqlTS_logout.getTime());
                 time_converted_logout = currDate_logout.toString();}
             
                clientinfo=new ClientInfo(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), time_converted_login, time_converted_logout, rs.getInt(8));
                usersList.add(clientinfo);
                //usersList.set(5, currDate.toString());
            }
            return usersList;

        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database,  Info", e);}
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
    
    
        public ArrayList<ClientInfo> searchList(){
        ArrayList<ClientInfo> resultList = new ArrayList<>();
         String input = searchText.getText().trim();
         Connection con = null;
         ResultSet rs = null;
         PreparedStatement pst = null;
         
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String search_query = "SELECT client_email as 'Email', client_forename as 'Forename', "
                    + "client_surname as 'Surname', client_salt as 'Salt Code', "
                    + "client_encrypted_password as 'Password', client_last_login as 'Login Time', "
                    + "client_last_logout as 'Logout Time', client_account_type as 'Account Type' "
                    + "FROM client_Info WHERE client_email LIKE ?";
             pst = con.prepareStatement(search_query);
            pst.setString(1, input + '%');
            rs = pst.executeQuery();
            ClientInfo clientinfo;
            while(rs.next()){
                String time_converted_login = "null";
                String time_converted_logout = "null";
                
                
             java.sql.Timestamp currSqlTS_login = rs.getTimestamp("Login time");
             if(currSqlTS_login != null){
                 java.util.Date currDate_login = new java.util.Date(currSqlTS_login.getTime());
                 time_converted_login = currDate_login.toString();}

             
             java.sql.Timestamp currSqlTS_logout = rs.getTimestamp("Logout time");
             if(currSqlTS_logout != null){
                 java.util.Date currDate_logout = new java.util.Date(currSqlTS_logout.getTime());
                 time_converted_logout = currDate_logout.toString();}

             
                clientinfo=new ClientInfo(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), time_converted_login, time_converted_logout, rs.getInt(8));
                resultList.add(clientinfo);
            }
            return resultList;

        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database,  Search", e);}
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
    
        public ArrayList<ClientStatisticsSpanish> lanList(){
        ArrayList<ClientStatisticsSpanish> spanishList = new ArrayList<>();
            Connection con = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = long_query()+ "Spanish"; //or prepared statement
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            ClientStatisticsSpanish clientstatsspanish;
            while(rs.next()){
                //rs.ge
                clientstatsspanish=new ClientStatisticsSpanish(rs.getString(1), rs.getInt(2),rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), 
                        rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getInt(17), rs.getInt(18), 
                        rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23), rs.getInt(24),rs.getString(25));
                spanishList.add(clientstatsspanish);
            }
            return spanishList;

        }catch (SQLException e) {
               throw new IllegalStateException("Can't connect to the database,  language table", e);}
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
    public void show_spanish(){
        ArrayList<ClientStatisticsSpanish> list2 = lanList();
        DefaultTableModel model = (DefaultTableModel)clientSpanishTable.getModel();  
        Object[] row = new Object[25];
        for(int i=0; i < list2.size(); i++){
        row[0]=list2.get(i).getemail();
        row[1]=list2.get(i).geta1();
        row[2]=list2.get(i).geta2();
        row[3]=list2.get(i).getb1();
        row[4]=list2.get(i).getb2();
        row[5]=list2.get(i).getpersona();
        row[6]=list2.get(i).getpersonb();
        row[7]=list2.get(i).getassist();
        row[8]=list2.get(i).getdirections();
        row[9]=list2.get(i).getemployment();
        row[10]=list2.get(i).getcultural();
        row[11]=list2.get(i).getinfo();
        row[12]=list2.get(i).getshopping();
        row[13]=list2.get(i).gethealth();
        row[14]=list2.get(i).gethousing();
        row[15]=list2.get(i).getintroductions();
        row[16]=list2.get(i).getappointments();
        row[17]=list2.get(i).getinvitations();
        row[18]=list2.get(i).gettravel();
        row[19]=list2.get(i).getfooddrink();
        row[20]=list2.get(i).getsocialise();
        row[21]=list2.get(i).getuniversity();
        row[22]=list2.get(i).getweather();
        row[23]=list2.get(i).getwork();
        row[24]=list2.get(i).getlastroleplay();
        model.addRow(row);    
        }       
}
    public void show_search(){ 
        ArrayList<ClientInfo> list = searchList();
        DefaultTableModel model = (DefaultTableModel)clientInfoTable.getModel();  
        Object[] row = new Object[8];
        for(int i=0; i < list.size(); i++){
        row[0]=list.get(i).getemail();
        row[1]=list.get(i).getfname();
        row[2]=list.get(i).getlname();
        row[3]=list.get(i).getsalt();
        row[4]=list.get(i).getpass();
        row[5]=list.get(i).getlogin();
        row[6]=list.get(i).getlogout();
        row[7]=list.get(i).getaccType();
        model.addRow(row);    
        }
    }
    
    public void show_user(){ 
        ArrayList<ClientInfo> list = userList();
        DefaultTableModel model = (DefaultTableModel)clientInfoTable.getModel();  
        Object[] row = new Object[8];
        for(int i=0; i < list.size(); i++){
        row[0]=list.get(i).getemail();
        row[1]=list.get(i).getfname();
        row[2]=list.get(i).getlname();
        row[3]=list.get(i).getsalt();
        row[4]=list.get(i).getpass();
        row[5]=list.get(i).getlogin();
        row[6]=list.get(i).getlogout();
        row[7]=list.get(i).getaccType();
        model.addRow(row);    
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        insertSubmit = new javax.swing.JButton();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accTypeInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        confirmInput = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        updateComboBox = new javax.swing.JComboBox<>();
        updateaccTypeInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updateFirstNameInput = new javax.swing.JTextField();
        updateLastNameInput = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        updateError = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updatePassInput = new javax.swing.JPasswordField();
        updateconfirmInput = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        clientInfoTab = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        clientInfoTable = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        clientSpanishTable = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        clientGreekTable = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        clientItalianTable = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        clientFrenchTable = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        clientGermanTable = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        clientPortugueseTable = new javax.swing.JTable();
        performanceButton = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64x.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ADMIN PAGE (720p)");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        searchButton.setText("Search Email");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Email");

        jLabel6.setText("Password");

        jLabel8.setText("Confirm Password");

        insertSubmit.setText("Finish");
        insertSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSubmitActionPerformed(evt);
            }
        });

        jLabel14.setText("Account Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirmInput))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lastNameInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(firstNameInput, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(passwordInput)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(insertSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(errorLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(accTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(accTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(insertSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(errorLabel)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insert", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        updateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Emails", "Email 1", "Email 2" }));

        jLabel9.setText("Account Type");

        jLabel10.setText("Password");

        jLabel11.setText("Last Name");

        jLabel12.setText("First Name");

        updateButton.setText("Make Changes");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirm Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateError)
                .addGap(126, 126, 126))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateaccTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePassInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(updateconfirmInput, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(updateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(62, 62, 62))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(45, 45, 45)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updateFirstNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(updateLastNameInput)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(updateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(updatePassInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(updateconfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateaccTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(160, 160, 160)
                .addComponent(updateError)
                .addGap(59, 59, 59))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(updateFirstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(updateLastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel10)
                    .addGap(153, 153, 153)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Update", jPanel3);

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        clientInfoTab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clientInfoTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientInfoTabMouseEntered(evt);
            }
        });

        clientInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "First Name", "Last Name", "Salt", "Password", "Login time", "Logout time", "Account Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientInfoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(clientInfoTable);

        clientInfoTab.addTab("client_info", jScrollPane3);

        clientSpanishTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientSpanishTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(clientSpanishTable);

        clientInfoTab.addTab("client_Statistics_Spanish", jScrollPane8);

        clientGreekTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientGreekTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(clientGreekTable);

        clientInfoTab.addTab("client_Statistics_Greek", jScrollPane9);

        clientItalianTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientItalianTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(clientItalianTable);

        clientInfoTab.addTab("client_Statistics_Italian", jScrollPane10);

        clientFrenchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientFrenchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(clientFrenchTable);

        clientInfoTab.addTab("client_Statistics_French", jScrollPane12);

        clientGermanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientGermanTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(clientGermanTable);

        clientInfoTab.addTab("client_Statistics_German", jScrollPane13);

        clientPortugueseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "A1 Completion", "A2 Completion", "B1 Completion", "B2 Completion", "Person A Completion", "Person B Completion", "Topic Directions Count", "Topic Employment Count", "Topic Cultural Experience", "Topic Personal Info", "Topic Shopping", "Topic Health", "Topic Housing", "Topic Introductions", "Topic Appointments", "Topic Invitations", "Topic Travel", "Topic Food & Drink", "Topic Social", "Topic University", "Topic Weather", "Topic Work", "Latest Roleplay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientPortugueseTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(clientPortugueseTable);

        clientInfoTab.addTab("client_Statistics_Portuguese", jScrollPane14);

        performanceButton.setText("Check User's Performance Stats");
        performanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(performanceButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(clientInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(backButton))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton))))
                        .addGap(18, 18, 18)
                        .addComponent(clientInfoTab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(performanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        backtoHome();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void performanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performanceButtonActionPerformed
        // TODO add your handling code here:
        gotoperformanceAdmin();
    }//GEN-LAST:event_performanceButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        
        //Search is only visible on client info tab
       DefaultTableModel info = (DefaultTableModel) clientInfoTable.getModel();
       info.setRowCount(0);
       show_search();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void clientInfoTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientInfoTabMouseEntered
        // TODO add your handling code here:
        searchButton.isVisible();
        searchText.isVisible();
    }//GEN-LAST:event_clientInfoTabMouseEntered

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateData();
        JOptionPane.showMessageDialog(null, "Updated Database");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Refreshed Database");
        refreshDB();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insertSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSubmitActionPerformed
        // TODO add your handling code here:
        
        insertData();
       JOptionPane.showMessageDialog(null, "Added to Database");
    }//GEN-LAST:event_insertSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage720p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage720p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage720p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage720p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage720p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accTypeInput;
    private javax.swing.JButton backButton;
    private javax.swing.JTable clientFrenchTable;
    private javax.swing.JTable clientGermanTable;
    private javax.swing.JTable clientGreekTable;
    private javax.swing.JTabbedPane clientInfoTab;
    private javax.swing.JTable clientInfoTable;
    private javax.swing.JTable clientItalianTable;
    private javax.swing.JTable clientPortugueseTable;
    private javax.swing.JTable clientSpanishTable;
    private javax.swing.JPasswordField confirmInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JButton insertSubmit;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton performanceButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> updateComboBox;
    private javax.swing.JLabel updateError;
    private javax.swing.JTextField updateFirstNameInput;
    private javax.swing.JTextField updateLastNameInput;
    private javax.swing.JPasswordField updatePassInput;
    private javax.swing.JTextField updateaccTypeInput;
    private javax.swing.JPasswordField updateconfirmInput;
    // End of variables declaration//GEN-END:variables

    private void setPageIcon(){
        // set window icon for the JFrame
        if (ApplicationInfo.getPageIconName() != null) {
            String imageName = ApplicationInfo.getPageIconName();
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            this.setIconImage(icon.getImage());
        }
    }
    
   
        
        
        
private void backtoHome(){
        ApplicationInfo.createadminHomePage(); 
        ApplicationInfo.getAdminPage1080p().dispose();
}


private String long_query(){
    String result = "SELECT client_email AS 'Email', client_statistics_language_roleplay_complete_a1 as "
            + "'A1 Completion', client_statistics_language_roleplay_complete_a2 AS 'A2 Completion', "
            + "client_statistics_language_roleplay_complete_b1 AS 'B1 Completion', client_statistics_language_roleplay_complete_b2"
            + " AS 'B2 Completion', client_statistics_language_roleplay_person_a AS 'Person A Count', client_statistics_language_roleplay_person_b"
            + " AS 'Person B Count', client_statistics_language_vocab_assist AS 'Assist Count', client_statistics_topic_directions AS 'Directions Topic'"
            + ",client_statistics_topic_employment AS 'Employment Topic', client_statistics_topic_cultural_experiences AS 'Cultural Exper. Topic',"
            + "client_statistics_topic_personal_info AS 'Personal Info Topic', client_statistics_topic_shopping AS 'Shopping Topic', client_statistics_topic_health"
            + " AS 'Health Topic', client_statistics_topic_housing AS 'Housing Topic', client_statistics_topic_introductions AS 'Introductions Topic', "
            + "client_statistics_topic_appointments AS 'Appointment Topic', client_statistics_topic_invitations AS 'Invitation Topic', client_statistics_topic_travel "
            + "AS 'Travel Topic', client_statistics_topic_food_drink AS 'Food/Drink Topic', client_statistics_topic_socialising AS 'Socialise Topic', "
            + "client_statistics_topic_university AS 'University Topic', client_statistics_topic_weather AS 'Weather Topic', client_statistics_topic_work AS 'Work Topic', "
            + "client_statistics_last_roleplay AS 'Latest Roleplay' FROM Client_Statistics_";  
    return result;
}

private void insertData(){ //Mimicks the Registration Page
    
    
    String first_name = firstNameInput.getText().toLowerCase().trim();
    String last_name = lastNameInput.getText().toLowerCase().trim();
    String email = emailInput.getText().toLowerCase().trim();
    String password = String.valueOf(passwordInput.getPassword());
    String confirm = String.valueOf(confirmInput.getPassword());
    Integer accType = Integer.parseInt(accTypeInput.getText());
    
    if(!checkIfFieldsAreEmpty(first_name, last_name, email, password, confirm, accType)){
        return;
        }
    
    if (!checkLength(first_name, last_name, email, password, accType)){
         return;
        }
    
    if(!checkIfValidPassword(password)){
            //exit function since password doesn't meet specs
            return;
        }
        
        // Confirm passwords match
        if (!checkIfPasswordsMatch(password, confirm)){
            //Exit since passwords don't match
            return;
        }
        
        // Verify email format
        if(!checkIfValidEmail(email)){
            //Exit since email isn't in the right format
            return;
        }
        
        // Check if email is already in the database
        if (checkIfEmailInDataBase(email)) {
            //Exit the function to avoid a registration error
            return;
        }
        
        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1);
        last_name = last_name.substring(0, 1).toUpperCase() + last_name.substring(1);
        
        // Create variables to generate a secure password
        String salt = null;
        String securePassword = null;
        
        // Generate a secure password
        salt = getSalt(salt);
        securePassword = getSecurePassword(password, salt);
        
        if (!addUsertoDB(email, first_name, last_name, salt, securePassword)){
        // error inputing data into Database
            return;
        }
        
        refreshDB();
       
}

private void updateData(){

    replaceFName();
    replaceLName();
    replacePass();
    replaceaccType();
    refreshDB();
}

private void replaceFName(){
        String first_name = updateFirstNameInput.getText().toLowerCase().trim();

        if(!first_name.isEmpty()){
            int maxFirstNameLength = 32;
            if (first_name.length() > maxFirstNameLength){
                  updateError.setText("<html>Error!<br/>; Name is too long <br/></html>");
                  updateError.setForeground(Color.blue);
            }
            String selected_text = updateComboBox.getItemAt(updateComboBox.getSelectedIndex());
            Connection con = null;
            ResultSet rs = null;
            PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "UPDATE client_Info SET client_forename=? WHERE client_email=?";
             pst = con.prepareStatement(query);
            pst.setString(1,first_name);
            pst.setString(2, selected_text);
            pst.executeUpdate();
            con.commit();
            }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, replace fname", e);}
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
}

private void replaceLName(){
            String last_name = updateLastNameInput.getText().toLowerCase().trim();
        if(!last_name.isEmpty()){
            int maxLastNameLength = 32;
            if (last_name.length() > maxLastNameLength){
                  updateError.setText("<html>Error!<br/>; Name is too long <br/></html>");
                  updateError.setForeground(Color.blue);
            }
            String selected_text = updateComboBox.getItemAt(updateComboBox.getSelectedIndex());
            Connection con = null; 
            PreparedStatement pst = null;
            ResultSet rs = null;
		
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "UPDATE client_Info SET client_surname=? WHERE client_email=?";
            pst = con.prepareStatement(query);
            pst.setString(1,last_name);
            pst.setString(2, selected_text);
            pst.executeUpdate();
            con.commit();
            }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, replace lname", e);}
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
}

private void replacePass(){
        String password = String.valueOf(updatePassInput.getPassword());
        String confirm = String.valueOf(updateconfirmInput.getPassword());
        
        if(!password.isEmpty() && !confirm.isEmpty()){
        int minPasswordLength = 8;
        int maxPasswordLength = 12;
           if (password.length() > maxPasswordLength || password.length() < minPasswordLength){
                  updateError.setText("<html>Error!<br/>;Pass is too long or too short<br/></html>");
                  updateError.setForeground(Color.blue);
           }else if (!checkIfPasswordsMatch(password, confirm)){
                updateError.setText("<html>Error!<br/>;Pass don't match<br/></html>");
                updateError.setForeground(Color.blue);
        }else if(!checkIfValidPassword(password)){
                updateError.setText("<html>Error!<br/>;Pass invalid<br/></html>");
                updateError.setForeground(Color.blue);
        }else if(!password.isEmpty() && confirm.isEmpty()){
                        //error please fill both to change passwords
            updateError.setText("<html>Error!<br/>Fill in both Passwords<br/></html>");
            updateError.setForeground(Color.blue);
            
        }else if(password.isEmpty() && !confirm.isEmpty()){
             updateError.setText("<html>Error!<br/>Fill in both Passwords<br/></html>");
            updateError.setForeground(Color.blue);
        }
        String salt = null;
        String securePassword = null;

        salt = getSalt(salt);
        securePassword = getSecurePassword(password, salt);   
         String selected_text = updateComboBox.getItemAt(updateComboBox.getSelectedIndex());
         Connection con = null;
         PreparedStatement pst = null;
         ResultSet rs = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "UPDATE client_Info SET client_encrypted_password=?, client_salt=? WHERE client_email=?";
             pst = con.prepareStatement(query);
            pst.setString(1,securePassword);
            pst.setString(2,salt); //Replaces the salt as well
            pst.setString(3, selected_text);
            pst.executeUpdate();
            con.commit();
            }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, replace salt and pass", e);}
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
}

private void replaceaccType(){
        String accType = updateaccTypeInput.getText();
        if(!accType.isEmpty()){
           if(!accType.equals(0) || !accType.equals(1) || !accType.equals(2)){
            updateError.setText("<html>Error!<br/>;Account Type is invalid<br/></html>");
            updateError.setForeground(Color.blue);
        }
         String selected_text = updateComboBox.getItemAt(updateComboBox.getSelectedIndex());
         Connection con = null;
         PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "UPDATE client_Info SET client_account_type=? WHERE client_email=?";
             pst = con.prepareStatement(query);
            pst.setString(1,accType);
            pst.setString(2, selected_text);
            pst.executeUpdate();
            con.commit();
            }catch(Exception e){
               throw new IllegalStateException("Can't connect to the database, acc Type", e);}
        	   finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (pst != null){
                    pst.close();
                }
            }
            catch (SQLException ex) {
            }
        }
        }
}

    private boolean checkIfFieldsAreEmpty(String first_name, String last_name, String email, String password, String confirm, Integer accType) {
        if (first_name.isEmpty() || last_name.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty() || accType.toString().isEmpty()) {
            String errorMessage = "<html>Error!<br/>";
            if (first_name.isEmpty()){
                errorMessage += "<html>First Name is Empty<br/>";
            }
            if (last_name.isEmpty()){
                errorMessage += "Last Name is Empty<br/>";
            }
            if (email.isEmpty()){
                errorMessage += "Email is Empty<br/>";
            }
            if (password.isEmpty()){
                errorMessage += "Password is Empty<br/>";
            }
            if (confirm.isEmpty()){
                errorMessage += "Confirm Password is Empty<br/>";
            }
            if (accType.toString().isEmpty()){
                errorMessage += "Account Type is Empty<br/>";
            }
            errorMessage += "</html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.blue);
            
            return false;
        }
        return true;
    }
    
        private boolean checkLength(String first_name, String last_name, String email, String password, Integer accType) {
        boolean result = true;
        String errorMessage = "<html>Error!<br/>";
        int maxFirstNameLength = 32;
        int maxSurnameNameLength = 32;
        int maxEmailLength = 254;
        int minPasswordLength = 8;
        int maxPasswordLength = 12;
        
        if (first_name.length() > maxFirstNameLength){
            errorMessage += "First name is too long <br/>";
            result = false;
        }
        if (last_name.length() > maxSurnameNameLength){
            errorMessage += "Last name is too long <br/>";
            result = false;
        }
        if (email.length() > maxEmailLength){
            errorMessage += "Email is too long <br/>";
            result = false;
        }
        if (password.length() > maxPasswordLength){
            errorMessage += "Password is too long <br/>";
            result = false;
        }
        else if (password.length() < minPasswordLength){
            errorMessage += "Password is too short <br/>";
            result = false;
        }
        if(accType < 0 || accType > 2){
            errorMessage += "Account Type Number is invalid<br/>";
            result = false;
        }
        
        errorMessage += "</html>";
        if (!result){
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.blue);
        }
        return result;
    }
        
        private boolean checkIfValidPassword(String password) {
        boolean result = true;
        String errorMessage = "<html>Error!<br/>";
        
        Pattern lowerLetters = Pattern.compile("[a-z]");
        Pattern upperLetters = Pattern.compile("[A-Z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern specialChars = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher hasLowerLetter = lowerLetters.matcher(password);
        Matcher hasUpperLetter = upperLetters.matcher(password);
        Matcher hasDigit = digits.matcher(password);
        Matcher hasSpecial = specialChars.matcher(password);
        if(!hasLowerLetter.find()){
           errorMessage += "The password must contain at least one lower case char <br/>";
           result = false;
        }
        if(!hasUpperLetter.find()){
           errorMessage += "The password must contain at least one upper case char <br/>";
           result = false;
        }
        if(!hasDigit.find()){
            errorMessage += "The  password must contain a number <br/>";
            result = false;
        }
        if(!hasSpecial.find()){
            errorMessage += "The password must contain a special char <br/>";
            result = false;
        }
        errorMessage += "</html>";
        if (!result){
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.blue);
        }
        return result;
    }
    
    private boolean checkIfPasswordsMatch(String password, String confirm) {
        if(!password.equals(confirm)){
            System.out.println("password match error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Passwords don't match </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.blue);
            return false;
        }
        return true;
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
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.blue);
        }
        return result;
    }
    
    private String getSalt(String salt) {
        // generate salt
        int saltLength = 254;
        salt = PasswordManager.generateSalt(saltLength);
        return salt;
    }
    
    private String getSecurePassword(String password, String salt) {
        //add encyption to password+salt
        String result = PasswordManager.generateSecurePassword(password, salt);
        return result;
    }
    
    private boolean checkIfEmailInDataBase(String email) {
        boolean result = JdbcCrud.checkIfEmailExists(email);
        if (result){
            System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email already in use </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }
    
    private boolean addUsertoDB(String email, String first_name, String last_name, String salt, String password) {
        List<String> languages = new ArrayList();
        String spanish = "Spanish";
        String french = "French";
        String portuguese = "Portuguese";
        String german = "German";
        String italian = "Italian";
        String greek = "Greek";
        languages.add(spanish);
        languages.add(french);
        languages.add(portuguese);
        languages.add(german);
        languages.add(italian);
        languages.add(greek);
        
        try {
            Integer accType = Integer.parseInt(accTypeInput.getText());
            insertInfo(email, first_name, last_name, salt, password, accType);
            for (int i = 0; i < languages.size(); i++) {
                JdbcCrud.registerUserClienStatistics(email, languages.get(i));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void insertInfo(String email, String first_name, String last_name, String salt, String password, Integer accType) throws Exception{
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "INSERT INTO client_Info("
        + " client_email,"
        + " client_forename,"
        + " client_surname,"
        + " client_salt,"
        + " client_encrypted_password,"
        + " client_last_login,"
        + " client_last_logout,"
        + " client_account_type)"
        + " VALUES (?,?,?,?,?,?,?,?)";
        try{
            con = ConnectDB.getConnection();
            int accountType = accType; //0 regular user //1 admin //2 teacher
            System.out.println("Registering user into client_Info...");
            
            
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            psmt.setString(2, first_name);
            psmt.setString(3, last_name);
            psmt.setString(4, salt);
            psmt.setString(5, password);
            psmt.setNull(6, Types.NULL);
            psmt.setNull(7, Types.NULL);
            psmt.setInt(8, accountType);
            
            psmt.executeUpdate();
            con.commit();
            
            System.out.println("Registering user into client_Info completed!");
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            System.out.println(ex);
            throw new Exception();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (psmt != null){
                    psmt.close();
                }
            }
            catch (SQLException ex) {
                throw new Exception();
            }
        }
    }       
        
        private void refreshDB(){
        DefaultTableModel info = (DefaultTableModel) clientInfoTable.getModel();
        info.setRowCount(0);
        DefaultTableModel spanish = (DefaultTableModel) clientSpanishTable.getModel();
        spanish.setRowCount(0);
        show_user();
        show_spanish();
        emailBox();
    }
        
       private void gotoperformanceAdmin(){
       ApplicationInfo.createperformanceAdminPage(); 
       ApplicationInfo.getAdminPage720p().dispose();  
    }
        
    
        private void emailBox(){
            updateComboBox.removeAllItems();
        Connection con = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "SELECT client_email FROM client_Info";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                String abs = rs.getString(1);
                 updateComboBox.addItem(abs);
            }
            con.close();
            pst.close();
            rs.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
}
