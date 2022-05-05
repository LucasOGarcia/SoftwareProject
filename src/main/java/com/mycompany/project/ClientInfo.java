/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Gabriel
 */
public class ClientInfo {
    private String client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_last_login, client_last_logout;
    private int client_account_type;
    
    public ClientInfo(String client_email, String client_forename,String client_surname, String client_salt, String client_encrypted_password,
            String client_last_login, String client_last_logout, int client_account_type){
        
        this.client_email = client_email;
        this.client_forename = client_forename;
        this.client_surname = client_surname;
        this.client_salt = client_salt;
        this.client_encrypted_password = client_encrypted_password;
        this.client_last_login = client_last_login;
        this.client_last_logout = client_last_logout;
        this.client_account_type = client_account_type;       
    }
    
    public String getemail(){
        return client_email;
    }
    public String getfname(){
        return client_forename;
    }
    public String getlname(){
        return client_surname;
    }
    public String getsalt(){
        return client_salt;
    }
    public String getpass(){
        return client_encrypted_password;
    }
    public String getlogin(){
        return client_last_login;
    }
    public String getlogout(){
        return client_last_logout;
    }
    public int getaccType(){
        return client_account_type;
    }
}
