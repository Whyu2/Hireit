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
public class CatatanModel {
    
    private String query;
    private boolean hasil; 
    private ResultSet rsData;
    private DatabaseConnection dbConn;
    private ArrayList listdatacacatan;

    
    public CatatanModel(){
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



    //Insert CATATAN
 public int getIdPostingan() {
        return idPostingan;
    }

    public void setIdPostingan(int idPostingan) {
        this.idPostingan = idPostingan;
    }
    

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    
 
    private int idPostingan;
    private String catatan;

  
 public boolean insertCatatan(){
      query = "INSERT INTO tbl_catatan_user (id_user,id_postingan,Catatan) VALUES ('"+UserModel.getId_user()+"','"+idPostingan+"','"+catatan+"')";
    hasil = dbConn.executeQuery(query, false);
       
    return hasil;  
}   
    
 //Data Catatan Member

//    public int getDataid_catatan_user() {
//        return Dataid_catatan_user;
//    }
//
//    public void setDataid_catatan_user(int Dataid_catatan_user) {
//        this.Dataid_catatan_user = Dataid_catatan_user;
//    }

    public int getDataid_user() {
        return Dataid_user;
    }

    public void setDataid_user(int Dataid_user) {
        this.Dataid_user = Dataid_user;
    }

    public int getDataid_posting() {
        return Dataid_posting;
    }

    public void setDataid_posting(int Dataid_posting) {
        this.Dataid_posting = Dataid_posting;
    }

    public String getDatacatatan() {
        return Datacatatan;
    }

    public void setDatacatatan(String Datacatatan) {
        this.Datacatatan = Datacatatan;
    }

    public String getDatajudulposting() {
        return Datajudulposting;
    }

    public void setDatajudulposting(String Datajudulposting) {
        this.Datajudulposting = Datajudulposting;
    }
 
    public String getDatanamaperusahaan() {
        return Datanamaperusahaan;
    }

    public void setDatanamaperusahaan(String Datanamaperusahaan) {
        this.Datanamaperusahaan = Datanamaperusahaan;
    }

    public String getDatadealtine() {
        return Datadealtine;
    }

    public void setDatadealtine(String Datadealtine) {
        this.Datadealtine = Datadealtine;
    }

    public String getDataid_catatan_user() {
        return Dataid_catatan_user;
    }

//  private int Dataid_catatan_user;
    public void setDataid_catatan_user(String Dataid_catatan_user) {
        this.Dataid_catatan_user = Dataid_catatan_user;
    }
  private String Dataid_catatan_user;  
  private int Dataid_user;
  private int Dataid_posting;
  private String Datacatatan;
  private String Datajudulposting;
  private String Datanamaperusahaan;
  private String Datadealtine;
  
  public ArrayList DataCatatan() {
   query = "SELECT c. *, p.judul_posting, p.nama_perusahaan, p.deadline FROM tbl_catatan_user c JOIN tbl_postingan_user p ON c.id_postingan = p.id_postingan WHERE c.id_user = "+UserModel.getId_user()+" ";
           
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        listdatacacatan = new ArrayList <CatatanModel>();
        try{ 
          while(rsData.next()){
          CatatanModel datacatatan=new CatatanModel();
          datacatatan.setDataid_catatan_user(rsData.getString(1));
          datacatatan.setDataid_user(rsData.getInt(2));
          datacatatan.setDataid_posting(rsData.getInt(3));
          datacatatan.setDatacatatan(rsData.getString(4));
          datacatatan.setDatajudulposting(rsData.getString(5));
          datacatatan.setDatanamaperusahaan(rsData.getString(6));
          datacatatan.setDatadealtine(rsData.getString(7));
          listdatacacatan.add(datacatatan);
            }
        rsData.close();
          return listdatacacatan;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}

  
      //Edit CATATAN
    public int getId_catatan_edit() {
        return Id_catatan_edit;
    }

    public void setId_catatan_edit(int Id_catatan_edit) {
        this.Id_catatan_edit = Id_catatan_edit;
    }

    public String getCatatan_user_edit() {
        return catatan_user_edit;
    }


    public void setCatatan_user_edit(String catatan_user_edit) {
        this.catatan_user_edit = catatan_user_edit;
    }


   
   private int Id_catatan_edit;
   private String catatan_user_edit;  

 
   
   
 public boolean updatecatatan(){
 query= "UPDATE tbl_catatan_user set Catatan = '"+catatan_user_edit+"' where id_catatan_user = '"+Id_catatan_edit+"'";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }
 
 public boolean deletecatatan(){
 query= "DELETE from tbl_catatan_user WHERE id_catatan_user = '"+Id_catatan_edit+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }
 
 
}
