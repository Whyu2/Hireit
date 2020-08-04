/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.AdminModel;
import model.AdminTabelBisnis;
import model.AdminTabelCatatan;
import model.AdminTabelPaktif;
import model.AdminTabelPekerja;
import model.AdminTabelPostingan;


import view.Admin;
import view.Admin_Paktif;
import view.Admin_bisnis;
import view.Admin_catatan;
import view.Admin_posting;

/**
 *
 * @author MELON
 */
public class AdminController {
     private Admin adminView;
     private Admin_bisnis adminbisnisView;
     private Admin_posting adminbpostinganView;
     private Admin_catatan admincatatanView;
      private Admin_Paktif adminpaktifView;
      private AdminModel adminmodel;
     private ArrayList <AdminModel> adminpekerja;
     private ArrayList <AdminModel> adminbisnis;
     private ArrayList <AdminModel> adminposting;
     private ArrayList <AdminModel> adminpekaktif;
     private ArrayList <AdminModel> admincatatan;
      
     public AdminController(Admin adminView){
   this.adminView = adminView;
    adminmodel = new AdminModel();
    }
          public AdminController(Admin_bisnis adminbisnisView){
   this.adminbisnisView = adminbisnisView;
    adminmodel = new AdminModel();
    }
          
          public AdminController(Admin_posting adminbpostinganView){
   this.adminbpostinganView = adminbpostinganView;
    adminmodel = new AdminModel();
   //Insert Tabel
    }
          
         public AdminController(Admin_Paktif admidpaktifView){
   this.adminpaktifView = admidpaktifView;
//    dataposting = new DataPosting();
    adminmodel = new AdminModel();
   //Insert Tabel
    }
 public AdminController(Admin_catatan admincatatanView){
   this.admincatatanView = admincatatanView;
    adminmodel = new AdminModel();
    }
      
      public void isiTablePekerja()
    {
    adminpekerja = adminmodel.AdminPekerja();
    AdminTabelPekerja tblData= new AdminTabelPekerja(adminpekerja);
    adminView.getTabelPekerja().setModel(tblData);
    }
      
        public void isiTableBisnis()
    {
    adminbisnis = adminmodel.AdminBisnis();
    AdminTabelBisnis tblData= new AdminTabelBisnis(adminbisnis);
    adminbisnisView.getTabelBisnis().setModel(tblData);
    }
        
       public void isiTablePosting()
    {
    adminposting = adminmodel.AdminPosting();
    AdminTabelPostingan tblData= new AdminTabelPostingan(adminposting);
    adminbpostinganView.getTabelPostingan().setModel(tblData);
    }
       
          public void isiTablePaktif()
    {
    adminpekaktif = adminmodel.AdminPekerjaAktiv();
    AdminTabelPaktif tblData= new AdminTabelPaktif(adminpekaktif);
    adminpaktifView.getTabelAktif().setModel(tblData);
    }
          
          public void isiTableCatatan()
    {
    admincatatan = adminmodel.AdminCatatanPekerja();
    AdminTabelCatatan tblData= new AdminTabelCatatan(admincatatan);
    admincatatanView.getTabelCatatan().setModel(tblData);
    }
          
          //data untuk queery delet
           public void DataUser(
          int id_user ){
          adminmodel.setId_userd(id_user);
           }
           
              public void DataPost(
          int id_post ){
          adminmodel.setId_postingand(id_post);
           }
              
            public void DataAkfif(
          int id_list){
          adminmodel.setIdlistd(id_list);
           }  
            
               public void DataCatatan(
          int id_catatan){
          adminmodel.setIdcatatan(id_catatan);
           }  
              
           
          //Isi ke field bayangan adminPekerja
              public void isiField(int row) {
        adminView.getTxtiduser().setText(adminpekerja.get(row).getId_user()); 
//       adminbisnisView.getTxtiduser().setText(adminbisnis.get(row).getId_user()); 

    }
                //Isi ke field bayangan adminBisnis
                  public void isiFieldB(int row) {
       adminbisnisView.getTxtiduser().setText(adminbisnis.get(row).getId_user()); 

    }    
                   //Isi ke field bayangan adminPostingan
                   public void isiFieldP(int row) {
       adminbpostinganView.getTxtidpost().setText(adminposting.get(row).getDataid_Postingan()); 

    }    
                        //Isi ke field bayangan adminPaktif
                   public void isiFieldU(int row) {
       adminpaktifView.getTxtidlist().setText(adminpekaktif.get(row).getIdlist());
    }    
                           //Isi ke field bayangan catatan
                                  public void isiFieldC(int row) {
       admincatatanView.getTxtidcatatan().setText(admincatatan.get(row).getId_catatan_user());
    }   
                  
    //hapus USer
              public boolean deleteUser(){
        return adminmodel.deleteUser();
        }
    // Hapus post
                     public boolean deletePost(){
        return adminmodel.deletePost();
        }
     // Hapus Aktif
      public boolean deletePaktif(){
        return adminmodel.deletePaktif();
        }     
         public boolean deleteCatatan(){
        return adminmodel.deleteCatatan();
        }  
}
