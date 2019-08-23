
package GUI;

import Check.EmptyCheck;
import Check.NumberFormatCheck;
import DAO.KategoriaRepositoryJDBC;
import Egyedek.Aru;
import Egyedek.Kategoria;
import Math.Calc;
import Utils.Unit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class ModositAruDialog extends javax.swing.JDialog {

    private boolean ok = false;
    private Aru aru;
    private List<Kategoria> katLista;
    private KategoriaRepositoryJDBC katJDBC;
    private List<JTextField> textList=new ArrayList<>();
    private EmptyCheck emptyCheck;
    private NumberFormatCheck numFormCheck;
    private String modositTitle="Áru adatainak módosítása";
    private String ujTitle="Új áru felvétele";
    

    public ModositAruDialog(java.awt.Frame parent, boolean modal) throws SQLException {
           
        super(parent, modal);
        katJDBC = new KategoriaRepositoryJDBC();
        katLista = katJDBC.findAll();
        initComponents();
         
        this.setTitle(ujTitle);
       
        btnOk.setEnabled(false);
        emptyCheck = new EmptyCheck();
        numFormCheck = new NumberFormatCheck();
    }


    public ModositAruDialog(java.awt.Frame parent, boolean modal, Aru aru) throws SQLException {

        super(parent, modal);
        this.aru=aru;
        katJDBC=new KategoriaRepositoryJDBC();
        katLista=katJDBC.findAll();  
        
        initComponents();  
        
        this.setTitle(modositTitle);
           
        tfCikkSzam.setText(Integer.toString(aru.getCikkszam()));
        tfGyarto.setText(aru.getGyarto());
        tfTipus.setText(aru.getNev());
        choiceKategoria.select(aru.getKategoriaNev());
        tfKeszlet.setText(Integer.toString(aru.getKeszlet()));
        tfMinKeszlet.setText(Integer.toString(aru.getMinKeszlet()));
        choiceEgyseg.select(aru.getEgyseg());
        tfNetto.setText(Integer.toString(aru.getNetto()));
        tfBrutto.setText(Integer.toString(aru.getBrutto()));
        tfAFA.setText(Integer.toString(aru.getAfa()));
        
        emptyCheck=new EmptyCheck();
        numFormCheck = new NumberFormatCheck();
        lbFormatumCikkSzam.setVisible(false);
     

    }

    public Aru getAru() throws SQLException {

        int cikkSzam = Integer.parseInt(tfCikkSzam.getText());
        String gyarto = tfGyarto.getText();
        String tipus = tfTipus.getText();
        String kategoriaNev = choiceKategoria.getSelectedItem();
        Integer kategoriaId = null;
        kategoriaId = katJDBC.findByName(choiceKategoria.getSelectedItem()).get(0).getId();
        int keszlet = Integer.parseInt(tfKeszlet.getText());
        int minKeszlet = Integer.parseInt(tfMinKeszlet.getText());
        String egyseg = choiceEgyseg.getSelectedItem();
        int netto = Integer.parseInt(tfNetto.getText());
        int brutto = Integer.parseInt(tfBrutto.getText());
        int AFA = Integer.parseInt(tfAFA.getText());

        Aru ujAru = new Aru(aru.getId(), kategoriaId, cikkSzam, gyarto, tipus, kategoriaNev, keszlet, minKeszlet, egyseg, netto, brutto, AFA);

        return ujAru;
    }

    public boolean isOk() {
        return ok;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMegse = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jTextPanel = new javax.swing.JPanel();
        tfCikkSzam = new javax.swing.JTextField();
        tfTipus = new javax.swing.JTextField();
        tfKeszlet = new javax.swing.JTextField();
        tfMinKeszlet = new javax.swing.JTextField();
        tfGyarto = new javax.swing.JTextField();
        lbFormatumCikkSzam = new javax.swing.JLabel();
        tfAFA = new javax.swing.JTextField();
        tfNetto = new javax.swing.JTextField();
        tfBrutto = new javax.swing.JTextField();
        lbFormatumMinKeszlet = new javax.swing.JLabel();
        lbFormatumNetto = new javax.swing.JLabel();
        lbFormatumEgyseg = new javax.swing.JLabel();
        lbFormatumAFA = new javax.swing.JLabel();
        choiceEgyseg = new java.awt.Choice();
        lbFormatumKeszlet = new javax.swing.JLabel();
        choiceKategoria = new java.awt.Choice();
        lbSzazalek = new java.awt.Label();
        jLabelPanel = new javax.swing.JPanel();
        lbCikkSzam = new javax.swing.JLabel();
        lbTipus = new javax.swing.JLabel();
        lbKategoria = new javax.swing.JLabel();
        lbKészlet = new javax.swing.JLabel();
        lbMinKeszlet = new javax.swing.JLabel();
        lbGyarto = new javax.swing.JLabel();
        lbBruttó = new javax.swing.JLabel();
        lbEgyseg = new javax.swing.JLabel();
        lbNetto = new javax.swing.JLabel();
        lbBruttó1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnMegse.setText("Mégse");
        btnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegseActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        textList.add(tfCikkSzam);
        textList.add(tfGyarto);
        textList.add(tfTipus);
        textList.add(tfKeszlet);
        textList.add(tfMinKeszlet);
        textList.add(tfNetto);
        textList.add(tfAFA);

        lbFormatumCikkSzam.setVisible(false);
        lbFormatumKeszlet.setVisible(false);
        lbFormatumMinKeszlet.setVisible(false);
        lbFormatumEgyseg.setVisible(false);
        lbFormatumNetto.setVisible(false);
        lbFormatumAFA.setVisible(false);

        tfBrutto.setEnabled(false);
        jTextPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfCikkSzam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCikkSzamKeyReleased(evt);
            }
        });
        jTextPanel.add(tfCikkSzam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 284, -1));

        tfTipus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTipusKeyReleased(evt);
            }
        });
        jTextPanel.add(tfTipus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 284, -1));

        tfKeszlet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeszletKeyReleased(evt);
            }
        });
        jTextPanel.add(tfKeszlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 284, -1));

        tfMinKeszlet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMinKeszletKeyReleased(evt);
            }
        });
        jTextPanel.add(tfMinKeszlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 284, -1));

        tfGyarto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfGyartoKeyReleased(evt);
            }
        });
        jTextPanel.add(tfGyarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 284, -1));

        lbFormatumCikkSzam.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumCikkSzam.setText("Helytelen formátum!");
        lbFormatumCikkSzam.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumCikkSzam, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 205, -1));

        tfAFA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAFAKeyReleased(evt);
            }
        });
        jTextPanel.add(tfAFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, -1));

        tfNetto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNettoKeyReleased(evt);
            }
        });
        jTextPanel.add(tfNetto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 284, -1));

        jTextPanel.add(tfBrutto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 284, -1));

        lbFormatumMinKeszlet.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumMinKeszlet.setText("Helytelen formátum!");
        lbFormatumMinKeszlet.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumMinKeszlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 205, -1));

        lbFormatumNetto.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumNetto.setText("Helytelen formátum!");
        lbFormatumNetto.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumNetto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 205, -1));

        lbFormatumEgyseg.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumEgyseg.setText("Helytelen formátum!");
        lbFormatumEgyseg.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumEgyseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 205, -1));

        lbFormatumAFA.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumAFA.setText("Helytelen formátum!");
        lbFormatumAFA.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumAFA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 205, -1));

        choiceEgyseg.add(Unit.DB);
        choiceEgyseg.add(Unit.mm);

        jTextPanel.add(choiceEgyseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, -1));

        lbFormatumKeszlet.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumKeszlet.setText("Helytelen formátum!");
        lbFormatumKeszlet.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);
        jTextPanel.add(lbFormatumKeszlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 205, -1));

        for(Kategoria kat : katLista){
            choiceKategoria.add(kat.getNev());
        }
        jTextPanel.add(choiceKategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 30));

        lbSzazalek.setText("%");
        jTextPanel.add(lbSzazalek, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCikkSzam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCikkSzam.setText("Cikkszám:");
        lbCikkSzam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelPanel.add(lbCikkSzam, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 13, 70, 22));

        lbTipus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTipus.setText("Típus:");
        jLabelPanel.add(lbTipus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 83, 22));

        lbKategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKategoria.setText("Kategória:");
        jLabelPanel.add(lbKategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 40));

        lbKészlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKészlet.setText("Készlet:");
        jLabelPanel.add(lbKészlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        lbMinKeszlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMinKeszlet.setText("Minimumkészlet:");
        jLabelPanel.add(lbMinKeszlet, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        lbGyarto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGyarto.setText("Gyártó:");
        jLabelPanel.add(lbGyarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 53, -1, -1));

        lbBruttó.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBruttó.setText("ÁFA:");
        jLabelPanel.add(lbBruttó, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 29));

        lbEgyseg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEgyseg.setText("Egység:");
        jLabelPanel.add(lbEgyseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 29));

        lbNetto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNetto.setText("Nettó:");
        jLabelPanel.add(lbNetto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, 29));

        lbBruttó1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBruttó1.setText("Bruttó:");
        jLabelPanel.add(lbBruttó1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
            ok = true;
            this.setVisible(false);      
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnMegseActionPerformed

    private void tfCikkSzamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCikkSzamKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numFormCheck.check(tfCikkSzam));
       lbFormatumCikkSzam.setVisible(!tfCikkSzam.getText().isEmpty() && !numFormCheck.check(tfCikkSzam));
       
    }//GEN-LAST:event_tfCikkSzamKeyReleased

    private void tfGyartoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGyartoKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList));
    }//GEN-LAST:event_tfGyartoKeyReleased

    private void tfTipusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTipusKeyReleased
      btnOk.setEnabled(emptyCheck.check(textList));
    }//GEN-LAST:event_tfTipusKeyReleased

    private void tfKeszletKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeszletKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numFormCheck.check(tfKeszlet));
       lbFormatumKeszlet.setVisible(!numFormCheck.check(tfKeszlet));
    }//GEN-LAST:event_tfKeszletKeyReleased

    private void tfMinKeszletKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMinKeszletKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numFormCheck.check(tfMinKeszlet));
       lbFormatumKeszlet.setVisible(!numFormCheck.check(tfMinKeszlet));
    }//GEN-LAST:event_tfMinKeszletKeyReleased

    private void tfAFAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAFAKeyReleased
   
        btnOk.setEnabled(emptyCheck.check(textList) && numFormCheck.check(tfAFA));
        lbFormatumAFA.setVisible(!numFormCheck.check(tfAFA));
        if(numFormCheck.check(tfAFA) && numFormCheck.check(tfNetto)){
            tfBrutto.setText(Calc.getBrutto(Integer.parseInt(tfAFA.getText()), Integer.parseInt(tfNetto.getText())));
        }
        
   
    }//GEN-LAST:event_tfAFAKeyReleased

    private void tfNettoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNettoKeyReleased
        btnOk.setEnabled(emptyCheck.check(textList) && numFormCheck.check(tfNetto));
        lbFormatumNetto.setVisible(!numFormCheck.check(tfNetto));
        if(numFormCheck.check(tfAFA) && numFormCheck.check(tfNetto)){
            tfBrutto.setText(Calc.getBrutto(Integer.parseInt(tfAFA.getText()), Integer.parseInt(tfNetto.getText())));
        }
    }//GEN-LAST:event_tfNettoKeyReleased

    
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
            java.util.logging.Logger.getLogger(ModositAruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModositAruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModositAruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModositAruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModositAruDialog dialog = null;
                try {
                    dialog = new ModositAruDialog(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModositAruDialog.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnOk;
    private java.awt.Choice choiceEgyseg;
    private java.awt.Choice choiceKategoria;
    private javax.swing.JPanel jLabelPanel;
    private javax.swing.JPanel jTextPanel;
    private javax.swing.JLabel lbBruttó;
    private javax.swing.JLabel lbBruttó1;
    private javax.swing.JLabel lbCikkSzam;
    private javax.swing.JLabel lbEgyseg;
    private javax.swing.JLabel lbFormatumAFA;
    private javax.swing.JLabel lbFormatumCikkSzam;
    private javax.swing.JLabel lbFormatumEgyseg;
    private javax.swing.JLabel lbFormatumKeszlet;
    private javax.swing.JLabel lbFormatumMinKeszlet;
    private javax.swing.JLabel lbFormatumNetto;
    private javax.swing.JLabel lbGyarto;
    private javax.swing.JLabel lbKategoria;
    private javax.swing.JLabel lbKészlet;
    private javax.swing.JLabel lbMinKeszlet;
    private javax.swing.JLabel lbNetto;
    private java.awt.Label lbSzazalek;
    private javax.swing.JLabel lbTipus;
    private javax.swing.JTextField tfAFA;
    private javax.swing.JTextField tfBrutto;
    private javax.swing.JTextField tfCikkSzam;
    private javax.swing.JTextField tfGyarto;
    private javax.swing.JTextField tfKeszlet;
    private javax.swing.JTextField tfMinKeszlet;
    private javax.swing.JTextField tfNetto;
    private javax.swing.JTextField tfTipus;
    // End of variables declaration//GEN-END:variables
}
