/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Egyedek.Aru;
import Egyedek.Megrendeles;
import Egyedek.Partner;
import Utils.Print;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author bagi.richard
 */
public class SzamlaSablonDialog extends javax.swing.JDialog {

    
    private Megrendeles megrendeles;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
   

    
    public SzamlaSablonDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public SzamlaSablonDialog(java.awt.Frame parent, boolean modal, Megrendeles megrendeles) {
        super(parent, modal);
        initComponents();
        this.megrendeles=megrendeles;
        Partner partner =megrendeles.getPartner();
        layout=new GridBagLayout();
        constraints=new GridBagConstraints();
        lbCimzettNev.setText(partner.getNev());
        lbCimzettTelepules.setText(Integer.toString(partner.getIranyitoszam())+", "+partner.getVaros());
        lbCimzettUtca.setText(partner.getCim());
        lbDatum.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd."))); 
        jPanelAruLista.setLayout(layout);
        jPanelAruLista.setComponentOrientation(ComponentOrientation.UNKNOWN);
        jPanelAruLista.setBackground(Color.WHITE);
        addTermek(megrendeles.getLista());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMainPanel = new javax.swing.JPanel();
        jPanelSzamla = new javax.swing.JPanel();
        lbCegNev = new javax.swing.JLabel();
        lbCim = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        lbTelepules = new javax.swing.JLabel();
        lbTelepules1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        lbDatum = new javax.swing.JLabel();
        lbCimzettNev = new javax.swing.JLabel();
        lbCimzettUtca = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        lbVonal = new javax.swing.JLabel();
        Label5 = new javax.swing.JLabel();
        Label6 = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        Label8 = new javax.swing.JLabel();
        Label9 = new javax.swing.JLabel();
        lbVonal1 = new javax.swing.JLabel();
        Label10 = new javax.swing.JLabel();
        lbOsszeg = new javax.swing.JLabel();
        lbCimzettTelepules = new javax.swing.JLabel();
        jPanelAruLista = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));
        setModal(true);
        setResizable(false);

        jMainPanel.setBackground(new java.awt.Color(102, 102, 102));
        jMainPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jPanelSzamla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSzamla.setPreferredSize(new java.awt.Dimension(850, 600));

        lbCegNev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCegNev.setText("MintaCég Kft.");

        lbCim.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbCim.setText("Számla");

        Label1.setBackground(new java.awt.Color(255, 255, 255));
        Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label1.setText("Cég neve");

        lbTelepules.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTelepules.setText("6100, Budapest");

        lbTelepules1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTelepules1.setText("Fő utca 2.");

        Label2.setBackground(new java.awt.Color(255, 255, 255));
        Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label2.setText("Címzett");

        Label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Label3.setText("Dátum:");

        lbDatum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbCimzettNev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbCimzettUtca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Label4.setBackground(new java.awt.Color(255, 255, 255));
        Label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label4.setText("Cikkszám");

        lbVonal.setBackground(new java.awt.Color(255, 255, 255));
        lbVonal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVonal.setText("____________________________________________________________________________________________");
        lbVonal.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Label5.setBackground(new java.awt.Color(255, 255, 255));
        Label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label5.setText("Megnevezés");

        Label6.setBackground(new java.awt.Color(255, 255, 255));
        Label6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label6.setText("Mennyiség");

        Label7.setBackground(new java.awt.Color(255, 255, 255));
        Label7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label7.setText("ÁFA");

        Label8.setBackground(new java.awt.Color(255, 255, 255));
        Label8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label8.setText("Bruttó egységár");

        Label9.setBackground(new java.awt.Color(255, 255, 255));
        Label9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label9.setText("Bruttó mennyiség");

        lbVonal1.setBackground(new java.awt.Color(255, 255, 255));
        lbVonal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbVonal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVonal1.setText("__________________________________________________________________________________________");
        lbVonal1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Label10.setBackground(new java.awt.Color(255, 255, 255));
        Label10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label10.setText("Fizetendő(Bruttó) összesen:");

        lbOsszeg.setBackground(new java.awt.Color(255, 255, 255));
        lbOsszeg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lbCimzettTelepules.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelAruListaLayout = new javax.swing.GroupLayout(jPanelAruLista);
        jPanelAruLista.setLayout(jPanelAruListaLayout);
        jPanelAruListaLayout.setHorizontalGroup(
            jPanelAruListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        jPanelAruListaLayout.setVerticalGroup(
            jPanelAruListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelSzamlaLayout = new javax.swing.GroupLayout(jPanelSzamla);
        jPanelSzamla.setLayout(jPanelSzamlaLayout);
        jPanelSzamlaLayout.setHorizontalGroup(
            jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                                    .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Label4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(Label8)
                                    .addGap(42, 42, 42)
                                    .addComponent(Label9))
                                .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                                    .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCegNev, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTelepules, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTelepules1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(306, 306, 306)
                                    .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                                            .addComponent(Label3)
                                            .addGap(18, 18, 18)
                                            .addComponent(lbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbCimzettTelepules, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCimzettNev, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCimzettUtca, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSzamlaLayout.createSequentialGroup()
                                .addComponent(Label10)
                                .addGap(30, 30, 30)
                                .addComponent(lbOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(lbCim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lbVonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbVonal, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanelAruLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanelSzamlaLayout.setVerticalGroup(
            jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbCim)
                .addGap(31, 31, 31)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label3))
                .addGap(48, 48, 48)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCegNev)
                    .addComponent(lbCimzettNev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addComponent(lbTelepules, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lbTelepules1))
                    .addGroup(jPanelSzamlaLayout.createSequentialGroup()
                        .addComponent(lbCimzettTelepules, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lbCimzettUtca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label4)
                    .addComponent(Label5)
                    .addComponent(Label6)
                    .addComponent(Label7)
                    .addComponent(Label8)
                    .addComponent(Label9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAruLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(lbVonal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSzamlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label10)
                    .addComponent(lbOsszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_print_64px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMainPanelLayout = new javax.swing.GroupLayout(jMainPanel);
        jMainPanel.setLayout(jMainPanelLayout);
        jMainPanelLayout.setHorizontalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMainPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jPanelSzamla, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMainPanelLayout.setVerticalGroup(
            jMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanelSzamla, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        Print print=new Print(jPanelSzamla);
        print.print();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void addTermek(List<Aru> list){
        constraints.gridy=0;       
        for(Aru aru : list){
        JLabel lbCikkszam=new JLabel(Integer.toString(aru.getCikkszam()));
        JLabel lbNev=new JLabel(aru.getNev());
        JLabel lbDb=new JLabel(Integer.toString(aru.getKeszlet()));
        JLabel lbAfa=new JLabel(Integer.toString(aru.getAfa()));
        JLabel lbBruttoEgyseg=new JLabel(Integer.toString(aru.getBrutto()));
        JLabel lbBruttoMennyiseg=new JLabel(Integer.toString(aru.getBrutto()*aru.getKeszlet())); 
        constraints.insets=new Insets(5, 0, 5, 60);
        jPanelAruLista.add(lbCikkszam,constraints);
        jPanelAruLista.add(lbNev,constraints);
        constraints.insets=new Insets(5, 20, 5,60);
        jPanelAruLista.add(lbDb,constraints);  
        jPanelAruLista.add(lbAfa,constraints);
        jPanelAruLista.add(lbBruttoEgyseg,constraints);
        constraints.insets=new Insets(5, 50, 5,130);
        jPanelAruLista.add(lbBruttoMennyiseg,constraints);
        constraints.gridy++;
        }        
        lbOsszeg.setText(Integer.toString(this.megrendeles.getOsszeg()));
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
            java.util.logging.Logger.getLogger(SzamlaSablonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SzamlaSablonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SzamlaSablonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SzamlaSablonDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SzamlaSablonDialog dialog = new SzamlaSablonDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label10;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JLabel Label7;
    private javax.swing.JLabel Label8;
    private javax.swing.JLabel Label9;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jMainPanel;
    private javax.swing.JPanel jPanelAruLista;
    private javax.swing.JPanel jPanelSzamla;
    private javax.swing.JLabel lbCegNev;
    private javax.swing.JLabel lbCim;
    private javax.swing.JLabel lbCimzettNev;
    private javax.swing.JLabel lbCimzettTelepules;
    private javax.swing.JLabel lbCimzettUtca;
    private javax.swing.JLabel lbDatum;
    private javax.swing.JLabel lbOsszeg;
    private javax.swing.JLabel lbTelepules;
    private javax.swing.JLabel lbTelepules1;
    private javax.swing.JLabel lbVonal;
    private javax.swing.JLabel lbVonal1;
    // End of variables declaration//GEN-END:variables
}
