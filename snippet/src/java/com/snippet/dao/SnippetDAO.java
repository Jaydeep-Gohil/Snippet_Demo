package com.snippet.dao; // Fixed package name

import com.snippet.common.DataBase;
import com.snippet.models.user; 
import java.sql.*;

public class SnippetDAO {

    
    public boolean saveSnippet(user snippet) {
        String sql = "INSERT INTO snippet (title, language, des, code, tage) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = DataBase.connect();
             PreparedStatement pr = con.prepareStatement(sql)) {

            pr.setString(1, snippet.getTitle()); 
            pr.setString(2, snippet.getLanguage()); 
            pr.setString(3, snippet.getDes()); 
            pr.setString(4, snippet.getCode()); 
            pr.setString(5, snippet.getTags()); 

            int rowsInserted = pr.executeUpdate();
            return rowsInserted > 0;
            
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            return false;
        }
    }
}
