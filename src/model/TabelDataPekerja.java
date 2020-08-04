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
public class TabelDataPekerja extends AbstractTableModel  {
List<ListPekerjaModel> listdatakerja;

    public TabelDataPekerja(ArrayList<ListPekerjaModel> lsData){
        this.listdatakerja = lsData;
    }

   @Override
    public int getRowCount() {
            return  this.listdatakerja.size();  
    }

    @Override
    public int getColumnCount() {
       return 5; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column)
        {
            case 0 :
                return "Username";
            case 1 :
                 return "Email";
            case 2 :
                 return "No Hp";
             case 3 :
                 return "Keahlian";
              case 4 :
                 return "Judul Pekerjaan";
            default:    
                return null;
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex)
        {
            case 0 :
                return listdatakerja.get(rowIndex).getUsername();
            case 1 :
                return listdatakerja.get(rowIndex).getEmail();
             case 2 :
                return listdatakerja.get(rowIndex).getNohp();
              case 3 :
                return listdatakerja.get(rowIndex).getKeahlian();
              case 4 :
                return listdatakerja.get(rowIndex).getJudul_posting();
            default:
                return null;
        }
    
         
         
         
    } //To c
    
}
