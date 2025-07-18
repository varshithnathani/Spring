package org.example;

import java.sql.*;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Vulnerable Login System ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_sql_injection", "root", "root");
//
//            // ❌ VULNERABLE SQL (String Concatenation)
//
//            String sql = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";

//            System.out.println("Executed SQL: " + sql);
//
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);

            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();


            if (rs.next()) {
                System.out.println("✅ Login successful! Welcome, " + rs.getString("username"));
            } else {
                System.out.println("❌ Invalid username or password");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
