/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.UserController;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.UserModel;


/**
 *
 * @author MELON
 */
public class Login extends javax.swing.JFrame {
    UserController usercontrol;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        usercontrol = new UserController (this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tnama = new javax.swing.JTextField();
        Regis = new javax.swing.JLabel();
        tpas = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();
        Bg = new javax.swing.JLabel();
        KlikRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tnama.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tnama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 44, 56), 2));
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });
        getContentPane().add(tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 240, 30));

        Regis.setBackground(new java.awt.Color(24, 32, 38));
        Regis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regis.setForeground(new java.awt.Color(255, 255, 255));
        Regis.setText("      Register");
        Regis.setToolTipText("");
        Regis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Regis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisMouseClicked(evt);
            }
        });
        getContentPane().add(Regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 100, 30));

        tpas.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        tpas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 44, 56)));
        tpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpasActionPerformed(evt);
            }
        });
        getContentPane().add(tpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 240, 30));

        Login.setBackground(new java.awt.Color(24, 32, 38));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("       Login");
        Login.setToolTipText("");
        Login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Login.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 100, 30));

        Bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Regiss.png"))); // NOI18N
        getContentPane().add(Bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1000, -1));

        KlikRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(KlikRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KlikRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikRegisterMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_KlikRegisterMouseClicked

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
 boolean hasil = usercontrol.loginUser (tnama.getText(),
                                         tpas.getText()); 



    if (hasil){
        if (UserModel.getLevelUser() ==  1){ //pekerja
        Temukan temukan = new Temukan(); 
        temukan.setVisible(true);
        this.dispose();
        }else if (UserModel.getLevelUser()  == 2){ //perusahaan
        TambahPostingan page = new TambahPostingan();
        page.setVisible(true);
        this.dispose(); 
        }else if   (UserModel.getLevelUser()  == 0){
        Admin Admin = new Admin();
        Admin.setVisible(true);
        this.dispose();    
            
        }else { JOptionPane.showMessageDialog(null, "Maff user pass salah");}

     
      
    }else {
    JOptionPane.showMessageDialog(null, "Maff user pass salah");
    tnama.setText(null);
    tpas.setText(null);
    tnama.requestFocus();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseClicked

    private void RegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisMouseClicked
            new Register().show();
  this.dispose(); // // TODO add your handling code here:
    }//GEN-LAST:event_RegisMouseClicked

    private void tpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpasActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bg;
    private javax.swing.JLabel KlikRegister;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Regis;
    private javax.swing.JTextField tnama;
    private javax.swing.JPasswordField tpas;
    // End of variables declaration//GEN-END:variables
    
}
