/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class konek {
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        if(koneksi==null){
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_tingkat_kriminal", "root", "");
        }
        return koneksi;
    }
}
