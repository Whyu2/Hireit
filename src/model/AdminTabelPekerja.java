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
public class AdminTabelPekerja extends AbstractTableModel{
     List<AdminModel> adminpekerja;
     
       public AdminTabelPekerja(ArrayList<AdminModel> lsData){
        this.adminpekerja = lsData;
    }

    @Override
    public int getRowCount() {
            return  this.adminpekerja.size();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
       return 6; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column)
        {
            case 0 :
                return "Id_user";
            case 1 :
                 return "Username";
            case 2 :
                 return "Password";
             case 3 :
                 return "Email";
              case 4 :
                 return "Nomor Hp";
              case 5 :
                 return "Keahlian";
     
            default:    
                return null;
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex)
        {
            case 0 :
                return adminpekerja.get(rowIndex).getId_user();
            case 1 :
                return adminpekerja.get(rowIndex).getUsername();
             case 2 :
                return adminpekerja.get(rowIndex).getPassword();
              case 3 :
                return adminpekerja.get(rowIndex).getEmail();
             case 4 :
                return adminpekerja.get(rowIndex).getHp();
               case 5 :
                return adminpekerja.get(rowIndex).getKeahlian();
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}
