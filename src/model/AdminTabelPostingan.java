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
public class AdminTabelPostingan extends AbstractTableModel{

     List<AdminModel> adminposting;
     
       public AdminTabelPostingan(ArrayList<AdminModel> lsData){
        this.adminposting = lsData;
    }

    @Override
    public int getRowCount() {
            return  this.adminposting.size();  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
       return 12; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column)
    {
        switch (column)
        {
            case 0 :
                return "ID Postingan";
            case 1 :
                 return "Username";
            case 2 :
                 return "Judul Pekerjaan";
             case 3 :
                 return "Deskripsi";
              case 4 :
                 return "Pays";
              case 5 :
                 return "Client";
              case 6 :
                 return "Nama Perusahaan";
              case 7 :
                 return "Location";
              case 8 :
                 return "Email";
              case 9 :
                 return "Contact";
              case 10 :
                 return "Deadline";
              case 11:
                 return "Logo";
      
     
            default:    
                return null;
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex)
        {
            case 0 :
                return adminposting.get(rowIndex).getDataid_Postingan();
            case 1 :
                return adminposting.get(rowIndex).getUsername();
             case 2 :
                return adminposting.get(rowIndex).getDataJudulPosting();
              case 3 :
                return adminposting.get(rowIndex).getDatadeskripsi();
             case 4 :
                return adminposting.get(rowIndex).getDatapays();
              case 5 :
                return adminposting.get(rowIndex).getDatacilent();
              case 6 :
                 return  adminposting.get(rowIndex).getDatanamaperusahaan();
              case 7 :
                 return  adminposting.get(rowIndex).getDatalocation();
              case 8 :
                 return  adminposting.get(rowIndex).getDataemail();
              case 9 :
                 return  adminposting.get(rowIndex).getDatacontact();
              case 10 :
                 return  adminposting.get(rowIndex).getDatadeadline();
              case 11:
                 return adminposting.get(rowIndex).getDatagambar();
            default:
                return null;
        }
    
         
         
         
    } //To chan
    
    
}
