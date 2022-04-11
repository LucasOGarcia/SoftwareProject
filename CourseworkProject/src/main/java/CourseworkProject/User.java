package CourseworkProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class User {
    protected String userEmail;
    protected String userFirstName;
    protected String userLastname;
    protected Integer userType;
    
    public User(){
        this.userEmail = null;
        this.userFirstName = null;
        this.userLastname = null;
        this.userType = null;
        
    }
    
    public User(String email, String firstName, String lastName, Integer accountType){
        this.userEmail = email;
        this.userFirstName = firstName;
        this.userLastname = lastName;
        this.userType = accountType;
    }
    
}
