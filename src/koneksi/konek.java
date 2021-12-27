/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class konek {
    Connection con = null;
    public static Connection konek(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/sistem_tingkat_kriminal";
        String user = "root";
        String password = "";
        try{
            Class.forName(driver);
            Connection con = (Connection) DriverManager.getConnection(host, user, password);
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
