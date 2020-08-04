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
public class AdminTabelCatatan extends AbstractTableModel{
 List<AdminModel> admincatatan;
     
       public AdminTabelCatatan(ArrayList<AdminModel> lsData){
        this.admincatatan = lsData;
    }
       @Override
    public int getRowCount() {
            return  this.admincatatan.size();  //To change body of generated methods, choose Tools | Templates.
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
                return "Id catatan";
            case 1 :
                return "Username";
            case 2 :
                 return "Catatan";
            case 3 :
                 return "Judul Pekerjaan";
             case 4 :
                 return "Nama Perusahaan";
            case 5 :
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
                return admincatatan.get(rowIndex).getId_catatan_user();
            case 1 :
                return admincatatan.get(rowIndex).getUsername();
            case 2 :
                return admincatatan.get(rowIndex).getCatatan();
             case 3 :
                return admincatatan.get(rowIndex).getDataJudulPosting();
              case 4 :
                return admincatatan.get(rowIndex).getDatanamaperusahaan();
              case 5 :
                return admincatatan.get(rowIndex).getDatadeadline();
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}