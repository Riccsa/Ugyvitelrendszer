
package GUI;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAO.DolgozoRepositoryJDBC;
import Egyedek.Dolgozo;
import JTable.DolgozoJTable;
import Utils.Comparator.DolgozoDatumComparator;
import Utils.Comparator.DolgozoNevComparator;
import Utils.Pattern.DolgozoPattern;
import Utils.PatternFactory;
import java.util.Arrays;
import java.util.List;

public class DolgozoDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private DolgozoJTable DolgozoJTable=new DolgozoJTable();
    private DolgozoRepositoryJDBC dolgozoJDBC;
    private Dolgozo dolgozo;

    public DolgozoDialog(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        this.dolgozoJDBC = new DolgozoRepositoryJDBC();
        this.tableModel = DolgozoJTable.createTable( this.dolgozoJDBC.findAll());
        initComponents();
        setTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        btnKeres = new javax.swing.JButton();
        tfKereses = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDolgozo = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        btnModosit = new javax.swing.JButton();
        btnUjDolgozo = new javax.swing.JButton();
        btnTorol = new javax.swing.JButton();
        lbUj = new java.awt.Label();
        lbModosit1 = new java.awt.Label();
        lbTorol = new java.awt.Label();
        btnTorol1 = new javax.swing.JButton();
        lbModosit2 = new java.awt.Label();
        choiceRendez = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        lbTalalatDb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(218, 231, 245));
        MainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));

        btnKeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-suche-25.png"))); // NOI18N
        btnKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeresActionPerformed(evt);
            }
        });

        tfKereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeresesKeyReleased(evt);
            }
        });

        jTableDolgozo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableDolgozo.setAutoscrolls(false);
        jTableDolgozo.getTableHeader().setReorderingAllowed(false);
        jTableDolgozo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDolgozoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDolgozo);
        if (jTableDolgozo.getColumnModel().getColumnCount() > 0) {
            jTableDolgozo.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            jTableDolgozo.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            jTableDolgozo.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            jTableDolgozo.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        buttonPanel.setBackground(new java.awt.Color(218, 231, 245));
        buttonPanel.setVisible(false);

        btnModosit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/edit_user_male_64px.png"))); // NOI18N
        btnModosit.setPreferredSize(new java.awt.Dimension(60, 60));
        btnModosit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModositActionPerformed(evt);
            }
        });

        btnUjDolgozo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/add_user_male_64px.png"))); // NOI18N
        btnUjDolgozo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUjDolgozo.setBorderPainted(false);
        btnUjDolgozo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjDolgozo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjDolgozo.setFocusable(false);
        btnUjDolgozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjDolgozoActionPerformed(evt);
            }
        });

        btnTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/remove_user_male_64px.png"))); // NOI18N
        btnTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorolActionPerformed(evt);
            }
        });

        lbUj.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbUj.setText("Módosít");

        lbModosit1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbModosit1.setText("Hozzáad");

        lbTorol.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTorol.setText("Töröl");

        btnTorol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-purchase-order-64.png"))); // NOI18N

        lbModosit2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbModosit2.setText("Megrendelések");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUjDolgozo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbModosit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModosit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTorol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbModosit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnTorol1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUjDolgozo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModosit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTorol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTorol1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbModosit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTorol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbModosit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        choiceRendez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choiceRendez.add("");
        choiceRendez.add("Rendezés név szerint növekvő sorrendben");
        choiceRendez.add("Rendezés név szerint növekvő sorrendben");
        choiceRendez.add("Rendezés születési dátum szerint növekvő sorrendben");
        choiceRendez.add("Rendezés születési dátum szerint csökkenő sorrendben");
        choiceRendez.add("Rendezés megrendelések száma szerint növekvő sorrendben");
        choiceRendez.add("Rendezés megrendelések száma szerint csökkenő sorrendben");
        choiceRendez.select(0);
        choiceRendez.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceRendezItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Találatok száma:");

        lbTalalatDb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lbTalalatDb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(446, 446, 446)))
                .addGap(366, 366, 366)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbTalalatDb))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModositActionPerformed
        int selectedRow = jTableDolgozo.getSelectedRow();
        
        if (selectedRow > -1) {
            int selectedId = (int) tableModel.getValueAt(jTableDolgozo.getSelectedRow(), 0);

            ModositDolgozoDialog dialog;

            try {
                dolgozo = dolgozoJDBC.findById(selectedId);
                int id = dolgozo.getId();
                dialog = new ModositDolgozoDialog(null, true, dolgozo);
                dialog.setTitle("Dolgozó adatainak módoítása");
                dialog.setVisible(true);

                if (dialog.isOk()) {
                    dolgozo = dialog.getDolgozo();
                    dolgozoJDBC.update(dolgozo);
                    DolgozoJTable.updateRecord(selectedRow, dolgozo, tableModel);
                }

            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnModositActionPerformed

    private void btnUjDolgozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjDolgozoActionPerformed
        ModositDolgozoDialog dialog = new ModositDolgozoDialog(null, true);
        dialog.setTitle("Új dolgozó felvétele");
        dialog.setVisible(true);
        
        if (dialog.isOk()) {

            try {
                dolgozo = dialog.getDolgozo();
                DolgozoJTable.add(dolgozoJDBC.findById(dolgozoJDBC.add(dolgozo)), tableModel);

            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnUjDolgozoActionPerformed

    private void jTableDolgozoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDolgozoMouseClicked

    }//GEN-LAST:event_jTableDolgozoMouseClicked

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
        int selectedRow = jTableDolgozo.getSelectedRow();

        if (selectedRow > -1) {
            int selectedId = (Integer) tableModel.getValueAt(jTableDolgozo.getSelectedRow(), 0);

            try {
                dolgozoJDBC.delete(selectedId);
                DolgozoJTable.delete(selectedRow, tableModel);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnTorolActionPerformed

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed
       
        DolgozoPattern filter = new DolgozoPattern(PatternFactory.create(tfKereses.getText()));

        try {

            this.dolgozoJDBC = new DolgozoRepositoryJDBC();
            this.tableModel = DolgozoJTable.createTable(filter.findByPattern(dolgozoJDBC.findAll()));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }

        setTableModel();

    }//GEN-LAST:event_btnKeresActionPerformed

    private void tfKeresesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeresesKeyReleased
        if (tfKereses.getText().equals("")) {

            try {
                this.tableModel = DolgozoJTable.createTable(dolgozoJDBC.findAll());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }

            setTableModel();

        }

    }//GEN-LAST:event_tfKeresesKeyReleased

    private void choiceRendezItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceRendezItemStateChanged
         
        if (choiceRendez.getSelectedIndex() != 0) {
            try {
                List<Dolgozo> list = dolgozoJDBC.findAll();
                Dolgozo[] dolgTomb = list.toArray(new Dolgozo[list.size()]);
 
                switch (choiceRendez.getSelectedIndex()) {
                    case (1):
                        Arrays.sort(dolgTomb, new DolgozoNevComparator());
                        break;
                    case (2):
                        Arrays.sort(dolgTomb, new DolgozoNevComparator().reversed());
                        break;
                    case (3):
                        Arrays.sort(dolgTomb, new DolgozoDatumComparator());
                        break;
                    case (4):
                        Arrays.sort(dolgTomb, new DolgozoDatumComparator().reversed());
                        break;
                }

                this.tableModel = DolgozoJTable.createTable(Arrays.asList(dolgTomb));
                setTableModel();

            } catch (SQLException ex) {

            }

        }

    }//GEN-LAST:event_choiceRendezItemStateChanged

    
    private void setTableModel() {
        jTableDolgozo.setModel(tableModel);
        DolgozoJTable.setInvisible(0, jTableDolgozo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DolgozoDialog dialog = null;
                try {
                    dialog = new DolgozoDialog(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                   
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnModosit;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnTorol1;
    private javax.swing.JButton btnUjDolgozo;
    private javax.swing.JPanel buttonPanel;
    private java.awt.Choice choiceRendez;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDolgozo;
    private java.awt.Label lbModosit1;
    private java.awt.Label lbModosit2;
    private javax.swing.JLabel lbTalalatDb;
    private java.awt.Label lbTorol;
    private java.awt.Label lbUj;
    private javax.swing.JTextField tfKereses;
    // End of variables declaration//GEN-END:variables

}
