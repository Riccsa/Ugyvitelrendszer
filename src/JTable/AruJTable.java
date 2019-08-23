
package JTable;

import Egyedek.Aru;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AruJTable implements JTable<Aru> {
    
    private String[] columnLabel = {"ID", "kategoria_id", "Cikkszám", "Gyártó", "Típus", "Kategória", "Raktárkészlet", "Minimum készlet", "Egység", "Nettó", "Bruttó", "ÁFA"};
    
    
    public AruJTable(){
        
    }
    
    public AruJTable(String[] columnLabel){
        this.columnLabel=columnLabel;
    }
  

    @Override
    public DefaultTableModel createTable(List<Aru> aruk) {

        DefaultTableModel tableModel = new DefaultTableModel();
        for (String s : columnLabel) {

            tableModel.addColumn(s);       

        }

        Object[] row;

        if (aruk != null) {

            for (Aru aru : aruk) {

                row = aru.toObjectRow();
                tableModel.addRow(row);

            }
        }

        return tableModel;
    }

    @Override
    public void add(Aru aru, DefaultTableModel tableModel) {
        int columnCount = tableModel.getColumnCount();
        Object[] row = aru.toObjectRow();

        tableModel.addRow(row);
    }

    @Override
    public void updateRecord(int selectedRow, Aru aru, DefaultTableModel tableModel) {
        Object[] row = aru.toObjectRow();

        for (int i = 1; i < row.length; i++) {
            tableModel.setValueAt(row[i], selectedRow, i);
        }

    }

    @Override
    public void delete(int id, DefaultTableModel tableModel) {
        tableModel.removeRow(id);
    }

    @Override
    public void setInvisible(int column, javax.swing.JTable table) {

        table.getColumnModel().getColumn(column).setWidth(0);
        table.getColumnModel().getColumn(column).setMinWidth(0);
        table.getColumnModel().getColumn(column).setMaxWidth(0);

    }


}
