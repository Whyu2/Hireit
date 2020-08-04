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
public class AdminTabelBisnis extends AbstractTableModel{
       List<AdminModel> adminbisnis;
     
       public AdminTabelBisnis(ArrayList<AdminModel> lsData){
        this.adminbisnis = lsData;
    }

    @Override
    public int getRowCount() {
            return  this.adminbisnis.size();  //To change body of generated methods, choose Tools | Templates.
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
                return adminbisnis.get(rowIndex).getId_user();
            case 1 :
                return adminbisnis.get(rowIndex).getUsername();
             case 2 :
                return adminbisnis.get(rowIndex).getPassword();
              case 3 :
                return adminbisnis.get(rowIndex).getEmail();
             case 4 :
                return adminbisnis.get(rowIndex).getHp();
               case 5 :
                return adminbisnis.get(rowIndex).getKeahlian();
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}
