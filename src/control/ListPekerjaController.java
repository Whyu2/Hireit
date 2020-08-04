/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.ListPekerjaModel;
import model.TabelDataPekerja;
import view.ListPekerja;

/**
 *
 * @author MELON
 */
public class ListPekerjaController {
     private ListPekerja listpekerjaView;
     private ListPekerjaModel listpekerjamodel;
     private  ArrayList <ListPekerjaModel> listdatakerja;
     
     
         public ListPekerjaController(ListPekerja listpekerjaanView){
        this.listpekerjaView = listpekerjaanView;
        listpekerjamodel = new ListPekerjaModel();
    }
     
             public void isiTabellistpekerja()
    {
    listdatakerja = listpekerjamodel.DataPekerja();
    TabelDataPekerja tblData= new TabelDataPekerja(listdatakerja);
    listpekerjaView.getTabelDataListPekerja().setModel(tblData);
    }
     //isi field
      public void isiid(int row) {
       listpekerjaView.getTxtidkerja().setText(listdatakerja.get(row).getId_list());
        }
      
      //delete
          public void DataListKerja(
          int idListkerja){
         listpekerjamodel.setId_list_delete(idListkerja);
        }
          
      public boolean deletepekerja(){
        return listpekerjamodel.deletepekerja();
        }

}
