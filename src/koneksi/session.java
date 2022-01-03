/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Lenovo
 */
public class session {
    private static String username;
    
    public static String get_Username(){
        return username;
    }
    
    public static void set_Username(String username){
        session.username = username;
    }
}
