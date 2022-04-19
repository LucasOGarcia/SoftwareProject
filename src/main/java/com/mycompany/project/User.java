package com.mycompany.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class User { //user object to retain information throughout different pages in the application
    protected String userEmail;
    protected String userFirstName;
    protected String userLastname;
    protected Integer accountType;
    
//    public User(){
//        this.userEmail = null;
//        this.userFirstName = null;
//        this.userLastname = null;
//        this.userType = null;
//    }
    
    public User(String email, String firstName, String lastName, Integer accountType){
        this.userEmail = email;
        this.userFirstName = firstName;
        this.userLastname = lastName;
        this.accountType = accountType;
    }
    
    public User(){
    }
    
    public void resetUser(){ //when user is logged out of the application
        this.userEmail = null;
        this.userFirstName = null;
        this.userLastname = null;
        this.accountType = null;
    }
}
