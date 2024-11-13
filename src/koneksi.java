/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yaboikupit
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db_simetik";
        String user = "root"; // Sesuaikan dengan username MySQL Anda
        String password = ""; // Sesuaikan dengan password MySQL Anda (default kosong di XAMPP)
        return DriverManager.getConnection(url, user, password);
    }
}
