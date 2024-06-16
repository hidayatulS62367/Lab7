package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class DBConnection implements java.io.Serializable {
    
    private static Connection myConnection = null;
    private static String myURL = "jdbc:mysql://localhost:3306/lab7";

    public DBConnection() {
    }
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
        if (myConnection != null){
            return myConnection;
        } else {
            Class.forName("com.mysql.jdbc.Driver");
            myConnection = DriverManager.getConnection(myURL, "root", "admin");

            return myConnection;
        }
        
    }
    
    public void closeConnection() throws ClassNotFoundException, SQLException{
            myConnection.close();
    }
    
}
