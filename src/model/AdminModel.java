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
public class AdminModel {
    private String query;
    private boolean hasil; 
    private ResultSet rsData;
    private DatabaseConnection dbConn;
   private ArrayList adminpekerja;
    private ArrayList adminbisnis;
       private ArrayList adminposting;
        private ArrayList adminpekaktif;
                private ArrayList admincatatan;
//          private ArrayList admin;
    
        public AdminModel(){
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
    
    
    //User
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getKeahlian() {
        return keahlian;
    }

    
    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    private String id_user;
    private String username;
   private String password;
   private String email;
   private String hp;
   private String keahlian;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
   private int level;
//Data User Pekerja
     public ArrayList AdminPekerja() {
   query = "SELECT * FROM tbl_user WHERE level = 1 ";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        adminpekerja = new ArrayList <AdminModel>();
        try{ 
          while(rsData.next()){
          AdminModel datapekerja=new AdminModel();
          datapekerja.setId_user(rsData.getString(1));
          datapekerja.setUsername(rsData.getString(2));
          datapekerja.setPassword(rsData.getString(3));
          datapekerja.setEmail(rsData.getString(4));
          datapekerja.setHp(rsData.getString(5));
          datapekerja.setKeahlian(rsData.getString(6));
          datapekerja.setLevel(rsData.getInt(7));
         
          
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          adminpekerja.add(datapekerja);
            }
        rsData.close();
          return adminpekerja;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}
     
//Data User Bisnis
       public ArrayList AdminBisnis() {
   query = "SELECT * FROM tbl_user WHERE level = 2 ";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        adminbisnis = new ArrayList <AdminModel>();
        try{ 
          while(rsData.next()){
          AdminModel databisnis=new AdminModel();
          databisnis.setId_user(rsData.getString(1));
          databisnis.setUsername(rsData.getString(2));
          databisnis.setPassword(rsData.getString(3));
          databisnis.setEmail(rsData.getString(4));
          databisnis.setHp(rsData.getString(5));
          databisnis.setKeahlian(rsData.getString(6));
          databisnis.setLevel(rsData.getInt(7));
         
          
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          adminbisnis.add(databisnis);
            }
        rsData.close();
          return adminbisnis;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}
     
       
//Data Postingan


    public String getDataJudulPosting() {
        return DataJudulPosting;
    }

    public void setDataJudulPosting(String DataJudulPosting) {
        this.DataJudulPosting = DataJudulPosting;
    }

    public String getDatadeskripsi() {
        return Datadeskripsi;
    }

    public void setDatadeskripsi(String Datadeskripsi) {
        this.Datadeskripsi = Datadeskripsi;
    }

    public String getDatapays() {
        return Datapays;
    }

    public void setDatapays(String Datapays) {
        this.Datapays = Datapays;
    }

    public String getDatacilent() {
        return Datacilent;
    }

    public void setDatacilent(String Datacilent) {
        this.Datacilent = Datacilent;
    }

    public String getDatanamaperusahaan() {
        return Datanamaperusahaan;
    }

    public void setDatanamaperusahaan(String Datanamaperusahaan) {
        this.Datanamaperusahaan = Datanamaperusahaan;
    }

    public String getDatalocation() {
        return Datalocation;
    }

    public void setDatalocation(String Datalocation) {
        this.Datalocation = Datalocation;
    }

    public String getDataemail() {
        return Dataemail;
    }

    public void setDataemail(String Dataemail) {
        this.Dataemail = Dataemail;
    }

    public String getDatacontact() {
        return Datacontact;
    }

    public void setDatacontact(String Datacontact) {
        this.Datacontact = Datacontact;
    }

    public String getDatadeadline() {
        return Datadeadline;
    }

    public void setDatadeadline(String Datadeadline) {
        this.Datadeadline = Datadeadline;
    }

    public String getDatagambar() {
        return Datagambar;
    }

    public void setDatagambar(String Datagambar) {
        this.Datagambar = Datagambar;
    }

    public String getDataid_Postingan() {
        return Dataid_Postingan;
    }

//   private int Dataid_Postingan;
    public void setDataid_Postingan(String Dataid_Postingan) {
        this.Dataid_Postingan = Dataid_Postingan;
    }
    private String Dataid_Postingan;
   private String Username;
   private String DataJudulPosting;
   private String Datadeskripsi;
   private String Datapays;
   private String Datacilent;
   private String Datanamaperusahaan;
   private String Datalocation;
   private String Dataemail;
   private String Datacontact;
   private String Datadeadline; 
   private String Datagambar;
              public ArrayList AdminPosting() {
   query = "SELECT c. *,c.username,p.id_postingan ,p.judul_posting,p.deskripsi,p.pays,p.cilent, p.nama_perusahaan,p.location,p.email,p.contact ,p.deadline, p.logo FROM tbl_user c JOIN tbl_postingan_user p ON c.id_user = p.id_user";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        adminposting = new ArrayList <AdminModel>();
        try{ 
          while(rsData.next()){
             AdminModel adatapost=new AdminModel();
          adatapost.setDataid_Postingan(rsData.getString(9));
          adatapost.setUsername(rsData.getString(2));
          adatapost.setDataJudulPosting(rsData.getString(10));
          adatapost.setDatadeskripsi(rsData.getString(11));
          adatapost.setDatapays(rsData.getString(12));
          adatapost.setDatacilent(rsData.getString(13));
          adatapost.setDatanamaperusahaan(rsData.getString(14));
          adatapost.setDatalocation(rsData.getString(15));
          adatapost.setDataemail(rsData.getString(16));
          adatapost.setDatacontact(rsData.getString(17));
          adatapost.setDatadeadline(rsData.getString(18));
          adatapost.setDatagambar(rsData.getString(19));
         
          
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          adminposting.add(adatapost);
            }
        rsData.close();
          return adminposting;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}

    public String getIdlist() { 
        return idlist;
    }

    public void setIdlist(String idlist) {
        this.idlist = idlist;
    }
 
     
              
              private String  idlist;
//              private String namaperusahaan;
//              private String judulpostingan;
        
              
         public ArrayList AdminPekerjaAktiv() {
   query = "SELECT c. *,p.nama_perusahaan, p.judul_posting, u.username, p.deadline FROM tbl_postingan_user p JOIN tbl_list_kerja c ON c.id_postingan = p.id_postingan JOIN tbl_user u ON c.id_user = u.id_user";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        adminpekaktif = new ArrayList <AdminModel>();
        try{ 
          while(rsData.next()){
             AdminModel datapaktif=new AdminModel();
          datapaktif.setIdlist(rsData.getString(1));
          datapaktif.setDatanamaperusahaan(rsData.getString(4));
          datapaktif.setDataJudulPosting(rsData.getString(5));
          datapaktif.setUsername(rsData.getString(6));
           datapaktif.setDatadeadline(rsData.getString(7));
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          adminpekaktif.add(datapaktif);
            }
        rsData.close();
          return adminpekaktif;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}   
         
//Data Catatan
         
    public String getId_catatan_user() {
        return id_catatan_user;
    }

    public void setId_catatan_user(String id_catatan_user) {
        this.id_catatan_user = id_catatan_user;
    }

    public String getCatatan() {
        return Catatan;
    }

    public void setCatatan(String Catatan) {
        this.Catatan = Catatan;
    }
         
         private String id_catatan_user;
//         private int id_postingan;
         private String Catatan;
//         private String Username;
         
         
                  public ArrayList AdminCatatanPekerja() {
   query = "SELECT c. *, u.username, p.judul_posting, p.nama_perusahaan, p.deadline FROM tbl_catatan_user c JOIN tbl_postingan_user p ON c.id_postingan = p.id_postingan JOIN tbl_user u ON c.id_user = u.id_user";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        admincatatan = new ArrayList <AdminModel>();
        try{ 
          while(rsData.next()){
             AdminModel datacatatan=new AdminModel();
          datacatatan.setId_catatan_user(rsData.getString(1));
          datacatatan.setId_user(rsData.getString(2));
          datacatatan.setDataid_Postingan(rsData.getString(3));
          datacatatan.setCatatan(rsData.getString(4));
          datacatatan.setUsername(rsData.getString(5));
          datacatatan.setDataJudulPosting(rsData.getString(6));
          datacatatan.setDatanamaperusahaan(rsData.getString(7));
          datacatatan.setDatadeadline(rsData.getString(8));
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          admincatatan.add(datacatatan);
            }
        rsData.close();
          return admincatatan;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post catatan");
                 return null;
      }
        
    }         
      return null;
}   
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      
         
              //Hapus User
    public int getId_userd() {
        return id_userd;
    }


    public void setId_userd(int id_userd) {
        this.id_userd = id_userd;
    }
         private int id_userd;
         
         
          public boolean deleteUser(){
              
 query= "DELETE from tbl_user WHERE id_user = '"+id_userd+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }

    public int getId_postingand() {
        return id_postingand;
    }

    //Hapus Post
    public void setId_postingand(int id_postingand) {
        this.id_postingand = id_postingand;
    }
          
           private int id_postingand;
public boolean deletePost(){
              
 query= "DELETE from tbl_postingan_user WHERE id_postingan = '"+id_postingand+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }
     
//Hapus PekerjaAktif

    public int getIdlistd() {
        return idlistd;
    }

    public void setIdlistd(int idlistd) {
        this.idlistd = idlistd;
    }

    private int idlistd;
    public boolean deletePaktif(){
              
 query= "DELETE from tbl_list_kerja WHERE id_list = '"+idlistd+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }

        //Hapus Catatan
    public int getIdcatatan() {
        return idcatatan;
    }


    public void setIdcatatan(int idcatatan) {
        this.idcatatan = idcatatan;
    }
        private int idcatatan;
        
            public boolean deleteCatatan(){
              
 query= "DELETE from tbl_catatan_user WHERE id_catatan_user = '"+idcatatan+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
        
            }
    
}
