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
public class AdminTabelPaktif extends AbstractTableModel{
 List<AdminModel> adminpekaktif;
     
       public AdminTabelPaktif(ArrayList<AdminModel> lsData){
        this.adminpekaktif = lsData;
    }
       @Override
    public int getRowCount() {
            return  this.adminpekaktif.size();  //To change body of generated methods, choose Tools | Templates.
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
                return "Id List";
            case 1 :
                 return "Nama Perusahaan";
            case 2 :
                 return "Judul Pekerjaan";
             case 3 :
                 return "Pekerja";
            case 4 :
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
                return adminpekaktif.get(rowIndex).getIdlist();
            case 1 :
                return adminpekaktif.get(rowIndex).getDatanamaperusahaan();
             case 2 :
                return adminpekaktif.get(rowIndex).getDataJudulPosting();
              case 3 :
                return adminpekaktif.get(rowIndex).getUsername();
              case 4 :
                return adminpekaktif.get(rowIndex).getDatadeadline();
      
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}