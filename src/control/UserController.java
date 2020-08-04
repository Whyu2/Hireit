/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import model.UserModel;
import view.EditAkunBisnis;
import view.EditAkunUser;
import view.Login;
import view.Register;
/**
 *
 * @author MELON
 */
public class UserController {
    private Login loginView;
    private  EditAkunUser editView;
     private  EditAkunBisnis editbisnisView;
    private Register registerView;
    private UserModel usermodel;
    
    public UserController (Login LoginView){
    usermodel = new UserModel ();
    this.loginView = loginView;

    }
    
    public UserController (Register RegisterView){
    usermodel = new UserModel ();
    this.registerView = registerView;
    }
    
    public UserController (EditAkunUser editakunuserView){
     this.editView = editView;
    usermodel = new UserModel ();
  
    }
      public UserController (EditAkunBisnis editbisnisView){
     this.editbisnisView = editbisnisView;
    usermodel = new UserModel ();
  
    }
 
    
     public void DataUser(String username, String password, String email, String hp,String keahlian, int level){
        usermodel.setUsername (username);
        usermodel.setPassword (password);
        usermodel.setEmail (email);
        usermodel.setHp (hp);
        usermodel.setKeahlian (keahlian);
        usermodel.setLevel (level);
    }
   
        
        public boolean insertUser(){
        return usermodel.insertUser();
        }
     
        public boolean loginUser(String username, String password){
        usermodel.setUsername (username);
        usermodel.setPassword (password);
        return usermodel.LoginUser();
    }
   
       public void DataUser1(String username, String password, String email, String hp,String keahlian){
        usermodel.setUsername (username);
        usermodel.setPassword (password);
        usermodel.setEmail (email);
        usermodel.setHp (hp);
        usermodel.setKeahlian (keahlian);
    }
     
      public boolean UpdateUserr(){
        return usermodel.UpdateUser();
        }
              
    
}
  

