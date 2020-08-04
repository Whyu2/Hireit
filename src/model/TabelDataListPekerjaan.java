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
public class TabelDataListPekerjaan extends AbstractTableModel  {
List<ListPekerjaanModel> listdatakerjaan;

 public TabelDataListPekerjaan(ArrayList<ListPekerjaanModel> lsData){
        this.listdatakerjaan = lsData;
    }

   @Override
    public int getRowCount() {
            return  this.listdatakerjaan.size();  //To change body of generated methods, choose Tools | Templates.
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
                return "Judul Pekerjaan";
            case 1 :
                 return "Nama Perusahaan";
            case 2 :
                 return "Deskripsi";
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
                return listdatakerjaan.get(rowIndex).getJudul();
            case 1 :
                return listdatakerjaan.get(rowIndex).getNama_perusahaan();
             case 2 :
                return listdatakerjaan.get(rowIndex).getDeskripsi();
              case 3 :
                return listdatakerjaan.get(rowIndex).getDeadline();
            default:
                return null;
        }
    
         
         
         
    } //To c
    
}
