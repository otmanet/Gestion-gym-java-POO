/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gold_gym;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;





/**
 *
 * @author JK.otmane
 */

public class MyFunction {
     public static int DataCountabonne() throws ClassNotFoundException, SQLException{
       int total=0;
       Connection con=(Connection) MyConnection.openConnection();
       Statement stat ;
        try {
           stat=(Statement) con.createStatement();
            ResultSet res= stat.executeQuery("SELECT COUNT(*) AS 'total' FROM user");
            if(res.next()){
                total=res.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return total;
    }
    
    public static int DataCount(String NomTable) throws ClassNotFoundException, SQLException{
       int total=0;
       Connection con=(Connection) MyConnection.openConnection();
       Statement stat ;
        try {
           stat=(Statement) con.createStatement();
            ResultSet res= stat.executeQuery("SELECT COUNT(*) AS 'total' FROM "+ NomTable +" WHERE paiement='paiement'");
            if(res.next()){
                total=res.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return total;
    }
     public static int DataCountToday() throws ClassNotFoundException, SQLException{
       int total=0;
       Connection con=(Connection) MyConnection.openConnection();
       Statement stat ;
        try {
           stat=(Statement) con.createStatement();
            ResultSet res= stat.executeQuery("SELECT COUNT(*) AS total\n" +
            "  FROM USER \n" +
            "  WHERE DAY(date_ins)=DAY(NOW())");
            if(res.next()){
                total=res.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return total;
    }
     public static int DataCountPasPaiement() throws ClassNotFoundException, SQLException{
       int total=0;
       Connection con=(Connection) MyConnection.openConnection();
       Statement stat ;
        try {
           stat=(Statement) con.createStatement();
            ResultSet res= stat.executeQuery("SELECT COUNT(*) AS total\n" +
            "  FROM USER \n" +
            "  WHERE paiement='pas paiement'");
            if(res.next()){
                total=res.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return total;
    }
      public  String nom(Integer number_inscription) throws ClassNotFoundException, SQLException{
            Connection con=MyConnection.openConnection();
            PreparedStatement ps;
            String nom="";
            try {
                ps=con.prepareStatement("select nom from user WHERE number_ins=?");
                ps.setInt(1, number_inscription);
               ResultSet res=ps.executeQuery();
               if(res.next()){
                  nom=res.getString(1);
               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return nom;
        }
        public String pernome(Integer number_ins) throws ClassNotFoundException, SQLException{
            Connection con=MyConnection.openConnection();
            PreparedStatement ps;
            String pernom="";
            try {
                ps=con.prepareStatement("select pernom from user WHERE number_ins=?");
                ps.setInt(1,number_ins );
                ResultSet res=ps.executeQuery();
                if(res.next()){
                    pernom=res.getString(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return pernom;
        }
        public String dateInscription(Integer number_ins) throws ClassNotFoundException, SQLException{
            Connection con=MyConnection.openConnection();
            PreparedStatement ps;
            String date="";
            try {
                ps=con.prepareStatement("select date_ins from user WHERE number_ins=?");
                ps.setInt(1,number_ins);
                ResultSet res=ps.executeQuery();
                if(res.next()){
                    date=res.getString(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return date;
        }
         public String paiement(Integer number_ins) throws ClassNotFoundException, SQLException{
            Connection con=MyConnection.openConnection();
            PreparedStatement ps;
            String date="";
            try {
                ps=con.prepareStatement("select paiement from user WHERE number_ins=?");
                ps.setInt(1,number_ins);
                ResultSet res=ps.executeQuery();
                if(res.next()){
                    date=res.getString(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return date;
        }
}
