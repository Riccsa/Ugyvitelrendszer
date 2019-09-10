
package JTable;

import Egyedek.Megrendeles;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MegrendelesJTable implements JTable<Megrendeles> {
    
    private String[] columnLabel = {"ID", "dolgozo_id","partner_id", "Rendelési szám", "Rögzítés dátuma", "Teljesítés dátuma", "Beszállító/vevő", "Kimenő/bejövő","Státusz", "Összeg(Ft)","Rögzítette"};

    @Override
    public DefaultTableModel createTable( List<Megrendeles> megrendeles) {

        DefaultTableModel tableModel = new DefaultTableModel();
        for (String s : columnLabel) {

            tableModel.addColumn(s);

        }

        Object[] row;
        
        if (megrendeles != null) {

            for (Megrendeles m : megrendeles) {

                row = m.toObjectRow();
                tableModel.addRow(row);

            }
        }

        return tableModel;
    }

    @Override
    public void add(Megrendeles m, DefaultTableModel tableModel) {
        int columnCount = tableModel.getColumnCount();
        Object[] row = m.toObjectRow();

        tableModel.addRow(row);
    }

    @Override
    public void updateRecord(int selectedRow, Megrendeles m, DefaultTableModel tableModel) {
        Object[] row = m.toObjectRow();

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
    
    public void updateColumn(int column, Object o){
        
        
        
    }

}
