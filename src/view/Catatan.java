/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.CatatanController;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.CatatanModel;


import model.DataPosting;
import model.ListPekerjaanModel;
import model.UserModel;

/**
 *
 * @author MELON
 */
public class Catatan extends javax.swing.JFrame {
  private CatatanController catatancontroler;
   private ArrayList <CatatanModel> listdatacacatan;
//    private DataPosting dataposting;
//    private ArrayList <DataPosting> listdata;
   private ListPekerjaanModel listpekerjaanmodel;
   private ArrayList <ListPekerjaanModel> listdatakerja;
   

    /**
     * Creates new form Catatan
     */
    public Catatan() {
     initComponents();
     catatancontroler = new CatatanController (this);
            member.setText("Selamat Datang " + UserModel.getUsernameUser()+ " (Pekerja) ");
    catatancontroler.isiTableCatatan();
      tampiljudulpost();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next3 = new javax.swing.JLabel();
        member = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Cmbjudul = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtCatatan = new javax.swing.JTextArea();
        Hapus = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jcatatan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        next2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TXTidcatatan = new javax.swing.JTextField();
        KlikTemukan = new javax.swing.JLabel();
        KlikCatatan = new javax.swing.JLabel();
        KlikTemukan1 = new javax.swing.JLabel();
        KlikListP = new javax.swing.JLabel();
        KlikCatatan1 = new javax.swing.JLabel();
        KlikEdit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        next3.setText("Catatan ");
        getContentPane().add(next3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 140, 30));

        member.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        member.setForeground(new java.awt.Color(255, 255, 255));
        member.setText("Nama Login");
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 320, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Pilih Pekerjaan");

        Cmbjudul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cmbjudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbjudulActionPerformed(evt);
            }
        });

        TxtCatatan.setColumns(20);
        TxtCatatan.setRows(5);
        jScrollPane2.setViewportView(TxtCatatan);

        Hapus.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/trash.png"))); // NOI18N
        Hapus.setText("Hapus");
        Hapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Simpan.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/download.png"))); // NOI18N
        Simpan.setText("Simpan");
        Simpan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Simpan.setFocusPainted(false);
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/edit.png"))); // NOI18N
        Edit.setText("Edit");
        Edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jcatatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jcatatan.setRowHeight(30);
        jcatatan.setSelectionBackground(new java.awt.Color(24, 32, 38));
        jcatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcatatanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jcatatan);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("List Catatan");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel5.setText("Masukkan Catatan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addComponent(Cmbjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cmbjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 1030, 560));

        jPanel11.setBackground(new java.awt.Color(24, 32, 38));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        next2.setBackground(new java.awt.Color(24, 32, 38));
        next2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        next2.setForeground(new java.awt.Color(255, 255, 255));
        next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icon/icons8-logout-rounded-left-25.png"))); // NOI18N
        next2.setText("Logout");
        next2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(next2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(next2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 620, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HDUser.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TXTidcatatan.setEditable(false);
        TXTidcatatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidcatatanActionPerformed(evt);
            }
        });
        getContentPane().add(TXTidcatatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        KlikTemukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikTemukanMouseClicked(evt);
            }
        });
        getContentPane().add(KlikTemukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 30));

        KlikCatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikCatatanMouseClicked(evt);
            }
        });
        getContentPane().add(KlikCatatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 230, 30));

        KlikTemukan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikTemukan1MouseClicked(evt);
            }
        });
        getContentPane().add(KlikTemukan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 30));

        KlikListP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikListPMouseClicked(evt);
            }
        });
        getContentPane().add(KlikListP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 30));

        KlikCatatan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikCatatan1MouseClicked(evt);
            }
        });
        getContentPane().add(KlikCatatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 230, 30));

        KlikEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KlikEditMouseClicked(evt);
            }
        });
        getContentPane().add(KlikEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        catatancontroler.DataCatatan(Integer.parseInt(TXTidcatatan.getText()), null); 
        boolean hasil = catatancontroler.deleteCatatan();
    if (hasil){
    JOptionPane.showMessageDialog(null, "Catatn Berhasill Dihapus");    
    Catatan home = new Catatan();
    home.setVisible(true);
    this.dispose();
    }else {
    JOptionPane.showMessageDialog(null, "Catatan Gagal Dihapus");
    }// TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
      String idPostingan = Cmbjudul.getSelectedItem().toString().substring(0,2);
     catatancontroler.DataPosting(Integer.parseInt(idPostingan), TxtCatatan.getText());
     boolean hasil = catatancontroler.insertCatatan();
    if (hasil){
    JOptionPane.showMessageDialog(null, "Catatn Berhasill Ditambahkan");    
    Catatan home = new Catatan();
    home.setVisible(true);
    this.dispose();
    }else {
    JOptionPane.showMessageDialog(null, "Catatan Gagal");
    }
        
// TODO add your handling code here:
    }//GEN-LAST:event_SimpanActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
//            
     catatancontroler.DataCatatan(Integer.parseInt(TXTidcatatan.getText()), TxtCatatan.getText());
     boolean hasil = catatancontroler.updateCatatan();
    if (hasil){
    JOptionPane.showMessageDialog(null, "Catatn Berhasill Diubah");    
    Catatan home = new Catatan();
    home.setVisible(true);
    this.dispose();
    }else {
    JOptionPane.showMessageDialog(null, "Catatan Gagal Diubah");
    }
    }//GEN-LAST:event_EditActionPerformed

    private void CmbjudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbjudulActionPerformed
       
    }//GEN-LAST:event_CmbjudulActionPerformed

    private void KlikTemukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikTemukanMouseClicked
   new Temukan().show();
      this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_KlikTemukanMouseClicked

    private void KlikCatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikCatatanMouseClicked
        new Catatan().show();
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_KlikCatatanMouseClicked

    private void jcatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcatatanMouseClicked
//       cbt.isiField(tabelData.getSelectedRow());
           catatancontroler.isiField(jcatatan.getSelectedRow());
    }//GEN-LAST:event_jcatatanMouseClicked

    private void TXTidcatatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidcatatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTidcatatanActionPerformed

    private void KlikTemukan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikTemukan1MouseClicked
       new Temukan().show();
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_KlikTemukan1MouseClicked

    private void KlikListPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikListPMouseClicked
        new ListPekerjaan().show();
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_KlikListPMouseClicked

    private void KlikCatatan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikCatatan1MouseClicked
        new Catatan().show();
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_KlikCatatan1MouseClicked

    private void KlikEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KlikEditMouseClicked
      new EditAkunUser().show();
        this.dispose();
    }//GEN-LAST:event_KlikEditMouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_jPanel11MouseClicked

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
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cmbjudul;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel KlikCatatan;
    private javax.swing.JLabel KlikCatatan1;
    private javax.swing.JLabel KlikEdit;
    private javax.swing.JLabel KlikListP;
    private javax.swing.JLabel KlikTemukan;
    private javax.swing.JLabel KlikTemukan1;
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField TXTidcatatan;
    private javax.swing.JTextArea TxtCatatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jcatatan;
    private javax.swing.JLabel member;
    private javax.swing.JLabel next2;
    private javax.swing.JLabel next3;
    // End of variables declaration//GEN-END:variables

 public void tampiljudulpost() {
     Cmbjudul.removeAllItems();
//     listdata = catatancontroler.DataPost();
     listdatakerja = catatancontroler.DataKerjaan();
     for (ListPekerjaanModel data  : listdatakerja){
     Cmbjudul.addItem(data.getId_postingan()+"."+data.getJudul() );
     }
    TxtCatatan.setText(null);
     }

   public JTable getTabelDataCatatan() {
        return jcatatan;
    }
//    public JLabel  getlabelDataCatatan() {
//        return Tess;
//    }
//   

   
   
  public JTextArea getTxtDataCatatan(){
        return TxtCatatan;
    }
 
    public JTextField getTxtidcatatan(){
        return TXTidcatatan;
    }
    public JComboBox getTxtjudul(){
        return Cmbjudul;
    }
   
    }  

