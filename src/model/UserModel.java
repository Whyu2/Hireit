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
public class UserModel {
    private DatabaseConnection dbConn;
    private String query;
    private boolean hasil; 
    private ResultSet rsUser;
    
    public UserModel(){
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
    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }
   
   private String username;
   private String password;
   private String email;
   private String hp;
   private String keahlian;
   private int level ;
 
      public boolean UpdateUser(){
        query = "UPDATE tbl_user SET username  = '"+username+"', password = '"+password+"', email = '"+email+"',nohp = '"+hp+"', keahlian = '"+keahlian+"', level = '"+level+"' WHERE id_user = "+UserModel.getId_user()+"";
    hasil = dbConn.executeQuery(query, false);
    return hasil; 
    }
   
      public boolean LoginUser(){
       query = "SELECT * from tbl_user WHERE username = '" + username + "'"
               + "AND password = '" + password + "'";
       hasil = dbConn.executeQuery(query, true);
       
       if (hasil){
          rsUser = dbConn.getRs();
         
          try {
          rsUser.next();
          id_user = rsUser.getInt(1);
          usernameUser = rsUser.getString(2);
          passwordUser = rsUser.getString(3);
          emailUser = rsUser.getString(4);
          nohpUser = rsUser.getString(5);
          keahlianUser = rsUser.getString(6);
          levelUser = rsUser.getInt(7);
           if (usernameUser == null) {
               hasil = false;
           } else {
            hasil = true;
           }
          
          } catch (SQLException e){
              hasil = false;
          }
       }        
       return hasil;
}

  


       public static int getId_user() {
        return id_user;
    }

    public static void setId_user(int id_user) {
        UserModel.id_user = id_user;
    }

    public static String getUsernameUser() {
        return usernameUser;
    }

    public static void setUsernameUser(String usernameUser) {
        UserModel.usernameUser = usernameUser;
    }

    public static String getPasswordUser() {
        return passwordUser;
    }

    public static void setPasswordUser(String passwordUser) {
        UserModel.passwordUser = passwordUser;
    }

    public static String getEmailUser() {
        return emailUser;
    }

    public static void setEmailUser(String emailUser) {
        UserModel.emailUser = emailUser;
    }

    public static String getNohpUser() {
        return nohpUser;
    }

    public static void setNohpUser(String nohpUser) {
        UserModel.nohpUser = nohpUser;
    }

//    public static String getLevelUser() {
//        return levelUser;
//    }
//
//    public static void setLevelUser(String levelUser) {
//        UserModel.levelUser = levelUser;
//    }
       public static String getKeahlianUser() {
        return keahlianUser;
    }

    public static void setKeahlianUser(String keahlianUser) {
        UserModel.keahlianUser = keahlianUser;
    }
    
       public static int getLevelUser() {
        return levelUser;
    }

//   private static String levelUser;
    public static void setLevelUser(int levelUser) {
        UserModel.levelUser = levelUser;
    }
 
   private static int id_user;
   private static String usernameUser;
   private static String passwordUser;
   private static String emailUser;
   private static String nohpUser;
   private static String keahlianUser;
   private static int levelUser;
 
    public boolean insertUser(){
       query = "INSERT INTO tbl_user (username,password,email,nohp,keahlian,level) VALUES ('"+username+"','"+password+"','"+email+"','"+hp+"','"+keahlian+"','"+level+"')";
       hasil = dbConn.executeQuery(query, false);
       
    return hasil;  
    }
    
 
    
}
   
   
  
    

   
   

    



    

