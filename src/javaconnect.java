/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pro24
 */
import java.sql.*;
public class javaconnect {
    Connection conn;
    public static Connection ConnecrDb() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","123qweASD");
            return conn;
            
        }catch(Exception e){
           e.printStackTrace(); 
        }
        return null;
    }
}
