/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionManager;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class HeadOfficeDAO {
    
    //initiate table name
    private static final String TBLNAME = "user";
    
    public static List<User> retrieveUsers() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "";
        List<User> results = new ArrayList<>();

        try {
            conn = ConnectionManager.getConnection();
            
            sql = "SELECT userId, userName, password FROM " + TBLNAME;
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                //Retrieve by column name
                int userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");

                User obj = new User(userId, userName, password);
                results.add(obj);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.close(conn, stmt, rs);

        }
        return results;
    }
    
     public static User searchUser(String searchText) {
        Connection conn = null;
        PreparedStatement stmt = null;
        String sql = "";
        ResultSet rs = null;
        User obj = null;
        try {
            conn = ConnectionManager.getConnection();

            sql = "SELECT userId, userName, password FROM " + TBLNAME + " WHERE userName LIKE ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%"+searchText+"%");
            System.out.println(sql);
            rs=stmt.executeQuery();
            while (rs.next()) {
               //Retrieve by column name
                int userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");

                obj = new User(userId, userName, password);
            }
          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectionManager.close(conn, stmt);
        }
         return obj;
    }
}
