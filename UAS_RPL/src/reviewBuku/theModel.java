/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;



import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class theModel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public theModel(){}
    
    public theModel(Object[][] data, String[] columnName){
    
        this.rows = data;
        this.columns = columnName;
    }
    
    @Override
    public Class getColumnClass(int column){
        if (column == 6){
            return Icon.class;
        } else {
            return getValueAt(0, column).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    
    @Override
    public int getColumnCount() {
     return this.columns.length;   
    }

   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return this.rows[rowIndex][columnIndex];
        
    }
    
    public String getColumnName(int col){
        return this.columns[col];
    }
}

 