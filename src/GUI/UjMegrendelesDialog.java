/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Check.NumberFormatCheck;
import DAO.AruRepositoryJDBC;
import DAO.DolgozoRepositoryJDBC;
import DAO.PartnerRepositoryJDBC;
import Egyedek.Aru;
import Egyedek.Dolgozo;
import Egyedek.Megrendeles;
import Egyedek.Partner;
import JTable.AruJTable;
import Math.Calc;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bagi.richard
 */
public class UjMegrendelesDialog extends javax.swing.JDialog {

     private List<Aru> aruLista;
     private List<Aru> ujAruLista=new ArrayList<>();
     private List<Dolgozo> dolgLista;
     private List<Partner> beszallitoLista;
     private DefaultTableModel tableModel;
     private AruJTable AruJTable;
     private Aru aru;
     private Dolgozo dolgozo;
     private Partner partner;
     private Calc calc;
     private Megrendeles megrendeles;
     private boolean ok=false;
     private NumberFormatCheck numCheck;
             
    public UjMegrendelesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        try {
            aruLista = new AruRepositoryJDBC().findAll();
            dolgLista = new DolgozoRepositoryJDBC().findAll();
            beszallitoLista = new PartnerRepositoryJDBC().findByTipus(Partner.BESZALLITO);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }

        initComponents();
        this.setTitle("Új beszerzés indítása");

        calc = new Calc();
        AruJTable = new AruJTable();
        numCheck = new NumberFormatCheck();
        this.tableModel = AruJTable.createTable(null);
        jTableAru.setModel(tableModel);
        setColumnInvisible();

    }
    
   


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnRogzit = new javax.swing.JButton();
        btnMegse = new javax.swing.JButton();
        lbOsszeg = new java.awt.Label();
        lbEredmeny = new java.awt.Label();
        btnUjAru = new javax.swing.JButton();
        btnTorol = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAru = new javax.swing.JTable();
        choiceAru = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        choiceDolgozo = new java.awt.Choice();
        lbDolgozo = new javax.swing.JLabel();
        choicePartner = new java.awt.Choice();
        lbBeszallito = new javax.swing.JLabel();
        tfDb = new javax.swing.JTextField();
        lbHelytelenFormatum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1720, 880));

        btnRogzit.setText("Rögzít");
        btnRogzit.setEnabled(false);
        btnRogzit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRogzitActionPerformed(evt);
            }
        });

        btnMegse.setText("Mégse");
        btnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegseActionPerformed(evt);
            }
        });

        lbOsszeg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbOsszeg.setText("Végösszeg:");

        lbEredmeny.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnUjAru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/plus_48px.png"))); // NOI18N
        btnUjAru.setBorder(new javax.swing.border.MatteBorder(null));
        btnUjAru.setBorderPainted(false);
        btnUjAru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjAru.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjAru.setFocusable(false);
        btnUjAru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjAruActionPerformed(evt);
            }
        });

        btnTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_minus_48px.png"))); // NOI18N
        btnTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorolActionPerformed(evt);
            }
        });

        jTableAru.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableAru.setAutoscrolls(false);
        jTableAru.setEditingColumn(4);
        jTableAru.getTableHeader().setReorderingAllowed(false);
        jTableAru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAru);

        for(Aru aru : aruLista){
            String gyartoTipus= aru.getNev();
            choiceAru.add(gyartoTipus);
        }

        aru=aruLista.get(choiceAru.getSelectedIndex());
        choiceAru.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceAruItemStateChanged(evt);
            }
        });

        jLabel1.setText("     Raktáron lévő árulista");

        for(Dolgozo dolgozo : dolgLista){
            String dolgozoNev= dolgozo.getNev();
            choiceDolgozo.add(dolgozoNev);
        }

        dolgozo=dolgLista.get(choiceDolgozo.getSelectedIndex());
        choiceDolgozo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceDolgozoItemStateChanged(evt);
            }
        });

        lbDolgozo.setText("     A rendelést rögzíti");

        for(Partner partner : beszallitoLista){

            if(partner.getTipus().equals(Partner.BESZALLITO)){
                String partnerNev= partner.getNev();
                choicePartner.add(partnerNev);
            }
        }
        partner=beszallitoLista.get(choicePartner.getSelectedIndex());
        choicePartner.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choicePartnerItemStateChanged(evt);
            }
        });

        lbBeszallito.setText("Beszállítói partner");

        tfDb.setText("db");
        tfDb.setToolTipText("");
        tfDb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDbMouseClicked(evt);
            }
        });
        tfDb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDbKeyReleased(evt);
            }
        });

        lbHelytelenFormatum.setForeground(new java.awt.Color(255, 0, 51));
        lbHelytelenFormatum.setText("Helytelen Formátum!");
        lbHelytelenFormatum.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRogzit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnUjAru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDolgozo)
                                    .addComponent(lbBeszallito))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(choicePartner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(choiceAru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choiceDolgozo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(tfDb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbHelytelenFormatum))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnRogzit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUjAru, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(choiceAru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbHelytelenFormatum)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBeszallito)
                            .addComponent(choicePartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choiceDolgozo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDolgozo))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUjAruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjAruActionPerformed
        int db = 1;
        if (!choiceAru.getSelectedItem().isEmpty()) {
            if (numCheck.check(tfDb)) {
                db = Integer.parseInt(tfDb.getText());
            }

            for (int i = 1; i <= db; i++) {
                AruJTable.add(aru, tableModel);
                lbEredmeny.setText(calc.add(aru.getBrutto()) + " Ft");
            }

            if (ujAruLista.stream().noneMatch(t -> t.getId() == aru.getId())) {

                aru.setKeszlet(db);
                ujAruLista.add(aru);

            } else {
                for (int i = 0; i < ujAruLista.size(); i++) {
                    if (aru.getId() == ujAruLista.get(i).getId()) {
                        ujAruLista.get(i).setKeszlet(ujAruLista.get(i).getKeszlet() + db);
                    }
                }

            }

        }

        btnRogzit.setEnabled(calc.getSum() != 0);
        setColumnInvisible();

    }//GEN-LAST:event_btnUjAruActionPerformed

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
        int selectedRow = jTableAru.getSelectedRow();

        if (selectedRow > -1) {

            int selectedId = (int) jTableAru.getValueAt(selectedRow, tableModel.findColumn("ID"));
            int num = (int) jTableAru.getValueAt(selectedRow, tableModel.findColumn("Bruttó"));
            AruJTable.delete(selectedRow, tableModel);

            for (int i = 0; i < ujAruLista.size(); i++) {
                if (selectedId == ujAruLista.get(i).getId()) {
                    if (ujAruLista.get(i).getKeszlet() == 1) {
                        ujAruLista.remove(ujAruLista.get(i));
                    } else {
                        ujAruLista.get(i).setKeszlet(ujAruLista.get(i).getKeszlet() - 1);
                    }
                }
            }
            lbEredmeny.setText(calc.subtract(num) + " Ft");
        }

        btnRogzit.setEnabled(calc.getSum() != 0);


    }//GEN-LAST:event_btnTorolActionPerformed

    private void jTableAruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAruMouseClicked

    }//GEN-LAST:event_jTableAruMouseClicked

    private void btnRogzitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRogzitActionPerformed
      OptionDialog dialog=new OptionDialog(this,"Biztos, hogy rögzíti a kimenő megrendelést?", true);
      dialog.setVisible(true);
      if(dialog.isOk()){
          ok=true;
          int rendelesiSzam=(int)(Math.random()*100000)+10000;
          megrendeles=new Megrendeles(ujAruLista,rendelesiSzam,dolgozo, partner,LocalDateTime.now(),Megrendeles.MEGRENDELT,Megrendeles.KIMENO,calc.getSum());
          this.setVisible(false);
      }
      
    }//GEN-LAST:event_btnRogzitActionPerformed

    private void btnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegseActionPerformed
        
        
    }//GEN-LAST:event_btnMegseActionPerformed

    private void choiceAruItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceAruItemStateChanged
        aru=aruLista.get(choiceAru.getSelectedIndex());
    }//GEN-LAST:event_choiceAruItemStateChanged

    private void choiceDolgozoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceDolgozoItemStateChanged
        dolgozo=dolgLista.get(choiceDolgozo.getSelectedIndex());            
    }//GEN-LAST:event_choiceDolgozoItemStateChanged

    private void choicePartnerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choicePartnerItemStateChanged
        partner=beszallitoLista.get(choicePartner.getSelectedIndex());      
    }//GEN-LAST:event_choicePartnerItemStateChanged

    private void tfDbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDbMouseClicked
        if(tfDb.getText().equals("db")){
          tfDb.setText("");
    }
    
    }//GEN-LAST:event_tfDbMouseClicked

    private void tfDbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDbKeyReleased
    
            lbHelytelenFormatum.setVisible(!numCheck.check(tfDb));
     
    }//GEN-LAST:event_tfDbKeyReleased

    public boolean isOk() {
        return ok;
    }

    
    public Megrendeles getMegrendeles(){
        
        return megrendeles;
        
    }
    
    private void setColumnInvisible(){
        AruJTable.setInvisible(tableModel.findColumn("ID"), jTableAru);
        AruJTable.setInvisible(tableModel.findColumn("kategoria_id"), jTableAru);
        AruJTable.setInvisible(tableModel.findColumn("Raktárkészlet"), jTableAru);
        AruJTable.setInvisible(tableModel.findColumn("Minimum készlet"), jTableAru);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UjMegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UjMegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UjMegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UjMegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UjMegrendelesDialog dialog = new UjMegrendelesDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnRogzit;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnUjAru;
    private java.awt.Choice choiceAru;
    private java.awt.Choice choiceDolgozo;
    private java.awt.Choice choicePartner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAru;
    private javax.swing.JLabel lbBeszallito;
    private javax.swing.JLabel lbDolgozo;
    private java.awt.Label lbEredmeny;
    private javax.swing.JLabel lbHelytelenFormatum;
    private java.awt.Label lbOsszeg;
    private javax.swing.JTextField tfDb;
    // End of variables declaration//GEN-END:variables
}
