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
public class TabelDataPost extends AbstractTableModel{
    List<DataPosting> listdata;
    public TabelDataPost(ArrayList<DataPosting> lsData){
        this.listdata = lsData;
    }
    @Override
    public int getRowCount() {
     return  this.listdata.size(); 
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
                 return listdata.get(rowIndex).getDatanamaperusahaan();
            case 1 :
                return listdata.get(rowIndex).getDataJudulPosting();
            case 2 :
                return listdata.get(rowIndex).getDatadeskripsi();
            case 3 :
                return listdata.get(rowIndex).getDatapays();
            default:
                return null;
        }
    
         
         
         
    } //To change body of generated methods, choose Tools | Templates.
    }

