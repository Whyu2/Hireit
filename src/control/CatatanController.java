/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.CatatanModel;
import model.DataPosting;
import model.ListPekerjaanModel;
import model.TabelDataCatatan;

import view.Catatan;

/**
 *
 * @author MELON
 */
public class CatatanController {
    private Catatan catatanView;
    private CatatanModel catatanmodel;
//    private DataPosting dataposting;
    private ListPekerjaanModel listpekerjaanmodel;
    private ArrayList <CatatanModel> listdatacacatan;
//    private ArrayList <ListPekerjaanModel> listdatakerja;
  
    

    
    public CatatanController(Catatan catatanView){
   this.catatanView = catatanView;
//    dataposting = new DataPosting();
    listpekerjaanmodel = new ListPekerjaanModel();
    catatanmodel = new CatatanModel();
    }

 //Tampilan Data mentahan ke Combo BOX
    public ArrayList DataKerjaan()
    {
//    return dataposting.DataPost();
    return listpekerjaanmodel.DataKerjaan();
    }
    
//Isi ke tabel setelah simpan / edit
      public void isiTableCatatan()
    {
    listdatacacatan = catatanmodel.DataCatatan();
    TabelDataCatatan tblData= new TabelDataCatatan(listdatacacatan);
    catatanView.getTabelDataCatatan().setModel(tblData);
    }
      
//ISI field ke textBox
     public void isiField(int row) {
        catatanView.getTxtDataCatatan().setText(listdatacacatan.get(row).getDatacatatan()); 
        catatanView.getTxtidcatatan().setText(listdatacacatan.get(row).getDataid_catatan_user());
//catatanView.getlabelDataCatatan().setText(listdatacacatan.get(row).getDatacatatan());
    }

    //Insert
       public void DataPosting(
         int idPostingan,String catatan ){
         catatanmodel.setIdPostingan(idPostingan);
         catatanmodel.setCatatan(catatan);
       } 
     
     
        public boolean insertCatatan(){
        return catatanmodel.insertCatatan();
        }
//Update
        public void DataCatatan(
          int idCatatan,String Catatan_user ){
          catatanmodel.setId_catatan_edit(idCatatan);
          catatanmodel.setCatatan_user_edit(Catatan_user);
        }
        
      public boolean updateCatatan(){
        return catatanmodel.updatecatatan();
        }
     
//Delete
       public boolean deleteCatatan(){
        return catatanmodel.deletecatatan();
        }
     
}
//   
   
