/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MELON
 */
public class PostingModel {
    private DatabaseConnection dbConn;
    private String query;
    private boolean hasil;
    private ResultSet rsUser;
  
    
    public PostingModel(){
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
  
    
    public ResultSet getRsUser() {
        return rsUser;
    }

    public void setRsUser(ResultSet rsUser) {
        this.rsUser = rsUser;
    }

    
    
    
    
   
    
    
    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCilent() {
        return cilent;
    }

    public void setCilent(String cilent) {
        this.cilent = cilent;
    }
      public String getNamaperusahaan() {
        return namaperusahaan;
    }

    public void setNamaperusahaan(String namaperusahaan) {
        this.namaperusahaan = namaperusahaan;
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
    
   private String id_admin;

    public String getJudulposting() {
        return judulposting;
    }

    public void setJudulposting(String judulposting) {
        this.judulposting = judulposting;
    }
    
        public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
        public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
   private String judulposting;
   private String deskripsi;
   private String pays;
   private String cilent;
   private String namaperusahaan;
   private String location;
   private String email;
   private String contact;
   private String deadline;
   private String logo;
   
   
   
      public boolean InsertPosting(){
       query = "INSERT INTO tbl_postingan_user (id_user,judul_posting,deskripsi,pays,cilent,nama_perusahaan,location,email,contact,deadline,logo) VALUES ('"+UserModel.getId_user()+"','"+judulposting+"','"+deskripsi+"','"+pays+"','"+cilent+"','"+namaperusahaan+"','"+location+"','"+email+"','"+contact+"','"+deadline+"','"+logo+"')";
       hasil = dbConn.executeQuery(query, false);
       
      return hasil;  
        }

   
  
   
      
   
   
   
    
}
