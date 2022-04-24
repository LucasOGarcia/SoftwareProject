/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author lucas
 */
public class CreateDatabase {
    
    public static void createDB(){
        new DataBase();
    }
}

//creates a local database file for the application
class DataBase {
    private String SQLiteUrl;
    private Driver SQLiteDriver;
    private Connection SQLiteConnection;
    
    public DataBase() {        
    SQLiteUrl = "jdbc:sqlite:coursework.db";

       try {
           SQLiteDriver = new org.sqlite.JDBC();
           DriverManager.registerDriver(SQLiteDriver);
           System.out.println("SQLite driver successfully downloaded.");
       }
       catch (Exception e) {
           System.out.println("SQLite driver download error: \n" + e.getMessage());
       }
       try {
           SQLiteConnection = DriverManager.getConnection(SQLiteUrl);
           System.out.println("SQLite connection successful.");
       }
       catch (Exception e) {
           System.out.println("SQLite connection error: \n" + e.getMessage());
       }
       try {
           if (!SQLiteConnection.isClosed()) {
               SQLiteConnection.close();
               System.out.println("SQLite connection closed.");
           }
       }
       catch (Exception e) {
           System.out.println("SQLite connection error: \n" + e.getMessage());
       }
    }
}
