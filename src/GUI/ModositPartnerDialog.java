
package GUI;

import Check.DateCheck;
import Check.EmailCheck;
import Check.EmptyCheck;
import Check.NumberFormatCheck;
import Egyedek.Partner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class ModositPartnerDialog extends javax.swing.JDialog {

    private boolean ok = false;
    private Partner partner;
    private List<JTextField> textList=new ArrayList<>();
    private EmptyCheck emptyCheck;
    private DateCheck dateCheck;
    private EmailCheck emailCheck;
    NumberFormatCheck numCheck;

    public ModositPartnerDialog(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        btnOk.setEnabled(false);
        emptyCheck=new EmptyCheck();
        dateCheck=new DateCheck();
        emailCheck=new EmailCheck();
        numCheck = new NumberFormatCheck();
        
    }
   

    public ModositPartnerDialog(java.awt.Frame parent, boolean modal, Partner partner) {

        super(parent, modal);
        initComponents();
        this.partner=partner;
        tfAdoSzam.setText(Integer.toString(partner.getAdoszam()));
        tfNev.setText(partner.getNev());
        tfIrSzam.setText(Integer.toString(partner.getIranyitoszam()));
        tfVaros.setText(partner.getVaros());
        tfCim.setText(partner.getCim());
        choiceTipus.select(partner.getTipus());
        tfUgyfelNev.setText(partner.getKapcsolattarto_nev()); 
        tfUgyfelTelszam.setText(partner.getKapcsolattarto_telszam());
        tfUgyfelEmail.setText(partner.getKapcsolattarto_email());
        
        emptyCheck=new EmptyCheck();
        dateCheck=new DateCheck();
        emailCheck=new EmailCheck();  
        numCheck = new NumberFormatCheck();
        lbEmailCheck.setVisible(false);
        

    }

    public Partner getPartner() {
        
        Integer adoSzam = Integer.parseInt(tfAdoSzam.getText());     
        String nev = tfNev.getText();
        String varos=tfVaros.getText();
        Integer irSzam = Integer.parseInt(tfIrSzam.getText());
        String cim = tfCim.getText();
        String tipus = choiceTipus.getSelectedItem();
        String ugyfelNev = tfUgyfelNev.getText();
        String ugyfelTelSzam = tfUgyfelTelszam.getText();
        String ugyfelEmail = tfUgyfelEmail.getText();

        Partner ujPartner=new Partner(partner.getId(),nev,adoSzam,irSzam,varos,cim,tipus,ugyfelNev,ugyfelTelSzam,ugyfelEmail);

        return ujPartner;
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
        tfNev = new javax.swing.JTextField();
        tfIrSzam = new javax.swing.JTextField();
        tfCim = new javax.swing.JTextField();
        tfVaros = new javax.swing.JTextField();
        tfUgyfelNev = new javax.swing.JTextField();
        tfAdoSzam = new javax.swing.JTextField();
        lbEmailCheck = new javax.swing.JLabel();
        tfUgyfelTelszam = new javax.swing.JTextField();
        tfUgyfelEmail = new javax.swing.JTextField();
        lbAdoSzamCheck = new javax.swing.JLabel();
        lbIrSzamCheck = new javax.swing.JLabel();
        choiceTipus = new java.awt.Choice();
        lbNev = new javax.swing.JLabel();
        lbIrSzam = new javax.swing.JLabel();
        lbVaros = new javax.swing.JLabel();
        lbCim = new javax.swing.JLabel();
        lbTipus = new javax.swing.JLabel();
        lbUgyfelEmail = new javax.swing.JLabel();
        lbUgyfelNev = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbUgyfelTelSzam = new javax.swing.JLabel();

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

        textList.add(tfNev);
        textList.add(tfAdoSzam);
        textList.add(tfIrSzam);
        textList.add(tfVaros);
        textList.add(tfCim);
        textList.add(tfUgyfelNev);

        lbAdoSzamCheck.setVisible(false);
        lbEmailCheck.setVisible(false);
        lbIrSzamCheck.setVisible(false);

        choiceTipus.add("");
        choiceTipus.add(Partner.BESZALLITO);
        choiceTipus.add(Partner.VEVO);

        tfNev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNevKeyReleased(evt);
            }
        });

        tfIrSzam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIrSzamKeyReleased(evt);
            }
        });

        tfCim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCimKeyReleased(evt);
            }
        });

        tfVaros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfVarosKeyReleased(evt);
            }
        });

        tfUgyfelNev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUgyfelNevKeyReleased(evt);
            }
        });

        tfAdoSzam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAdoSzamKeyReleased(evt);
            }
        });

        lbEmailCheck.setForeground(new java.awt.Color(255, 0, 0));
        lbEmailCheck.setText("Helytelen email!");
        lbEmailCheck.setToolTipText("");
        lbEmailCheck.setVisible(false);

        tfUgyfelTelszam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUgyfelTelszamKeyReleased(evt);
            }
        });

        tfUgyfelEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUgyfelEmailKeyReleased(evt);
            }
        });

        lbAdoSzamCheck.setForeground(new java.awt.Color(255, 0, 0));
        lbAdoSzamCheck.setText("Helytelen formátum!");
        lbAdoSzamCheck.setToolTipText("");
        lbEmailCheck.setVisible(false);

        lbIrSzamCheck.setForeground(new java.awt.Color(255, 0, 0));
        lbIrSzamCheck.setText("Helytelen formátum!");
        lbIrSzamCheck.setToolTipText("");
        lbEmailCheck.setVisible(false);

        choiceTipus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceTipusItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jTextPanelLayout = new javax.swing.GroupLayout(jTextPanel);
        jTextPanel.setLayout(jTextPanelLayout);
        jTextPanelLayout.setHorizontalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(tfUgyfelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmailCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addComponent(tfIrSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbIrSzamCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jTextPanelLayout.createSequentialGroup()
                        .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(choiceTipus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfUgyfelTelszam, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(tfUgyfelNev)
                            .addComponent(tfCim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVaros, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAdoSzam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNev, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbAdoSzamCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        jTextPanelLayout.setVerticalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAdoSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdoSzamCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIrSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIrSzamCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfVaros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfCim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(choiceTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(tfUgyfelNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfUgyfelTelszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUgyfelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        lbNev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNev.setText("Név:");
        lbNev.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbIrSzam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIrSzam.setText("Irányítószám:");

        lbVaros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVaros.setText("Város:");

        lbCim.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCim.setText("Cím:");

        lbTipus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTipus.setText("Típus:");

        lbUgyfelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUgyfelEmail.setText("Kapcsolattartó neve:");

        lbUgyfelNev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUgyfelNev.setText("Kapcsolattartó email címe:");
        lbUgyfelNev.setToolTipText("");

        lbId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbId.setText("Adószám:");

        lbUgyfelTelSzam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUgyfelTelSzam.setText("Kapcsolattartó  telefonszáma:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbId)
                            .addComponent(lbIrSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVaros)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCim, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTipus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUgyfelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUgyfelNev, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbUgyfelTelSzam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNev, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbId)
                                .addGap(18, 18, 18)
                                .addComponent(lbIrSzam, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lbVaros)
                                .addGap(26, 26, 26)
                                .addComponent(lbCim)
                                .addGap(18, 18, 18)
                                .addComponent(lbTipus)
                                .addGap(28, 28, 28)
                                .addComponent(lbUgyfelEmail)
                                .addGap(27, 27, 27)
                                .addComponent(lbUgyfelNev)
                                .addGap(18, 18, 18)
                                .addComponent(lbUgyfelTelSzam)
                                .addGap(56, 56, 56)))))
                .addContainerGap(55, Short.MAX_VALUE))
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

    private void tfNevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNevKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
       
    }//GEN-LAST:event_tfNevKeyReleased

    private void tfAdoSzamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAdoSzamKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
       lbAdoSzamCheck.setVisible(!numCheck.check(tfAdoSzam));
    }//GEN-LAST:event_tfAdoSzamKeyReleased

    private void tfIrSzamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIrSzamKeyReleased
      btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam)  && !choiceTipus.getSelectedItem().equals(""));
      lbIrSzamCheck.setVisible(!numCheck.check(tfIrSzam));
    }//GEN-LAST:event_tfIrSzamKeyReleased

    private void tfVarosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVarosKeyReleased
        btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam)  && !choiceTipus.getSelectedItem().equals(""));

    }//GEN-LAST:event_tfVarosKeyReleased

    private void tfCimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCimKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
    }//GEN-LAST:event_tfCimKeyReleased

    private void tfUgyfelNevKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUgyfelNevKeyReleased
        btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals("")); 
    }//GEN-LAST:event_tfUgyfelNevKeyReleased

    private void tfUgyfelTelszamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUgyfelTelszamKeyReleased
        btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
        
    }//GEN-LAST:event_tfUgyfelTelszamKeyReleased

    private void tfUgyfelEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUgyfelEmailKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
       lbEmailCheck.setVisible(!emailCheck.check(tfUgyfelEmail));
    }//GEN-LAST:event_tfUgyfelEmailKeyReleased

    private void choiceTipusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceTipusItemStateChanged
       btnOk.setEnabled(emptyCheck.check(textList) && numCheck.check(tfAdoSzam) && numCheck.check(tfIrSzam) && !choiceTipus.getSelectedItem().equals(""));
    }//GEN-LAST:event_choiceTipusItemStateChanged

    
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
            java.util.logging.Logger.getLogger(ModositPartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModositPartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModositPartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModositPartnerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModositPartnerDialog dialog = new ModositPartnerDialog(new javax.swing.JFrame(), true);
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
    private java.awt.Choice choiceTipus;
    private javax.swing.JPanel jTextPanel;
    private javax.swing.JLabel lbAdoSzamCheck;
    private javax.swing.JLabel lbCim;
    private javax.swing.JLabel lbEmailCheck;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbIrSzam;
    private javax.swing.JLabel lbIrSzamCheck;
    private javax.swing.JLabel lbNev;
    private javax.swing.JLabel lbTipus;
    private javax.swing.JLabel lbUgyfelEmail;
    private javax.swing.JLabel lbUgyfelNev;
    private javax.swing.JLabel lbUgyfelTelSzam;
    private javax.swing.JLabel lbVaros;
    private javax.swing.JTextField tfAdoSzam;
    private javax.swing.JTextField tfCim;
    private javax.swing.JTextField tfIrSzam;
    private javax.swing.JTextField tfNev;
    private javax.swing.JTextField tfUgyfelEmail;
    private javax.swing.JTextField tfUgyfelNev;
    private javax.swing.JTextField tfUgyfelTelszam;
    private javax.swing.JTextField tfVaros;
    // End of variables declaration//GEN-END:variables
}
