package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import com.model.User;
import com.util.DBConnection;

/**
 *
 * @author 
 */
public class UserDao {

    
    public void addUser (User user) throws ClassNotFoundException, SQLException{
        
        PreparedStatement myPS = DBConnection.getConnection()
                .prepareStatement("INSERT INTO users (userid, firstname, lastname) VALUES (?, ?, ?)");
        
        myPS.setString(1, user.getUserid());
        myPS.setString(2, user.getFirstname());
        myPS.setString(3, user.getLastname());
        
        myPS.executeUpdate();
        
    }    

    public void deleteUser (String userid) throws ClassNotFoundException, SQLException{
        
        PreparedStatement myPS = DBConnection.getConnection()
                .prepareStatement("DELETE FROM user WHERE userid=?");
        
        myPS.setString(1, userid);
     
        myPS.executeUpdate();
        
    }
public void updateUser (User user) throws ClassNotFoundException, SQLException{

        PreparedStatement myPS = DBConnection.getConnection()
                .prepareStatement("UPDATE user SET firstname=?, lastname=?"
                        + "WHERE userid=?");
        
        myPS.setString(3, user.getUserid());
        myPS.setString(1, user.getFirstname());
        myPS.setString(2, user.getLastname());
        
        myPS.executeUpdate();
        
    }
    
    public List<User> getAllUsers() throws ClassNotFoundException, SQLException{
        
        List<User> users = new ArrayList<>();
        
        Statement statement = DBConnection.getConnection().createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM user");
        
        while (rs.next()){
            User user = new User();
            user.setUserid(rs.getString("userid"));
            user.setFirstname(rs.getString("firstname"));
            user.setLastname(rs.getString("lastname"));
            users.add(user);
        }
        
        return users;
    }
    
    public User getUserbyId(String userid) throws ClassNotFoundException, SQLException{
        
        User user = new User();
        
        PreparedStatement myPS = DBConnection.getConnection()
                .prepareStatement("SELECT * FROM user WHERE userid=?");
        
        myPS.setString(1, userid);
        ResultSet rs = myPS.executeQuery();
        
        while (rs.next()){
            user.setUserid(rs.getString("userid"));
            user.setFirstname(rs.getString("firstname"));
            user.setLastname(rs.getString("lastname"));
        }
        
        return user;
    }
    
}
