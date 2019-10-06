
package JTable;

import Egyedek.Partner;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PartnerJTable implements JTable<Partner> {
    
    private String[] columnLabel = {"id", "adószám", "cégnév", "irányítószám", "város", "cím", "típus", "kapcsolattartó neve", "kapcsolattartó telefonszáma", "kapcsolattartó email címe"};

    @Override
    public DefaultTableModel createTable( List<Partner> partnerek) {

        DefaultTableModel tableModel = new DefaultTableModel();
        for (String s : columnLabel) {

            tableModel.addColumn(s);

        }

        Object[] row;

        if (partnerek != null) {

            for (Partner p : partnerek) {

                row = p.toObjectRow();
                tableModel.addRow(row);

            }
        }

        return tableModel;
    }

    @Override
    public void add(Partner partner, DefaultTableModel tableModel) {
        int columnCount = tableModel.getColumnCount();
        Object[] row = partner.toObjectRow();

        tableModel.addRow(row);
    }

    @Override
    public void updateRecord(int selectedRow, Partner partner, DefaultTableModel tableModel) {
        Object[] row = partner.toObjectRow();

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
