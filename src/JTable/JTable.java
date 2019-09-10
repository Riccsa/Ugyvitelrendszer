
package JTable;

import java.util.List;
import javax.swing.table.DefaultTableModel;


public interface JTable<T> {
    
    public DefaultTableModel createTable(List<T> lista);
    public void add(T t, DefaultTableModel tableModel);
    public void updateRecord(int selectedRow, T t, DefaultTableModel tableModel);
    public void delete(int id, DefaultTableModel tableModel);
    public void setInvisible(int column, javax.swing.JTable table);  
    
}
