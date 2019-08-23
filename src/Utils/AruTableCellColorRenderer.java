
package Utils;

import Egyedek.Aru;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class AruTableCellColorRenderer implements TableCellRenderer {

    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    private List<Aru> list;
    
    private int min_db;

    public AruTableCellColorRenderer(List<Aru> list) {

        this.list = list;

    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getColumnName(column).equals("Cikkszám")) {
            int cikkszam = Integer.parseInt(value.toString());

            for (Aru aru : list) {
                if (aru.getCikkszam() == cikkszam) {
                    min_db = aru.getMinKeszlet();
                }

            }

        }

        if (table.getColumnName(column).equals("Raktárkészlet")) {


            int db = Integer.parseInt(value.toString());
            if (db <= min_db) {
                c.setForeground(Color.red);
            } else {
                c.setForeground(Color.black);

            }

        } else {
            c.setForeground(Color.black);
        }

        return c;

    }
}
