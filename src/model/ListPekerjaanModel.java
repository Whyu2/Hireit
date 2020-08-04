/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MELON
 */
public class ListPekerjaanModel {
    private DatabaseConnection dbConn;
    private String query;
    private boolean hasil; 
    private ResultSet rsData;
    private ArrayList listdatakerjaan;
//    private ArrayList listdatakerjaan1;

    public ListPekerjaanModel(){
    dbConn = new DatabaseConnection();
    dbConn.getConn();
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isHasil() {
        return hasil;
    }

    public void setHasil(boolean hasil) {
        this.hasil = hasil;
    }

    public ResultSet getRsData() {
        return rsData;
    }

    public void setRsData(ResultSet rsData) {
        this.rsData = rsData;
    }

//    public int getId_list() {
//        return id_list;
//    }
//
//    public void setId_list(int id_list) {
//        this.id_list = id_list;
//    }

    public int getId_postingan() {
        return id_postingan;
    }

    public void setId_postingan(int id_postingan) {
        this.id_postingan = id_postingan;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
     public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String getId_list() {
        return id_list;
    }

//    private int id_list;
    public void setId_list(String id_list) {
        this.id_list = id_list;
    }
    

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    private String id_list;
    private int id_postingan;
    private int id_user;
    private String tanggal;
    private String judul;
    private String nama_perusahaan;
    private String deadline;
    private String deskripsi;
    private String pays;
    private String location ;
    private String email;
    private String contact;
    private String logo;
       
    //All Data ke tabel
    
     public ArrayList DataKerjaan()  {
     query = "SELECT c. *, p.judul_posting, p.nama_perusahaan, p.deadline,p.deskripsi,p.pays,p.location,p.email,.p.contact,p.deadline,p.logo FROM tbl_list_kerja c JOIN tbl_postingan_user p ON c.id_postingan = p.id_postingan WHERE c.id_user ='"+UserModel.getId_user()+"'";
            
     hasil = dbConn.executeQuery(query, true);
   
      if (hasil){
        rsData = dbConn.getRs();
        listdatakerjaan = new ArrayList <ListPekerjaanModel>();
        try{ 
          while(rsData.next()){
          ListPekerjaanModel datalist = new ListPekerjaanModel();
          datalist.setId_list(rsData.getString(1));
          datalist.setId_postingan(rsData.getInt(2));
          datalist.setId_user(rsData.getInt(3));
          datalist.setJudul(rsData.getString(4));
          datalist.setNama_perusahaan(rsData.getString(5));
          datalist.setDeadline(rsData.getString(6));
          datalist.setDeskripsi(rsData.getString(7));
          datalist.setPays(rsData.getString(8));
          datalist.setLocation(rsData.getString(9));
          datalist.setEmail(rsData.getString(10));
          datalist.setContact(rsData.getString(11));
          datalist.setLogo(rsData.getString(12));
          
          listdatakerjaan.add(datalist);
            }
        rsData.close();
          return listdatakerjaan;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}

       public int getId_list_delete() {
        return Id_list_delete;
    }

    public void setId_list_delete(int Id_list_delete) {
        this.Id_list_delete = Id_list_delete;
    }

     
     
      private int Id_list_delete;
      
      
      
     //selesai
  public boolean deletelist(){
 query= "DELETE from tbl_list_kerja WHERE id_list = '"+Id_list_delete+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }

    //single Data ke tabel
   
  
    
    
//    public int getId_postingan1() {
//        return id_postingan1;
//    }
//
//    public void setId_postingan1(int id_postingan1) {
//        this.id_postingan1 = id_postingan1;
//    }
//
//    public int getId_user1() {
//        return id_user1;
//    }
//
//    public void setId_user1(int id_user1) {
//        this.id_user1 = id_user1;
//    }
//
//    public String getTanggal1() {
//        return tanggal1;
//    }
//
//    public void setTanggal1(String tanggal1) {
//        this.tanggal1 = tanggal1;
//    }
//
//    public String getJudul1() {
//        return judul1;
//    }
//
//    public void setJudul1(String judul1) {
//        this.judul1 = judul1;
//    }
//
//    public String getNama_perusahaan1() {
//        return nama_perusahaan1;
//    }
//
//    public void setNama_perusahaan1(String nama_perusahaan1) {
//        this.nama_perusahaan1 = nama_perusahaan1;
//    }
//
//    public String getDeadline1() {
//        return deadline1;
//    }
//
//    public void setDeadline1(String deadline1) {
//        this.deadline1 = deadline1;
//    }
//
//    public String getDeskripsi1() {
//        return deskripsi1;
//    }
//
//    public void setDeskripsi1(String deskripsi1) {
//        this.deskripsi1 = deskripsi1;
//    }
//
//    public String getPays1() {
//        return pays1;
//    }
//
//    public void setPays1(String pays1) {
//        this.pays1 = pays1;
//    }
//
//    public String getLocation1() {
//        return location1;
//    }
//
//    public void setLocation1(String location1) {
//        this.location1 = location1;
//    }
//
//    public String getEmail1() {
//        return email1;
//    }
//
//    public void setEmail1(String email1) {
//        this.email1 = email1;
//    }
//
//    public String getContact1() {
//        return contact1;
//    }
//
//    public void setContact1(String contact1) {
//        this.contact1 = contact1;
//    }
//
//    public String getLogo1() {
//        return logo1;
//    }
//    
//     public void setLogo1(String logo1) {
//        this.logo1 = logo1;
//    }
//    
//    public ArrayList getListdatakerja1() {
//        return listdatakerjaan1;
//    }
//
////    private String id_list1;
//    public void setListdatakerja1(ArrayList listdatakerja1) {
//        this.listdatakerjaan1 = listdatakerja1;
//    }
//
//    public int getId_list1() {
//        return id_list1;
//    }
//
//    public void setId_list1(int id_list1) {
//        this.id_list1 = id_list1;
//    }
//    private int id_list1;
//    private int id_postingan1;
//    private int id_user1;
//    private String tanggal1;
//    private String judul1;
//    private String nama_perusahaan1;
//    private String deadline1;
//    private String deskripsi1;
//    private String pays1;
//    private String location1 ;
//    private String email1;
//    private String contact1;
//    private String logo1;
//    
//     public ArrayList DataKerjaan1()  {
//     query = "SELECT c. *, p.judul_posting, p.nama_perusahaan, p.deadline,p.deskripsi,p.pays,p.location,p.email,.p.contact,p.logo FROM tbl_list_kerja c JOIN tbl_postingan_user p ON c.id_postingan = p.id_postingan WHERE c.id_user = "+UserModel.getId_user()+" OR c.id_list= '"+id_list1 +"'";
//            
//     hasil = dbConn.executeQuery(query, true);
//   
//      if (hasil){
//        rsData = dbConn.getRs();
//        listdatakerjaan1 = new ArrayList <ListPekerjaanModel>();
//        try{ 
//          while(rsData.next()){
//          ListPekerjaanModel datalist = new ListPekerjaanModel();
//          datalist.setId_list1(rsData.getInt(1));
//          datalist.setId_postingan1(rsData.getInt(2));
//          datalist.setId_user1(rsData.getInt(3));
//          datalist.setJudul1(rsData.getString(4));
//          datalist.setNama_perusahaan1(rsData.getString(5));
//          datalist.setDeadline1(rsData.getString(6));
//          datalist.setDeskripsi1(rsData.getString(7));
//          datalist.setPays1(rsData.getString(8));
//          datalist.setLocation1(rsData.getString(9));
//          datalist.setEmail1(rsData.getString(10));
//          datalist.setContact1(rsData.getString(11));
//          datalist.setLogo1(rsData.getString(12));
//          
//          listdatakerjaan1.add(datalist);
//            }
//        rsData.close();
//          return listdatakerjaan1;
//        }
//        catch(SQLException ex){
//            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
//                 return null;
//      }
//        
//    }         
//      return null;
//}
//
 
    
}
