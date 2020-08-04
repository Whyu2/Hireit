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
public class ListPekerjaModel {
    private DatabaseConnection dbConn;
    private String query;
    private boolean hasil; 
    private ResultSet rsData;
    private ArrayList listdatakerja;
    
    public ListPekerjaModel(){
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

    public ArrayList getListdatakerja() {
        return listdatakerja;
    }

    public void setListdatakerja(ArrayList listdatakerja) {
        this.listdatakerja = listdatakerja;
    }

    public String getId_list() {
        return id_list;
    }

    public void setId_list(String id_list) {
        this.id_list = id_list;
    }

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

    public String getJudul_posting() {
        return judul_posting;
    }

    public void setJudul_posting(String judul_posting) {
        this.judul_posting = judul_posting;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    
    
    
    
    private String id_list;
    private int id_postingan;
    private int id_user;
    private String judul_posting;
    private String username;
    private String email;
    private String nohp;
    private String keahlian;
            
     public ArrayList DataPekerja()  {
     query = "SELECT c. *, p.judul_posting, u.username, u.email,u.nohp, u.keahlian FROM tbl_postingan_user p JOIN tbl_list_kerja c ON c.id_postingan = p.id_postingan JOIN tbl_user u ON c.id_user = u.id_user where p.id_user = '"+UserModel.getId_user()+"'";
            
     hasil = dbConn.executeQuery(query, true);
   
      if (hasil){
        rsData = dbConn.getRs();
        listdatakerja = new ArrayList <ListPekerjaModel>();
        try{ 
          while(rsData.next()){
          ListPekerjaModel datalistpekerja = new ListPekerjaModel();
          datalistpekerja.setId_list(rsData.getString(1));
          datalistpekerja.setId_postingan(rsData.getInt(2));
          datalistpekerja.setId_user(rsData.getInt(3));
          datalistpekerja.setJudul_posting(rsData.getString(4));
          datalistpekerja.setUsername(rsData.getString(5));
          datalistpekerja.setEmail(rsData.getString(6));
          datalistpekerja.setNohp(rsData.getString(7));
          datalistpekerja.setKeahlian(rsData.getString(8));

          listdatakerja.add(datalistpekerja);
            }
        rsData.close();
          return listdatakerja;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}
     
     
     
     
     public int getId__delete() {
        return Id_list_delete;
    }

    public void setId_list_delete(int Id_list_delete) {
        this.Id_list_delete = Id_list_delete;
    }

     
     
      private int Id_list_delete;
     
      public boolean deletepekerja(){
 query= "DELETE from tbl_list_kerja WHERE id_list = '"+Id_list_delete+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }
    
}
