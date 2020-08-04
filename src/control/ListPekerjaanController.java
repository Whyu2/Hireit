/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.util.ArrayList;
import model.CatatanModel;
import model.ListPekerjaanModel;
import model.TabelDataListPekerjaan;
import view.ListPekerjaan;


/**
 *
 * @author MELON
 */
public class ListPekerjaanController {
    private ListPekerjaan listpekerjaanView;
     private CatatanModel catatanmodel;
     private ListPekerjaanModel listmodel;
     private ArrayList <ListPekerjaanModel> listdatakerjaan;
 
     
    
      public ListPekerjaanController(ListPekerjaan listpekerjaanView){
        this.listpekerjaanView = listpekerjaanView;
        listmodel = new ListPekerjaanModel();
    }
       public ListPekerjaanController(CatatanModel catatanmodelView){
        this.catatanmodel = catatanmodel;
        listmodel = new ListPekerjaanModel();
    }
      
      
      
      
     
       public void isiTabellist()
    {
    listdatakerjaan = listmodel.DataKerjaan();
    TabelDataListPekerjaan tblData= new TabelDataListPekerjaan(listdatakerjaan);
    listpekerjaanView.getTabelDataListPekerja().setModel(tblData);
    }
    //Tambah ke list 
        
  //isilistid
        public void isiid(int row) {
       listpekerjaanView.getTxtidpost().setText(listdatakerjaan.get(row).getId_list());
        listpekerjaanView.getTxtjudul().setText(listdatakerjaan.get(row).getJudul());
         listpekerjaanView.getTxtnamap().setText(listdatakerjaan.get(row).getNama_perusahaan());
        listpekerjaanView.getTxtlokasi().setText(listdatakerjaan.get(row).getLocation());
          listpekerjaanView.getTxtemail().setText(listdatakerjaan.get(row).getEmail());
          listpekerjaanView.getTxtkontak().setText(listdatakerjaan.get(row).getContact());
           listpekerjaanView.getTxtdeadline().setText(listdatakerjaan.get(row).getDeadline());
            listpekerjaanView.getTxtdeskripsi().setText(listdatakerjaan.get(row).getDeskripsi());
          
        }
        
              public void DataList(
          int idList){
          listmodel.setId_list_delete(idList);
      
        }
        

       public boolean deletlist(){
        return listmodel.deletelist();
        }
    //single
    
//        public ArrayList DataKerjaan1(){
//         return listmodel.DataKerjaan1();
//    }
//        
  
     
        
        
//          public ArrayList DataKerjaan1(int id_list1){
//        listmodel.setId_list1(id_list1);
//   
//        return listmodel.DataKerjaan1();
//    }
//          
          //delete
       

}
