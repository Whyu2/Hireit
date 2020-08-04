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
public class TabelDataPostSingle extends AbstractTableModel{
    List<DataPosting> listdatasingle;
    public TabelDataPostSingle(ArrayList<DataPosting> lsData){
        this.listdatasingle = lsData;
    }
    @Override
    public int getRowCount() {
     return  this.listdatasingle.size(); 
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    
    @Override
    public String getColumnName(int column)
    {
        switch (column)
        {
            case 0 :
                return "Company";
            case 1 :
                 return "Job Title";
            case 2 :
                return "Description";
            case 3 :
                return "Pays";
            default:
                return null;
        }
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex)
        {
            case 0 :
                 return listdatasingle.get(rowIndex).getDatanamaperusahaanBisnis();
            case 1 :
                return listdatasingle.get(rowIndex).getDataJudulPostingBisnis();
            case 2 :
                return listdatasingle.get(rowIndex).getDatadeskripsiBisnis();
            case 3 :
                return listdatasingle.get(rowIndex).getDatapaysBisnis();
            default:
                return null;
        }
    
         
         
         
    } //To change body of generated methods, choose Tools | Templates.
    }

