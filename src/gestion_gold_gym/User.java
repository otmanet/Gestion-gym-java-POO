/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gold_gym;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JK.otmane
 */
public class User {
      public void  insertdeleteupdate(char operation, Integer id, String nom,String pernom, Integer number_ins,
              String cin,String phone,String date_ins,String prix,String paiement,String photo) throws ClassNotFoundException, SQLException{
          Connection con=MyConnection.openConnection();
        PreparedStatement ps;
          if(operation=='i'){
              ps=con.prepareStatement("INSERT INTO user(nom,pernom,number_ins,cin,phone,date_ins,prix,paiement,photo) VALUES(?,?,?,?,?,?,?,?,?)");
              ps.setString(1, nom);
              ps.setString(2, pernom);
              ps.setInt(3, number_ins);
              ps.setString(4, cin);
              ps.setString(5, phone);
              ps.setString(6, date_ins);
              ps.setString(7, prix);
              ps.setString(8, paiement);
              ps.setString(9, photo);
              if(ps.executeUpdate()>0){
                 JOptionPane.showMessageDialog(null,"New User added");
              }
              
          }
          if(operation=='u'){
              ps=con.prepareStatement("UPDATE user SET nom=?,pernom=?,number_ins=?,cin=?,phone=?,date_ins=?,prix=?,paiement=?,photo=? WHERE id=?");
              ps.setString(1, nom);
              ps.setString(2, pernom);
              ps.setInt(3, number_ins);
              ps.setString(4, cin);
              ps.setString(5, phone);
              ps.setString(6, date_ins);
              ps.setString(7, prix);
              ps.setString(8, paiement);
              ps.setString(9, photo);
              ps.setInt(10, id);
              if(ps.executeUpdate()>0){
                  JOptionPane.showMessageDialog(null,"Utilisateur Modifier");
              }
          }
          if(operation=='d'){
              ps=con.prepareStatement("delete from user where id=?");
              ps.setInt(1,id);
              if(ps.executeUpdate()>0){
                 JOptionPane.showConfirmDialog(null,"êtes-vous sûr","Change paiement",JOptionPane.OK_CANCEL_OPTION,0);
              }
          }
      }
      public  void fillUserTable(JTable table,String  valueToSearch) throws ClassNotFoundException, SQLException{
        Connection con=MyConnection.openConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM user WHERE paiement='paiement' AND CONCAT(nom,pernom,number_ins,cin,phone,date_ins,prix,paiement,photo) LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%" );
           ResultSet res=ps.executeQuery();
           DefaultTableModel model=(DefaultTableModel)table.getModel();
           Object[] row;
           while(res.next()){ 
               row=new Object[10];
               row[0]=res.getInt(1);
               row[1]=res.getString(2);
               row[2]=res.getString(3);
               row[3]=res.getInt(4);
               row[4]=res.getString(5);
               row[5]=res.getString(6);
               row[6]=res.getDate(7);
               row[7]=res.getInt(8);
               row[8]=res.getString(9);
               row[9]=res.getString(10);
               model.addRow(row);
                 
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

      }
      public  void fillUserPasPaiement(JTable table,String  valueToSearch) throws ClassNotFoundException, SQLException{
        Connection con=MyConnection.openConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM user WHERE DAY(date_ins)=DAY(NOW()) AND CONCAT(nom,pernom,number_ins,cin,phone,date_ins,prix,paiement) LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%" );
           ResultSet res=ps.executeQuery();
           DefaultTableModel model=(DefaultTableModel)table.getModel();
           Object[] row;
           while(res.next()){ 
               row=new Object[9];
               row[0]=res.getInt(1);
               row[1]=res.getString(2);
               row[2]=res.getString(3);
               row[3]=res.getInt(4);
               row[4]=res.getString(5);
               row[5]=res.getString(6);
               row[6]=res.getDate(7);
               row[7]=res.getInt(8);
               row[8]=res.getString(9);
               model.addRow(row);
                 
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

      }
        public  void fillUserPasPaiement2(JTable table,String  valueToSearch) throws ClassNotFoundException, SQLException{
        Connection con=MyConnection.openConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("SELECT * FROM user WHERE paiement='pas paiement' AND CONCAT(nom,pernom,number_ins,cin,phone,date_ins,prix,paiement,photo) LIKE ?");
            ps.setString(1,"%"+valueToSearch+"%" );
           ResultSet res=ps.executeQuery();
           DefaultTableModel model=(DefaultTableModel)table.getModel();
           Object[] row;
           while(res.next()){ 
               row=new Object[10];
               row[0]=res.getInt(1);
               row[1]=res.getString(2);
               row[2]=res.getString(3);
               row[3]=res.getInt(4);
               row[4]=res.getString(5);
               row[5]=res.getString(6);
               row[6]=res.getDate(7);
               row[7]=res.getInt(8);
               row[8]=res.getString(9);
               row[9]=res.getString(10);
               model.addRow(row);
                 
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

      }
        public void changepaspaiement() throws ClassNotFoundException, SQLException{
            Connection con =MyConnection.openConnection();
            PreparedStatement ps;
            try {
                ps=con.prepareStatement("UPDATE user \n" +
                                        "SET paiement='pas paiement'\n" +
                                        "WHERE DAY(date_ins)=DAY(NOW())");
                if(ps.executeUpdate()>0){
                    JOptionPane.showConfirmDialog(null,"êtes-vous sûr","Change paiement",JOptionPane.OK_CANCEL_OPTION,0);
                }
            } catch (Exception e) {
            }
               
        }
           public boolean isUserExist(String cin) throws ClassNotFoundException, SQLException{
        com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection) MyConnection.openConnection();
        PreparedStatement ps;
        boolean isExist=false;
        try {
            ps=con.prepareStatement("SELECT * FROM user WHERE cin=? ");
            ps.setString(1, cin);
            ResultSet res=ps.executeQuery();
            if(res.next()){
                isExist=true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }
        return isExist;
    }
}
