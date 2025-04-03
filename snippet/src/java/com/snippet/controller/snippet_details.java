package com.snippet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.snippet.common.DataBase;

@WebServlet("/snippet_details") 
public class snippet_details extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String language = request.getParameter("language");
        String des = request.getParameter("des"); 
        String code = request.getParameter("code");
        String tage = request.getParameter("tag");
        
        try (Connection conn = DataBase.connect()) {
            String sql = "INSERT INTO snippet (title, language, des, code, tage) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, language);
            pstmt.setString(3, des);
            pstmt.setString(4, code);
            pstmt.setString(5, tage);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                response.getWriter().println("Snippet saved successfully!");
            } else {
                response.getWriter().println("Failed to save snippet.");
            }
        } catch (SQLException e) {
            response.getWriter().println("Database error: " + e.getMessage());
        }
    }
}
