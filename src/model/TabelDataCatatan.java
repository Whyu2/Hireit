/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MELON
 */
public class TabelDataCatatan extends AbstractTableModel{
     List<CatatanModel> listdatacacatan;
     
       public TabelDataCatatan(ArrayList<CatatanModel> lsData){
        this.listdatacacatan = lsData;
    }
    @Override
    public int getRowCount() {
            return  this.listdatacacatan.size();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
       return 4; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column)
        {
            case 0 :
                return "Catatan";
            case 1 :
                 return "Judul Pekerjaan";
            case 2 :
                 return "Nama Perusahaan";
             case 3 :
                 return "Deadline";
            default:    
                return null;
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex)
        {
            case 0 :
                return listdatacacatan.get(rowIndex).getDatacatatan();
            case 1 :
                return listdatacacatan.get(rowIndex).getDatajudulposting();
             case 2 :
                return listdatacacatan.get(rowIndex).getDatanamaperusahaan();
              case 3 :
                return listdatacacatan.get(rowIndex).getDatadealtine();
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}
