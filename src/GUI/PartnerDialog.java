
package GUI;

import DAO.PartnerRepositoryJDBC;
import Egyedek.Partner;
import JTable.PartnerJTable;
import Utils.Comparator.PartnerKapcsNevComparator;
import Utils.Comparator.PartnerNevComparator;
import java.util.List;
import Utils.Pattern.PartnerPattern;
import Utils.PatternFactory;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utils.Pattern.Pattern;

/**
 *
 * @author Bagi Richard
 */
public class PartnerDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private PartnerJTable partnerJTable;
    private PartnerRepositoryJDBC partnerJDBC;
    private Partner partner;
    private List<Partner> lista;
    
    public PartnerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        try {
            
            this.partnerJDBC = new PartnerRepositoryJDBC();
            this.partnerJTable= new PartnerJTable();
            lista=partnerJDBC.findAll();
            for(Partner p : lista){
                System.out.println(p.getKapcsolattarto_email());
            }
            this.tableModel = partnerJTable.createTable(lista);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parent, ex.getMessage(), "SQL Hiba", JOptionPane.ERROR_MESSAGE);
        }
        
        setTableModel();
     
    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePartner = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        btnTorol = new javax.swing.JButton();
        lbUj = new java.awt.Label();
        lbModosit1 = new java.awt.Label();
        lbTorol = new java.awt.Label();
        btnModosit = new javax.swing.JButton();
        lbDatumKeres1 = new java.awt.Label();
        btnDatumKeres = new javax.swing.JButton();
        btnUjPartner = new javax.swing.JButton();
        btnCSVExport = new javax.swing.JButton();
        lbCSV = new java.awt.Label();
        choiceRendez = new java.awt.Choice();
        tfKereses = new javax.swing.JTextField();
        btnKeres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(218, 231, 245));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jTablePartner.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTablePartner.setAutoscrolls(false);
        jTablePartner.getTableHeader().setReorderingAllowed(false);
        jTablePartner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePartnerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePartner);

        buttonPanel.setBackground(new java.awt.Color(218, 231, 245));
        buttonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/delete.png"))); // NOI18N
        btnTorol.setEnabled(false);
        btnTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorolActionPerformed(evt);
            }
        });
        buttonPanel.add(btnTorol, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 80));

        lbUj.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbUj.setText("Módosít");
        buttonPanel.add(lbUj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, 38));

        lbModosit1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbModosit1.setText("Hozzáad");
        buttonPanel.add(lbModosit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 38));

        lbTorol.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbTorol.setText("Töröl");
        buttonPanel.add(lbTorol, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 38));

        btnModosit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/wrench.png"))); // NOI18N
        btnModosit.setPreferredSize(new java.awt.Dimension(60, 60));
        btnModosit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModositActionPerformed(evt);
            }
        });
        buttonPanel.add(btnModosit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 80));

        lbDatumKeres1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDatumKeres1.setText("Dátum szerinti szűrés");
        buttonPanel.add(lbDatumKeres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 38));

        btnDatumKeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/calendar.png"))); // NOI18N
        btnDatumKeres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDatumKeres.setBorderPainted(false);
        btnDatumKeres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDatumKeres.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnDatumKeres.setFocusable(false);
        btnDatumKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumKeresActionPerformed(evt);
            }
        });
        buttonPanel.add(btnDatumKeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 80, 80));

        btnUjPartner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/add.png"))); // NOI18N
        btnUjPartner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUjPartner.setBorderPainted(false);
        btnUjPartner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjPartner.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjPartner.setFocusable(false);
        btnUjPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjPartnerActionPerformed(evt);
            }
        });
        buttonPanel.add(btnUjPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 80));

        btnCSVExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/csv.png"))); // NOI18N
        btnCSVExport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCSVExport.setBorderPainted(false);
        btnCSVExport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCSVExport.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCSVExport.setFocusable(false);
        btnCSVExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVExportActionPerformed(evt);
            }
        });
        buttonPanel.add(btnCSVExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 80));

        lbCSV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbCSV.setText("CSV \nexport");
        buttonPanel.add(lbCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, 50));

        choiceRendez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choiceRendez.add("");
        choiceRendez.add("Rendezés cégnév szerint növekvő sorrendben");
        choiceRendez.add("Rendezés cégnév szerint növekvő sorrendben");
        choiceRendez.add("Rendezés kapcsolattartó neve szerint növekvő sorrendben");
        choiceRendez.add("Rendezés kapcsolattartó neve szerint csökkenő sorrendben");
        choiceRendez.select(0);
        choiceRendez.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceRendezItemStateChanged(evt);
            }
        });

        tfKereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeresesKeyReleased(evt);
            }
        });

        btnKeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-suche-25.png"))); // NOI18N
        btnKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1109, Short.MAX_VALUE)
                .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(565, 565, 565))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKeres, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(tfKereses))
                .addContainerGap(788, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePartnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePartnerMouseClicked

    }//GEN-LAST:event_jTablePartnerMouseClicked

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
//                int selectedRow = jTablePartner.getSelectedRow();
//        
//                if (selectedRow > -1) {
//                        int selectedId = (Integer) tableModel.getValueAt(jTablePartner.getSelectedRow(), 0);
//            
//                        try {
//                                partnerJDBC.delete(selectedId);
//                                partnerJTable.delete(selectedRow, tableModel);
//                            } catch (SQLException ex) {
//                                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
//                            }
//                    }
    }//GEN-LAST:event_btnTorolActionPerformed

    private void btnModositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModositActionPerformed
                int selectedRow = jTablePartner.getSelectedRow();
        
                if (selectedRow > -1) {
            
                        int selectedId = (int) tableModel.getValueAt(jTablePartner.getSelectedRow(), 0);
            
                        ModositPartnerDialog dialog;
            
                        try {
                
                                partner = partnerJDBC.findById(selectedId);
                                int id = partner.getId();
                
                                dialog = new ModositPartnerDialog(null, true, partner);
                                dialog.setTitle("Partner adatainak módoítása");
                                dialog.setVisible(true);
                
                                if (dialog.isOk()) {
                                        partner = dialog.getPartner();
                                        partnerJDBC.update(partner);
                                        partnerJTable.updateRecord(selectedRow, partner, tableModel);
                                    }
                
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
                                
                               
                            }
                    }
    }//GEN-LAST:event_btnModositActionPerformed

    private void btnDatumKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumKeresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatumKeresActionPerformed

    private void btnUjPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjPartnerActionPerformed
        ModositPartnerDialog dialog = new ModositPartnerDialog(null, true);
        dialog.setTitle("Új partner felvétele");
        dialog.setVisible(true);
        if (dialog.isOk()) {

            try {
                partner = dialog.getPartner();
                partnerJTable.add(partnerJDBC.findById(partnerJDBC.add(partner)), tableModel);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnUjPartnerActionPerformed

    private void btnCSVExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVExportActionPerformed
   
    }//GEN-LAST:event_btnCSVExportActionPerformed

    private void tfKeresesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeresesKeyReleased
        if (tfKereses.getText().equals("")) {

            try {
                this.tableModel = partnerJTable.createTable(partnerJDBC.findAll());
            } catch (SQLException ex) {

            }

            setTableModel();

        }
    }//GEN-LAST:event_tfKeresesKeyReleased

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed

                Pattern filter=new PartnerPattern(PatternFactory.create(tfKereses.getText()));
        
                try {
            
                        this.partnerJDBC = new PartnerRepositoryJDBC();
                        this.tableModel = partnerJTable.createTable(filter.findByPattern(partnerJDBC.findAll()));
            
                    } catch (SQLException ex) {
                        
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            
                    }
        
                setTableModel();
    }//GEN-LAST:event_btnKeresActionPerformed

    private void choiceRendezItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceRendezItemStateChanged
if (choiceRendez.getSelectedIndex() != 0) {
            try {
                List<Partner> list = partnerJDBC.findAll();
                Partner[] partnerTomb = list.toArray(new Partner[list.size()]);

                switch (choiceRendez.getSelectedIndex()) {
                    case (1):
                        Arrays.sort(partnerTomb, new PartnerNevComparator());
                        break;
                    case (2):
                        Arrays.sort(partnerTomb, new PartnerNevComparator().reversed());
                        break;
                    case (3):
                        Arrays.sort(partnerTomb, new PartnerKapcsNevComparator());
                        break;
                    case (4):
                        Arrays.sort(partnerTomb, new PartnerKapcsNevComparator().reversed());
                        break;
                }

                this.tableModel = partnerJTable.createTable(Arrays.asList(partnerTomb));
                setTableModel();

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);

            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_choiceRendezItemStateChanged

    private void setTableModel() {
        jTablePartner.setModel(tableModel);
        partnerJTable.setInvisible(tableModel.findColumn("id"), jTablePartner);
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
            java.util.logging.Logger.getLogger(PartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PartnerDialog dialog = new PartnerDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCSVExport;
    private javax.swing.JButton btnDatumKeres;
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnModosit;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnUjPartner;
    private javax.swing.JPanel buttonPanel;
    private java.awt.Choice choiceRendez;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePartner;
    private java.awt.Label lbCSV;
    private java.awt.Label lbDatumKeres1;
    private java.awt.Label lbModosit1;
    private java.awt.Label lbTorol;
    private java.awt.Label lbUj;
    private javax.swing.JTextField tfKereses;
    // End of variables declaration//GEN-END:variables
}
