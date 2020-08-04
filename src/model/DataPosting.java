/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.DatabaseConnection;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MELON
 */
public class DataPosting {
    private DatabaseConnection dbConn;
    private String query;
    private boolean hasil; 
    private ResultSet rsData;
    private ArrayList listdata;
    private ArrayList listdatasingle;
    private ResultSet rsUser;

    public DataPosting(){
    dbConn = new DatabaseConnection();
    dbConn.getConn();
    }

    public int getDataid_posting() {
        return Dataid_posting;
    }

    public void setDataid_posting(int Dataid_posting) {
        this.Dataid_posting = Dataid_posting;
    }

    public int getDataid_admin() {
        return Dataid_admin;
    }

    public void setDataid_admin(int Dataid_admin) {
        this.Dataid_admin = Dataid_admin;
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

 

    public String getDatadeadline() {
        return Datadeadline;
    }

    public void setDatadeadline(String Datadeadline) {
        this.Datadeadline = Datadeadline;
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
    
     public String getDataJudulPosting() {
        return DataJudulPosting;
    }

    public void setDataJudulPosting(String DataJudulPosting) {
        this.DataJudulPosting = DataJudulPosting;
    }
    
      public String getDatanamaperusahaan() {
        return Datanamaperusahaan;
    }

    public void setDatanamaperusahaan(String Datanamaperusahaan) {
        this.Datanamaperusahaan = Datanamaperusahaan;
    }
    
      public String getDatagambar() {
        return Datagambar;
    }

    public void setDatagambar(String Datagambar) {
        this.Datagambar = Datagambar;
    }
 
    
   private int Dataid_posting;   
   private int Dataid_admin;
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
  //Data Post semua User
 public ArrayList DataPost() {
   query = "SELECT * from  tbl_postingan_user";
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        listdata = new ArrayList <DataPosting>();
        try{ 
          while(rsData.next()){
          DataPosting datapost=new DataPosting();
          datapost.setDataid_posting(rsData.getInt(1));
          datapost.setDataid_admin(rsData.getInt(2));
          datapost.setDataJudulPosting(rsData.getString(3));
          datapost.setDatadeskripsi(rsData.getString(4));
          datapost.setDatapays(rsData.getString(5));
          datapost.setDatacilent(rsData.getString(6));
          datapost.setDatanamaperusahaan(rsData.getString(7));
          datapost.setDatalocation(rsData.getString(8));
          datapost.setDataemail(rsData.getString(9));
          datapost.setDatacontact(rsData.getString(10));
          datapost.setDatadeadline(rsData.getString(11));
          datapost.setDatagambar(rsData.getString(12));
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          listdata.add(datapost);
            }
        rsData.close();
          return listdata;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}

 private int id_posting;
 private int id_user;
 
    public int getId_posting() {
        return id_posting;
    }

    public void setId_posting(int id_posting) {
        this.id_posting = id_posting;
    }

    public int getId_user() {
        return id_user;
    }

    //Insert Posting ke List User
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
     public boolean insertList(){
      query = "INSERT INTO tbl_list_kerja (id_postingan,id_user) VALUES ('"+id_posting+"','"+UserModel.getId_user()+"')";
    hasil = dbConn.executeQuery(query, false);
       
    return hasil;  
}   
    
 //Data Post User Single

    public int getDataid_postingBisnis() {
        return Dataid_postingBisnis;
    }

    public void setDataid_postingBisnis(int Dataid_postingBisnis) {
        this.Dataid_postingBisnis = Dataid_postingBisnis;
    }

    public int getDataid_adminBisnis() {
        return Dataid_adminBisnis;
    }

    public void setDataid_adminBisnis(int Dataid_adminBisnis) {
        this.Dataid_adminBisnis = Dataid_adminBisnis;
    }

    public String getDataJudulPostingBisnis() {
        return DataJudulPostingBisnis;
    }

    public void setDataJudulPostingBisnis(String DataJudulPostingBisnis) {
        this.DataJudulPostingBisnis = DataJudulPostingBisnis;
    }

    public String getDatadeskripsiBisnis() {
        return DatadeskripsiBisnis;
    }

    public void setDatadeskripsiBisnis(String DatadeskripsiBisnis) {
        this.DatadeskripsiBisnis = DatadeskripsiBisnis;
    }

    public String getDatapaysBisnis() {
        return DatapaysBisnis;
    }

    public void setDatapaysBisnis(String DatapaysBisnis) {
        this.DatapaysBisnis = DatapaysBisnis;
    }

    public String getDatacilentBisnis() {
        return DatacilentBisnis;
    }

    public void setDatacilentBisnis(String DatacilentBisnis) {
        this.DatacilentBisnis = DatacilentBisnis;
    }

    public String getDatanamaperusahaanBisnis() {
        return DatanamaperusahaanBisnis;
    }

    public void setDatanamaperusahaanBisnis(String DatanamaperusahaanBisnis) {
        this.DatanamaperusahaanBisnis = DatanamaperusahaanBisnis;
    }

    public String getDatalocationBisnis() {
        return DatalocationBisnis;
    }

    public void setDatalocationBisnis(String DatalocationBisnis) {
        this.DatalocationBisnis = DatalocationBisnis;
    }

    public String getDataemailBisnis() {
        return DataemailBisnis;
    }

    public void setDataemailBisnis(String DataemailBisnis) {
        this.DataemailBisnis = DataemailBisnis;
    }

    public String getDatacontactBisnis() {
        return DatacontactBisnis;
    }

    public void setDatacontactBisnis(String DatacontactBisnis) {
        this.DatacontactBisnis = DatacontactBisnis;
    }

    public String getDatadeadlineBisnis() {
        return DatadeadlineBisnis;
    }

    public void setDatadeadlineBisnis(String DatadeadlineBisnis) {
        this.DatadeadlineBisnis = DatadeadlineBisnis;
    }

    public String getDatagambarBisnis() {
        return DatagambarBisnis;
    }

    public void setDatagambarBisnis(String DatagambarBisnis) {
        this.DatagambarBisnis = DatagambarBisnis;
    }
     
   private int Dataid_postingBisnis;   
   private int Dataid_adminBisnis;
   private String DataJudulPostingBisnis;
   private String DatadeskripsiBisnis;
   private String DatapaysBisnis;
   private String DatacilentBisnis;
   private String DatanamaperusahaanBisnis;
   private String DatalocationBisnis;
   private String DataemailBisnis;
   private String DatacontactBisnis;
   private String DatadeadlineBisnis; 
   private String DatagambarBisnis;
     
 public ArrayList DataPostSingle() {
   query = "SELECT * from  tbl_postingan_user WHERE id_user = "+UserModel.getId_user()+" ";
   hasil = dbConn.executeQuery(query, true);
   
    if (hasil){
        rsData = dbConn.getRs();
        listdatasingle = new ArrayList <DataPosting>();
        try{ 
          while(rsData.next()){
          DataPosting datapostsingle=new DataPosting();
          datapostsingle.setDataid_postingBisnis(rsData.getInt(1));
          datapostsingle.setDataid_adminBisnis(rsData.getInt(2));
          datapostsingle.setDataJudulPostingBisnis(rsData.getString(3));
          datapostsingle.setDatadeskripsiBisnis(rsData.getString(4));
          datapostsingle.setDatapaysBisnis(rsData.getString(5));
          datapostsingle.setDatacilentBisnis(rsData.getString(6));
          datapostsingle.setDatanamaperusahaanBisnis(rsData.getString(7));
          datapostsingle.setDatalocationBisnis(rsData.getString(8));
          datapostsingle.setDataemailBisnis(rsData.getString(9));
          datapostsingle.setDatacontactBisnis(rsData.getString(10));
          datapostsingle.setDatadeadlineBisnis(rsData.getString(11));
          datapostsingle.setDatagambarBisnis(rsData.getString(12));
//          datapost.setDatadeskripsi(rsData.getString("deadline"));
        
          listdatasingle.add(datapostsingle);
            }
        rsData.close();
          return listdatasingle;
        }
        catch(SQLException ex){
            System.out.println("Terjadi Kesalahan Saat menampilkan Post User");
                 return null;
      }
        
    }         
      return null;
}
 
 
    
 
  public boolean deletposting(){
 query= "DELETE FROM tbl_postingan_user WHERE id_postingan = '"+id_posting+"' ";
 hasil = dbConn.executeQuery(query, false);
    
   return hasil;    
 }
 
 
}
  


//          Dataid_posting  = rsData.getInt(1);
//          Dataid_admin  = rsData.getInt(2);
//          Datadeskripsi = rsData.getString(3);
//          Datapays = rsData.getString(4);
//          Datacilent = rsData.getString(5);
//          Dataommission = rsData.getString(6);
//          Datadeadline = rsData.getString(7);
//          Datalocation= rsData.getString(8);
//          Dataemail= rsData.getString(9);
//          Datacontact= rsData.getString(10);