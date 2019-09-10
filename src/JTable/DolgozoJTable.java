
package JTable;

import Egyedek.Dolgozo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DolgozoJTable implements JTable<Dolgozo> {

    private String[] columnLabel = {"ID", "Dolgozó neve", "Személyi szám", "Születési hely", "Születési dátum", "Lakhely", "Beosztás", "Email"};

    @Override
    public DefaultTableModel createTable(List<Dolgozo> dolgozok) {
        
      DefaultTableModel tableModel =  new DefaultTableModel();
     
        for (String s : columnLabel) {

            tableModel.addColumn(s);

        }

        Object[] row;

        for (Dolgozo d : dolgozok) {

            row = d.toObjectRow();
            tableModel.addRow(row);

        }

        return tableModel;
    }

    @Override
    public void add(Dolgozo dolgozo, DefaultTableModel tableModel) {
        int columnCount = tableModel.getColumnCount();
        Object[] row = dolgozo.toObjectRow();

        tableModel.addRow(row);
    }

    @Override
    public void updateRecord(int selectedRow, Dolgozo dolgozo, DefaultTableModel tableModel) {
        Object[] row = dolgozo.toObjectRow();

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
