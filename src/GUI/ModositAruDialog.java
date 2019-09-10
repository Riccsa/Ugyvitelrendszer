
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
        lbBruttó1 = new javax.swing.JLabel();
        lbBruttó = new javax.swing.JLabel();
        lbNetto = new javax.swing.JLabel();
        lbEgyseg = new javax.swing.JLabel();
        lbMinKeszlet = new javax.swing.JLabel();
        lbKészlet = new javax.swing.JLabel();
        lbKategoria = new javax.swing.JLabel();
        lbTipus = new javax.swing.JLabel();
        lbCikkSzam = new javax.swing.JLabel();
        lbGyarto = new javax.swing.JLabel();

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

        tfCikkSzam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCikkSzamKeyReleased(evt);
            }
        });

        tfTipus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTipusKeyReleased(evt);
            }
        });

        tfKeszlet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeszletKeyReleased(evt);
            }
        });

        tfMinKeszlet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMinKeszletKeyReleased(evt);
            }
        });

        tfGyarto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfGyartoKeyReleased(evt);
            }
        });

        lbFormatumCikkSzam.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumCikkSzam.setText("Helytelen formátum!");
        lbFormatumCikkSzam.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        tfAFA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAFAKeyReleased(evt);
            }
        });

        tfNetto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNettoKeyReleased(evt);
            }
        });

        lbFormatumMinKeszlet.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumMinKeszlet.setText("Helytelen formátum!");
        lbFormatumMinKeszlet.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        lbFormatumNetto.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumNetto.setText("Helytelen formátum!");
        lbFormatumNetto.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        lbFormatumEgyseg.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumEgyseg.setText("Helytelen formátum!");
        lbFormatumEgyseg.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        lbFormatumAFA.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumAFA.setText("Helytelen formátum!");
        lbFormatumAFA.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        choiceEgyseg.add(Unit.DB);
        choiceEgyseg.add(Unit.mm);

        lbFormatumKeszlet.setForeground(new java.awt.Color(255, 0, 0));
        lbFormatumKeszlet.setText("Helytelen formátum!");
        lbFormatumKeszlet.setToolTipText("");
        lbFormatumCikkSzam.setVisible(false);

        for(Kategoria kat : katLista){
            choiceKategoria.add(kat.getNev());
        }

        lbSzazalek.setText("%");

        javax.swing.GroupLayout jTextPanelLayout = new javax.swing.GroupLayout(jTextPanel);
        jTextPanel.setLayout(jTextPanelLayout);
        jTextPanelLayout.setHorizontalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(tfCikkSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lbFormatumCikkSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipus, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choiceKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(tfKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lbFormatumKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(tfMinKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lbFormatumMinKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(choiceEgyseg, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbFormatumEgyseg, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfBrutto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNetto, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jTextPanelLayout.createSequentialGroup()
                                .addComponent(tfAFA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbSzazalek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFormatumAFA)
                            .addComponent(lbFormatumNetto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jTextPanelLayout.setVerticalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCikkSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFormatumCikkSzam))
                .addGap(18, 18, 18)
                .addComponent(tfGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choiceKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFormatumKeszlet))
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMinKeszlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFormatumMinKeszlet))
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choiceEgyseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFormatumEgyseg))
                .addGap(20, 20, 20)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNetto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFormatumNetto))
                .addGap(19, 19, 19)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbFormatumAFA)
                        .addComponent(lbSzazalek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBrutto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbBruttó1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBruttó1.setText("Bruttó:");

        lbBruttó.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBruttó.setText("ÁFA:");

        lbNetto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNetto.setText("Nettó:");

        lbEgyseg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEgyseg.setText("Egység:");

        lbMinKeszlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMinKeszlet.setText("Minimumkészlet:");

        lbKészlet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKészlet.setText("Készlet:");

        lbKategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKategoria.setText("Kategória:");

        lbTipus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTipus.setText("Típus:");

        lbCikkSzam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCikkSzam.setText("Cikkszám:");
        lbCikkSzam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbGyarto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbGyarto.setText("Gyártó:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbBruttó1)
                    .addComponent(lbBruttó)
                    .addComponent(lbNetto)
                    .addComponent(lbEgyseg)
                    .addComponent(lbMinKeszlet)
                    .addComponent(lbKészlet)
                    .addComponent(lbKategoria)
                    .addComponent(lbTipus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCikkSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGyarto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbGyarto)
                        .addGap(26, 26, 26)
                        .addComponent(lbCikkSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTipus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbKészlet)
                        .addGap(29, 29, 29)
                        .addComponent(lbMinKeszlet)
                        .addGap(18, 18, 18)
                        .addComponent(lbEgyseg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNetto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBruttó, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBruttó1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 63, Short.MAX_VALUE))
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
