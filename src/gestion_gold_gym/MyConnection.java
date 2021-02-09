/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gold_gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JK.otmane
 */
public class MyConnection {
     final static  String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final static String DB_URL="jdbc:mysql://localhost:3306/gold_gym";
    final static String USERNAME="root";
    final static String PASSWORD="";
    public static Connection openConnection()throws ClassNotFoundException, SQLException{
        try {
            Class.forName(JDBC_DRIVER);
            Connection con=(Connection)DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
