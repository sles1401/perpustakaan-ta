package perpustakaan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suryani lestari 14
 */
public class koneksi {
    public static Connection koneksi;
    public static Statement keputusan;
    public static ResultSet hasilset;
    public static String bahasasql;
    
    public static void koneksiku() throws SQLException{
        koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan", "root", "");
        keputusan = koneksi.createStatement();
    }
    public static void ambildata() throws SQLException{
        koneksiku();
        hasilset = keputusan.executeQuery(bahasasql);
    }
    public static void crud() throws SQLException{
        koneksiku();
        keputusan.executeUpdate(bahasasql);
    }
}
