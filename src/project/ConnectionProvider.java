/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;


/**
 *
 * @author anuwadhwa
 */
public class ConnectionProvider {
    public static Connection getcon(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","");
            return con;
        }catch(Exception e){
            return null;
        }
        
    }
}
