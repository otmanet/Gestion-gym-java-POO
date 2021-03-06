/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_gold_gym;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author JK.otmane
 */
public class Inscription extends javax.swing.JFrame {

    /**
     * Creates new form Inscription
     */
    Connection con=null;
    Statement stat=null;
    User u=new User();
    ImageIcon icon;
    public Inscription() throws ClassNotFoundException, SQLException {
        initComponents();
        lbl_U.setVisible(false);
        lbl_password.setVisible(false);
        lbl_mod_de_cle.setVisible(false);
        con=MyConnection.openConnection();
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

        jPanel12 = new javax.swing.JPanel();
        inscription5 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cancel5 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jusername5 = new javax.swing.JTextField();
        jmotcle5 = new javax.swing.JPasswordField();
        lbl_U = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jpassword5 = new javax.swing.JPasswordField();
        lbl_mod_de_cle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setForeground(new java.awt.Color(51, 51, 51));

        inscription5.setBackground(new java.awt.Color(51, 51, 51));
        inscription5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inscription5.setForeground(new java.awt.Color(255, 255, 255));
        inscription5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-login-30.png"))); // NOI18N
        inscription5.setText("Inscription");
        inscription5.setIconTextGap(8);
        inscription5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscriptionActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setText("INSCRIPTION");

        cancel5.setBackground(new java.awt.Color(51, 51, 51));
        cancel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancel5.setForeground(new java.awt.Color(255, 255, 255));
        cancel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-30.png"))); // NOI18N
        cancel5.setText("Cancel");
        cancel5.setIconTextGap(8);
        cancel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Username :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Mot de clé :");

        lbl_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_U.setForeground(new java.awt.Color(255, 0, 0));
        lbl_U.setText("*");

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 0, 0));
        lbl_password.setText("*");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Password :");

        lbl_mod_de_cle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_mod_de_cle.setForeground(new java.awt.Color(255, 0, 0));
        lbl_mod_de_cle.setText("*");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jpassword5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_password))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jusername5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_U))))
                    .addComponent(jLabel24)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(cancel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inscription5))
                            .addComponent(jmotcle5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_mod_de_cle)))
                .addGap(73, 73, 73))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusername5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_U))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_password)
                    .addComponent(jpassword5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmotcle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mod_de_cle))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscription5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        try {
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void inscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscriptionActionPerformed
        // TODO add your handling code here:
        lbl_U.setVisible(false);
        lbl_password.setVisible(false);
        lbl_mod_de_cle.setVisible(false);
           if(jusername5.equals("")){
               lbl_U.setVisible(true);
               
           }else if(jpassword5.equals("")){
               lbl_password.setVisible(true);
           }else if(jmotcle5.equals("")){
               lbl_mod_de_cle.setVisible(true);
           }else{
           try {
           Connection con=MyConnection.openConnection();
           PreparedStatement ps;
           String username =jusername5.getText();
           String password=String.valueOf(jpassword5.getText());
           String mot_de_cle=String.valueOf(jmotcle5.getText());
           // code for verify mot_de_cle in tapying in Jtextfield is correct :
           if(jmotcle5.getText().equals("123654789")){
           ps=con.prepareStatement("INSERT INTO user_gold(username,password,cle)  VALUES(?,?,?)");
           ps.setString(1, username);
           ps.setString(2,password);
           ps.setString(3,mot_de_cle);
           if(ps.executeUpdate()>0){
                 MainFram mf=new MainFram();
                 mf.setVisible(true);
                 mf.pack();
                 mf.setLocationRelativeTo(null);
                 mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                 mf.jLabel1.setText("WELCOME<"+jusername5.getText()+">");
                 mf.jLabel2.setText("Le Nombre De personne Abonné ="+Integer.toString(MyFunction.DataCount("user")));
                 mf.jLabel3.setText("Le nombre de personnes qui doivent payer ="+Integer.toString(MyFunction.DataCountToday()));
                 mf.jLabel4.setText("Le Nombre De Personne Pas Paiement ="+Integer.toString(MyFunction.DataCountPasPaiement()));
           }
           }else{
               JOptionPane.showMessageDialog(null,"mot de cle incorrect");
           }
          
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         }
    }//GEN-LAST:event_inscriptionActionPerformed

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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inscription().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel5;
    private javax.swing.JButton inscription5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPasswordField jmotcle5;
    private javax.swing.JPasswordField jpassword5;
    private javax.swing.JTextField jusername5;
    private javax.swing.JLabel lbl_U;
    private javax.swing.JLabel lbl_mod_de_cle;
    private javax.swing.JLabel lbl_password;
    // End of variables declaration//GEN-END:variables
}
