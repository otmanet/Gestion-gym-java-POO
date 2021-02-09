/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gold_gym;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author JK.otmane
 */
public class login_gold extends javax.swing.JFrame {

    /**
     * Creates new form login_gold
     */
      Connection con=null;
    Statement stat=null;
    ImageIcon icon;
    public login_gold() throws ClassNotFoundException, SQLException {
        initComponents();
         lbl_U.setVisible(false);
        lbl_p.setVisible(false);
        error_username.setVisible(false);
        error_password.setVisible(false);
        con=(Connection) MyConnection.openConnection();
        icon=new ImageIcon("src/image/barbell.png");
        setIconImage(icon.getImage());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        error_username = new javax.swing.JLabel();
        error_password = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        lbl_U = new javax.swing.JLabel();
        lbl_p = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        error_username.setForeground(new java.awt.Color(255, 0, 0));
        error_username.setText("* Username incorrect");

        error_password.setForeground(new java.awt.Color(255, 0, 0));
        error_password.setText("* Password incorrect");

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login-30.png"))); // NOI18N
        login.setText("Login");
        login.setIconTextGap(8);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("LOGIN");

        cancel.setBackground(new java.awt.Color(51, 51, 51));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-30.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setIconTextGap(8);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Username :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        lbl_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_U.setForeground(new java.awt.Color(255, 0, 0));
        lbl_U.setText("*");

        lbl_p.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_p.setForeground(new java.awt.Color(255, 0, 0));
        lbl_p.setText("*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Inscription");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(error_username))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(error_password))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cancel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jusername, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_U)
                                    .addComponent(lbl_p)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(error_username, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_U))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(error_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_p))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        lbl_U.setVisible(false);
        lbl_p.setVisible(false);
        error_username.setVisible(false);
        error_username.setVisible(false);
          //////Username incorrect :::::::::::::::
       try {
            Statement stat1=con.createStatement();
             String err_username=jusername.getText();
             ResultSet res1=stat1.executeQuery("SELECT * FROM user_gold WHERE username<>'"+err_username+"'");
           if(res1.next()){
                       error_username.setVisible(true);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        try {
             Statement stat2=con.createStatement();
             String err_password=String.valueOf(jpassword.getPassword());
             ResultSet res2=stat2.executeQuery("SELECT * FROM user_gold WHERE password<>'"+err_password+"'");
           if(res2.next()){
                       error_password.setVisible(true);
           }
        } catch (Exception e) {
        }
        if(jusername.getText().equals("")){
            lbl_U.setVisible(true);
            error_username.setVisible(false);
            error_password.setVisible(false);
        }else if(jpassword.getText().equals("")){
            lbl_p.setVisible(true);
            error_username.setVisible(false);
            error_password.setVisible(false);
        }else{
            try {
                Statement stat=con.createStatement();
                String username=jusername.getText();
                String password=String.valueOf(jpassword.getPassword());
                ResultSet  res =stat.executeQuery("SELECT * FROM user_gold WHERE username='"+username+"' AND password='"+password+"'");
                if(res.next()){
                    MainFram mf=new MainFram();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                   mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    mf.jLabel1.setText("WELCOME<"+jusername.getText()+">");
                    mf.jLabel2.setText("Le Nombre De personne Abonné ="+Integer.toString(MyFunction.DataCount("user")));
                    mf.jLabel3.setText("Le nombre de personnes qui doivent payer ="+Integer.toString(MyFunction.DataCountToday()));
                    mf.jLabel4.setText("Le Nombre De Personne Pas Paiement ="+Integer.toString(MyFunction.DataCountPasPaiement()));
                    mf.jLabel6.setText(" Nombre d'abonnés : "+Integer.toString(MyFunction.DataCountabonne()));
                    
                }

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(null,"Are You Sure???");
            System.exit(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          try {
              // TODO add your handling code here:
              Inscription i=new Inscription();
              i.setVisible(true);
              i.pack();
              i.setLocationRelativeTo(null);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(login_gold.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(login_gold.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login_gold().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(login_gold.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(login_gold.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel error_password;
    private javax.swing.JLabel error_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel lbl_U;
    private javax.swing.JLabel lbl_p;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
