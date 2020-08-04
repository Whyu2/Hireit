/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package control;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import model.DataPosting;
import model.TabelDataPost;
import model.TabelDataPostSingle;
import view.ListPostinganSingle;
import view.Temukan;


/**
 *
 * @author MELON
 */
public class DataPostController {
    
    
    private DataPostController dataposcontrol;
    private String [] tabelHeader;
    private DefaultTableModel dtm;
    private Temukan viewtemukan;
    private ListPostinganSingle listpostingsingleView;
    private DataPosting dataposting;
    private ArrayList <DataPosting> listdata;
    private ArrayList <DataPosting> listdatasingle;

   
  
  
//        public void isiTable() {
//       listdata = dataposting.DataPost();
//       TabelDataPost tblData = new TabelDataPost(listdata);
//    
//    }
     //Postingan ALL
    public DataPostController(Temukan viewtemukan){
        this.viewtemukan = viewtemukan;
        dataposting = new DataPosting();
    }
        public ArrayList DataPost(){
         return dataposting.DataPost();
    }
    //Postingan SIngle
 public DataPostController(ListPostinganSingle listpostingsingleView){
        this.listpostingsingleView = listpostingsingleView;
        dataposting = new DataPosting();
    }
//         public void isiTableSingle() {
//       listdata = dataposting.DataPostSingle();
//       TabelDataPostSingle tblData = new TabelDataPostSingle(listdatasingle);
//  
//    }
            public ArrayList DataPostSingle(){
         return dataposting.DataPostSingle();
    }
 
 
     
    //Tambah ke list 
        
    public void DataList(
         int idPosting ){
         dataposting.setId_posting(idPosting);
       } 
    
      public boolean insertList(){
        return dataposting.insertList();
        }
      
      //hapus list
        public boolean deletposting(){
        return dataposting.deletposting();
        }

}
