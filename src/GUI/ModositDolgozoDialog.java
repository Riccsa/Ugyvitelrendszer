
package GUI;

import Check.DateCheck;
import Check.EmailCheck;
import Check.EmptyCheck;
import Egyedek.Dolgozo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class ModositDolgozoDialog extends javax.swing.JDialog {

    private boolean ok = false;
    private Dolgozo dolgozo;
    private List<JTextField> textList=new ArrayList<>();
    private EmptyCheck emptyCheck;
    private DateCheck dateCheck;
    private EmailCheck emailCheck;

    public ModositDolgozoDialog(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        btnOk.setEnabled(false);
        emptyCheck=new EmptyCheck();
        dateCheck=new DateCheck();
        emailCheck=new EmailCheck();
    }
   

    public ModositDolgozoDialog(java.awt.Frame parent, boolean modal, Dolgozo dolgozo) {

        super(parent, modal);
        initComponents();
        this.dolgozo=dolgozo;
        tfId.setText(dolgozo.getSzemelyiSzam());
        tfNev.setText(dolgozo.getNev());
        tfSzuletesiHely.setText(dolgozo.getSzuletesiHely());
        tfSzuletesiDatum.setText(dolgozo.getSzuletesiDatum().toString());
        tfLakhely.setText(dolgozo.getLakhely());
        tfBeosztas.setText(dolgozo.getBeosztas());
        tfEmail.setText(dolgozo.getEmail());  
        
        emptyCheck=new EmptyCheck();
        dateCheck=new DateCheck();
        emailCheck=new EmailCheck();
        
        lbDatumCheck.setVisible(false);
        lbEmailCheck.setVisible(false);

    }

    public Dolgozo getDolgozo() {
        
        String szemelyiSzam;
        szemelyiSzam = tfId.getText();
        LocalDate szulDatum = LocalDate.parse(tfSzuletesiDatum.getText());
        String nev = tfNev.getText();
        String SzulHely = tfSzuletesiHely.getText();
        String lakhely = tfLakhely.getText();
        String beosztas = tfBeosztas.getText();
        String email = tfEmail.getText();
        
        //dolgozo = new Dolgozo(nev, szemelyiSzam, SzulHely, szulDatum, lakhely, beosztas, email);
        Dolgozo ujDolgozo=new Dolgozo(dolgozo.getId(),nev,szemelyiSzam,SzulHely,szulDatum,lakhely,beosztas,email);

        return ujDolgozo;
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
        tfSzuletesiHely = new javax.swing.JTextField();
        tfLakhely = new javax.swing.JTextField();
        tfSzuletesiDatum = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfBeosztas = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        lbDatumCheck = new javax.swing.JLabel();
        lbEmailCheck = new javax.swing.JLabel();
        jLabelPanel = new javax.swing.JPanel();
        lbNev = new javax.swing.JLabel();
        lbSzuletesiHely = new javax.swing.JLabel();
        lbSzuletesiDatum = new javax.swing.JLabel();
        lbLakHely = new javax.swing.JLabel();
        lbBeosztas = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();

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
        textList.add(tfId);
        textList.add(tfSzuletesiHely);
        textList.add(tfSzuletesiDatum);
        textList.add(tfLakhely);
        textList.add(tfBeosztas);
        textList.add(tfEmail);

        tfNev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNevKeyReleased(evt);
            }
        });

        tfSzuletesiHely.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSzuletesiHelyKeyReleased(evt);
            }
        });

        tfLakhely.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLakhelyKeyReleased(evt);
            }
        });

        tfSzuletesiDatum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSzuletesiDatumKeyReleased(evt);
            }
        });

        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfEmailKeyReleased(evt);
            }
        });

        tfBeosztas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBeosztasKeyReleased(evt);
            }
        });

        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIdKeyReleased(evt);
            }
        });

        lbDatumCheck.setForeground(new java.awt.Color(255, 0, 0));
        lbDatumCheck.setText("Helytelen dátum!  (pld. 1900-01-01)");
        lbDatumCheck.setToolTipText("");
        lbDatumCheck.setVisible(false);

        lbEmailCheck.setForeground(new java.awt.Color(255, 0, 0));
        lbEmailCheck.setText("Helytelen email!");
        lbEmailCheck.setToolTipText("");
        lbEmailCheck.setVisible(false);

        javax.swing.GroupLayout jTextPanelLayout = new javax.swing.GroupLayout(jTextPanel);
        jTextPanel.setLayout(jTextPanelLayout);
        jTextPanelLayout.setHorizontalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(tfBeosztas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfLakhely, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSzuletesiDatum, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSzuletesiHely, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNev, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDatumCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbEmailCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addContainerGap())
        );
        jTextPanelLayout.setVerticalGroup(
            jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTextPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(tfNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSzuletesiHely, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSzuletesiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatumCheck))
                .addGap(18, 18, 18)
                .addComponent(tfLakhely, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfBeosztas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailCheck))
                .addGap(63, 63, 63))
        );

        lbNev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNev.setText("Név:");
        lbNev.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lbSzuletesiHely.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSzuletesiHely.setText("Születési hely:");

        lbSzuletesiDatum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSzuletesiDatum.setText("Születési Dátum:");

        lbLakHely.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbLakHely.setText("Lakhely:");

        lbBeosztas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBeosztas.setText("Beosztás:");

        lbEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbEmail.setText("E-mail  cím:");

        lbId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbId.setText("Személyi szám:");

        javax.swing.GroupLayout jLabelPanelLayout = new javax.swing.GroupLayout(jLabelPanel);
        jLabelPanel.setLayout(jLabelPanelLayout);
        jLabelPanelLayout.setHorizontalGroup(
            jLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPanelLayout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(jLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSzuletesiHely, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSzuletesiDatum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLakHely, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbBeosztas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jLabelPanelLayout.setVerticalGroup(
            jLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbId)
                .addGap(18, 18, 18)
                .addComponent(lbSzuletesiHely, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSzuletesiDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbLakHely)
                .addGap(26, 26, 26)
                .addComponent(lbBeosztas)
                .addGap(18, 18, 18)
                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
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
                        .addGap(49, 49, 49)
                        .addComponent(jTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
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
       btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfNevKeyReleased

    private void tfIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfIdKeyReleased

    private void tfSzuletesiHelyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSzuletesiHelyKeyReleased
      btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfSzuletesiHelyKeyReleased

    private void tfSzuletesiDatumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSzuletesiDatumKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
       lbDatumCheck.setVisible(!dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfSzuletesiDatumKeyReleased

    private void tfLakhelyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLakhelyKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfLakhelyKeyReleased

    private void tfBeosztasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBeosztasKeyReleased
      btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
    }//GEN-LAST:event_tfBeosztasKeyReleased

    private void tfEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyReleased
       btnOk.setEnabled(emptyCheck.check(textList) && emailCheck.check(tfEmail) && dateCheck.check(tfSzuletesiDatum));
       lbEmailCheck.setVisible(!emailCheck.check(tfEmail));
       
    }//GEN-LAST:event_tfEmailKeyReleased

    
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
            java.util.logging.Logger.getLogger(ModositDolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModositDolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModositDolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModositDolgozoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModositDolgozoDialog dialog = new ModositDolgozoDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jLabelPanel;
    private javax.swing.JPanel jTextPanel;
    private javax.swing.JLabel lbBeosztas;
    private javax.swing.JLabel lbDatumCheck;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmailCheck;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbLakHely;
    private javax.swing.JLabel lbNev;
    private javax.swing.JLabel lbSzuletesiDatum;
    private javax.swing.JLabel lbSzuletesiHely;
    private javax.swing.JTextField tfBeosztas;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfLakhely;
    private javax.swing.JTextField tfNev;
    private javax.swing.JTextField tfSzuletesiDatum;
    private javax.swing.JTextField tfSzuletesiHely;
    // End of variables declaration//GEN-END:variables
}
