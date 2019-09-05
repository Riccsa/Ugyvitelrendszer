
package GUI;

import Utils.Calendar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;


public class CalendarDialog extends javax.swing.JDialog {


    private List<JLabel> days;
    Calendar calendar;
    private LocalDate date;
 
    
    public CalendarDialog(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        
        days=new ArrayList<>();
        initComponents();
        calendar=new Calendar(days, lbEv, lbHo);
      

        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbEv = new javax.swing.JLabel();
        lbHo = new javax.swing.JLabel();
        btnRightEv = new javax.swing.JButton();
        btnLeftEv = new javax.swing.JButton();
        btnLeftHo = new javax.swing.JButton();
        btnRightHo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbDay1 = new javax.swing.JLabel();
        lbDay2 = new javax.swing.JLabel();
        lbDay3 = new javax.swing.JLabel();
        lbDay4 = new javax.swing.JLabel();
        lbDay5 = new javax.swing.JLabel();
        lbDay6 = new javax.swing.JLabel();
        lbDay7 = new javax.swing.JLabel();
        lbDay8 = new javax.swing.JLabel();
        lbDay9 = new javax.swing.JLabel();
        lbDay10 = new javax.swing.JLabel();
        lbDay11 = new javax.swing.JLabel();
        lbDay12 = new javax.swing.JLabel();
        lbDay13 = new javax.swing.JLabel();
        lbDay14 = new javax.swing.JLabel();
        lbDay15 = new javax.swing.JLabel();
        lbDay16 = new javax.swing.JLabel();
        lbDay17 = new javax.swing.JLabel();
        lbDay18 = new javax.swing.JLabel();
        lbDay19 = new javax.swing.JLabel();
        lbDay20 = new javax.swing.JLabel();
        lbDay21 = new javax.swing.JLabel();
        lbDay22 = new javax.swing.JLabel();
        lbDay23 = new javax.swing.JLabel();
        lbDay24 = new javax.swing.JLabel();
        lbDay25 = new javax.swing.JLabel();
        lbDay26 = new javax.swing.JLabel();
        lbDay27 = new javax.swing.JLabel();
        lbDay28 = new javax.swing.JLabel();
        lbDay29 = new javax.swing.JLabel();
        lbDay30 = new javax.swing.JLabel();
        lbDay31 = new javax.swing.JLabel();
        lbDay32 = new javax.swing.JLabel();
        lbDay33 = new javax.swing.JLabel();
        lbDay34 = new javax.swing.JLabel();
        lbDay35 = new javax.swing.JLabel();
        lbDay36 = new javax.swing.JLabel();
        lbDay37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(220, 230, 245));

        lbEv.setBackground(new java.awt.Color(153, 255, 153));
        lbEv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbEv.setText("jLabel1");

        lbHo.setBackground(new java.awt.Color(153, 255, 153));
        lbHo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbHo.setText("jLabel1");

        btnRightEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/right-arrow.png"))); // NOI18N
        btnRightEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightEvActionPerformed(evt);
            }
        });

        btnLeftEv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/left_arrow.png"))); // NOI18N
        btnLeftEv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftEvActionPerformed(evt);
            }
        });

        btnLeftHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/left_arrow.png"))); // NOI18N
        btnLeftHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftHoActionPerformed(evt);
            }
        });

        btnRightHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/right-arrow.png"))); // NOI18N
        btnRightHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightHoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("H");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("K");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Sz");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Cs");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("P");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Szo");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("V");

        lbDay1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay1.setText("1");
        lbDay1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbDay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay1MouseClicked(evt);
            }
        });

        lbDay2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay2.setText("1");
        lbDay2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay2MouseClicked(evt);
            }
        });

        lbDay3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay3.setText("1");
        lbDay3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay3MouseClicked(evt);
            }
        });

        lbDay4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay4.setText("1");
        lbDay4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay4MouseClicked(evt);
            }
        });

        lbDay5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay5.setText("1");
        lbDay5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay5MouseClicked(evt);
            }
        });

        lbDay6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay6.setText("1");
        lbDay6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay6MouseClicked(evt);
            }
        });

        lbDay7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay7.setText("1");
        lbDay7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay7MouseClicked(evt);
            }
        });

        lbDay8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay8.setText("1");
        lbDay8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay8MouseClicked(evt);
            }
        });

        lbDay9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay9.setText("1");
        lbDay9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay9MouseClicked(evt);
            }
        });

        lbDay10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay10.setText("1");
        lbDay10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay10MouseClicked(evt);
            }
        });

        lbDay11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay11.setText("1");
        lbDay11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay11MouseClicked(evt);
            }
        });

        lbDay12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay12.setText("1");
        lbDay12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay12MouseClicked(evt);
            }
        });

        lbDay13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay13.setText("1");
        lbDay13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay13MouseClicked(evt);
            }
        });

        lbDay14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay14.setText("1");
        lbDay14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay14MouseClicked(evt);
            }
        });

        lbDay15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay15.setText("1");
        lbDay15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay15MouseClicked(evt);
            }
        });

        lbDay16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay16.setText("1");
        lbDay16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay16MouseClicked(evt);
            }
        });

        lbDay17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay17.setText("1");
        lbDay17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay17MouseClicked(evt);
            }
        });

        lbDay18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay18.setText("1");
        lbDay18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay18MouseClicked(evt);
            }
        });

        lbDay19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay19.setText("1");
        lbDay19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay19MouseClicked(evt);
            }
        });

        lbDay20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay20.setText("1");
        lbDay20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay20MouseClicked(evt);
            }
        });

        lbDay21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay21.setText("1");
        lbDay21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay21MouseClicked(evt);
            }
        });

        lbDay22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay22.setText("1");
        lbDay22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay22MouseClicked(evt);
            }
        });

        lbDay23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay23.setText("1");
        lbDay23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay23MouseClicked(evt);
            }
        });

        lbDay24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay24.setText("1");
        lbDay24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay24MouseClicked(evt);
            }
        });

        lbDay25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay25.setText("1");
        lbDay25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay25MouseClicked(evt);
            }
        });

        lbDay26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay26.setText("1");
        lbDay26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay26MouseClicked(evt);
            }
        });

        lbDay27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay27.setText("1");
        lbDay27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay27MouseClicked(evt);
            }
        });

        lbDay28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay28.setText("1");
        lbDay28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay28MouseClicked(evt);
            }
        });

        lbDay29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay29.setText("1");
        lbDay29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay29MouseClicked(evt);
            }
        });

        lbDay30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay30.setText("1");
        lbDay30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay30MouseClicked(evt);
            }
        });

        lbDay31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay31.setText("1");
        lbDay31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay31MouseClicked(evt);
            }
        });

        lbDay32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay32.setText("1");
        lbDay32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay32MouseClicked(evt);
            }
        });

        lbDay33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay33.setText("1");
        lbDay33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay33MouseClicked(evt);
            }
        });

        lbDay34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay34.setText("1");
        lbDay34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay34MouseClicked(evt);
            }
        });

        lbDay35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay35.setText("1");
        lbDay35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay35MouseClicked(evt);
            }
        });

        lbDay36.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay36.setText("1");
        lbDay36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay36MouseClicked(evt);
            }
        });

        lbDay37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDay37.setText("1");
        lbDay37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDay37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLeftEv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDay1)
                            .addComponent(jLabel1)
                            .addComponent(lbDay8)
                            .addComponent(lbDay15)
                            .addComponent(lbDay22)
                            .addComponent(lbDay29)
                            .addComponent(lbDay36))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDay2)
                            .addComponent(jLabel2)
                            .addComponent(lbDay9)
                            .addComponent(lbDay16)
                            .addComponent(lbDay23)
                            .addComponent(lbDay30)
                            .addComponent(lbDay37))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbDay3)
                            .addComponent(lbDay10)
                            .addComponent(lbDay17)
                            .addComponent(lbDay24)
                            .addComponent(lbDay31))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbDay4)
                            .addComponent(lbDay11)
                            .addComponent(lbDay18)
                            .addComponent(lbDay25)
                            .addComponent(lbDay32))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(lbDay5))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbDay13)
                                            .addComponent(lbDay6)
                                            .addComponent(lbDay20)
                                            .addComponent(lbDay27)
                                            .addComponent(lbDay34)))))
                            .addComponent(lbDay12)
                            .addComponent(lbDay19)
                            .addComponent(lbDay26)
                            .addComponent(lbDay33)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbEv)
                        .addGap(20, 20, 20)
                        .addComponent(btnRightEv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLeftHo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbHo)
                        .addGap(20, 20, 20)
                        .addComponent(btnRightHo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDay7)
                    .addComponent(jLabel7)
                    .addComponent(lbDay14)
                    .addComponent(lbDay21)
                    .addComponent(lbDay28)
                    .addComponent(lbDay35))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeftEv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRightEv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeftHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRightHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDay36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDay37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        days.add(lbDay1);  days.add(lbDay2);  days.add(lbDay3);  days.add(lbDay4);  days.add(lbDay5);  days.add(lbDay6);  days.add(lbDay7);  days.add(lbDay8);  days.add(lbDay9);  days.add(lbDay10);  days.add(lbDay11);  days.add(lbDay12);  days.add(lbDay13);  days.add(lbDay14);  days.add(lbDay15);  days.add(lbDay16);  days.add(lbDay17);  days.add(lbDay18);  days.add(lbDay19);  days.add(lbDay20);  days.add(lbDay21);  days.add(lbDay22);  days.add(lbDay23);  days.add(lbDay24);  days.add(lbDay25);  days.add(lbDay26);  days.add(lbDay27);  days.add(lbDay28);  days.add(lbDay29);  days.add(lbDay30);  days.add(lbDay31);  days.add(lbDay32);  days.add(lbDay33);  days.add(lbDay34);  days.add(lbDay35); days.add(lbDay36); days.add(lbDay37);     for(int i=0; i<days.size(); i++){  days.get(i).setText("");  }  

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRightEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightEvActionPerformed
        calendar.nextYear();
    }//GEN-LAST:event_btnRightEvActionPerformed

    private void btnLeftEvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftEvActionPerformed
        calendar.previousYear();
    }//GEN-LAST:event_btnLeftEvActionPerformed

    private void btnRightHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightHoActionPerformed
        calendar.nextMonth();
    }//GEN-LAST:event_btnRightHoActionPerformed

    private void btnLeftHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftHoActionPerformed
        calendar.previousMonth();
    }//GEN-LAST:event_btnLeftHoActionPerformed

    private void lbDay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay1MouseClicked
        getDateFromLabel(lbDay1);
    }//GEN-LAST:event_lbDay1MouseClicked

    private void lbDay2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay2MouseClicked
        getDateFromLabel(lbDay2);
    }//GEN-LAST:event_lbDay2MouseClicked

    private void lbDay3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay3MouseClicked
        getDateFromLabel(lbDay3);
    }//GEN-LAST:event_lbDay3MouseClicked

    private void lbDay4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay4MouseClicked
        getDateFromLabel(lbDay4);
    }//GEN-LAST:event_lbDay4MouseClicked

    private void lbDay5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay5MouseClicked
        getDateFromLabel(lbDay5);
    }//GEN-LAST:event_lbDay5MouseClicked

    private void lbDay6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay6MouseClicked
        getDateFromLabel(lbDay6);
    }//GEN-LAST:event_lbDay6MouseClicked

    private void lbDay7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay7MouseClicked
        getDateFromLabel(lbDay7);
    }//GEN-LAST:event_lbDay7MouseClicked

    private void lbDay8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay8MouseClicked
        getDateFromLabel(lbDay8);
    }//GEN-LAST:event_lbDay8MouseClicked

    private void lbDay9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay9MouseClicked
        getDateFromLabel(lbDay9);
    }//GEN-LAST:event_lbDay9MouseClicked

    private void lbDay10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay10MouseClicked
        getDateFromLabel(lbDay10);
    }//GEN-LAST:event_lbDay10MouseClicked

    private void lbDay11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay11MouseClicked
        getDateFromLabel(lbDay11);
    }//GEN-LAST:event_lbDay11MouseClicked

    private void lbDay12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay12MouseClicked
        getDateFromLabel(lbDay12);
    }//GEN-LAST:event_lbDay12MouseClicked

    private void lbDay13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay13MouseClicked
        getDateFromLabel(lbDay13);
    }//GEN-LAST:event_lbDay13MouseClicked

    private void lbDay14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay14MouseClicked
        getDateFromLabel(lbDay14);
    }//GEN-LAST:event_lbDay14MouseClicked

    private void lbDay15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay15MouseClicked
        getDateFromLabel(lbDay15);
    }//GEN-LAST:event_lbDay15MouseClicked

    private void lbDay16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay16MouseClicked
       getDateFromLabel(lbDay16);
    }//GEN-LAST:event_lbDay16MouseClicked

    private void lbDay17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay17MouseClicked
        getDateFromLabel(lbDay17);
    }//GEN-LAST:event_lbDay17MouseClicked

    private void lbDay18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay18MouseClicked
      getDateFromLabel(lbDay18);
    }//GEN-LAST:event_lbDay18MouseClicked

    private void lbDay19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay19MouseClicked
       getDateFromLabel(lbDay19);
    }//GEN-LAST:event_lbDay19MouseClicked

    private void lbDay20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay20MouseClicked
        getDateFromLabel(lbDay20);
    }//GEN-LAST:event_lbDay20MouseClicked

    private void lbDay21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay21MouseClicked
       getDateFromLabel(lbDay21);
    }//GEN-LAST:event_lbDay21MouseClicked

    private void lbDay22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay22MouseClicked
        getDateFromLabel(lbDay22);
    }//GEN-LAST:event_lbDay22MouseClicked

    private void lbDay23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay23MouseClicked
        getDateFromLabel(lbDay23);
    }//GEN-LAST:event_lbDay23MouseClicked

    private void lbDay24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay24MouseClicked
        getDateFromLabel(lbDay24);
    }//GEN-LAST:event_lbDay24MouseClicked

    private void lbDay25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay25MouseClicked
         getDateFromLabel(lbDay25);
    }//GEN-LAST:event_lbDay25MouseClicked

    private void lbDay26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay26MouseClicked
         getDateFromLabel(lbDay26);
    }//GEN-LAST:event_lbDay26MouseClicked

    private void lbDay27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay27MouseClicked
         getDateFromLabel(lbDay27);
    }//GEN-LAST:event_lbDay27MouseClicked

    private void lbDay28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay28MouseClicked
         getDateFromLabel(lbDay28);
    }//GEN-LAST:event_lbDay28MouseClicked

    private void lbDay29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay29MouseClicked
         getDateFromLabel(lbDay29);
    }//GEN-LAST:event_lbDay29MouseClicked

    private void lbDay30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay30MouseClicked
         getDateFromLabel(lbDay30);
    }//GEN-LAST:event_lbDay30MouseClicked

    private void lbDay31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay31MouseClicked
         getDateFromLabel(lbDay31);
    }//GEN-LAST:event_lbDay31MouseClicked

    private void lbDay32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay32MouseClicked
         getDateFromLabel(lbDay32);
    }//GEN-LAST:event_lbDay32MouseClicked

    private void lbDay33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay33MouseClicked
         getDateFromLabel(lbDay33);
    }//GEN-LAST:event_lbDay33MouseClicked

    private void lbDay34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay34MouseClicked
         getDateFromLabel(lbDay34);
    }//GEN-LAST:event_lbDay34MouseClicked

    private void lbDay35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay35MouseClicked
         getDateFromLabel(lbDay35);
    }//GEN-LAST:event_lbDay35MouseClicked

    private void lbDay36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay36MouseClicked
        getDateFromLabel(lbDay36);
    }//GEN-LAST:event_lbDay36MouseClicked

    private void lbDay37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDay37MouseClicked
        getDateFromLabel(lbDay37);
    }//GEN-LAST:event_lbDay37MouseClicked

    public LocalDate getDate() {
     
        return date;
    }
    
    private void getDateFromLabel(JLabel label){
        if(!label.getText().equals("")){
            date=LocalDate.of(calendar.getYear(), calendar.getMonthValue(), Integer.parseInt(label.getText()));
              this.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(CalendarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalendarDialog dialog = new CalendarDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLeftEv;
    private javax.swing.JButton btnLeftHo;
    private javax.swing.JButton btnRightEv;
    private javax.swing.JButton btnRightHo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDay1;
    private javax.swing.JLabel lbDay10;
    private javax.swing.JLabel lbDay11;
    private javax.swing.JLabel lbDay12;
    private javax.swing.JLabel lbDay13;
    private javax.swing.JLabel lbDay14;
    private javax.swing.JLabel lbDay15;
    private javax.swing.JLabel lbDay16;
    private javax.swing.JLabel lbDay17;
    private javax.swing.JLabel lbDay18;
    private javax.swing.JLabel lbDay19;
    private javax.swing.JLabel lbDay2;
    private javax.swing.JLabel lbDay20;
    private javax.swing.JLabel lbDay21;
    private javax.swing.JLabel lbDay22;
    private javax.swing.JLabel lbDay23;
    private javax.swing.JLabel lbDay24;
    private javax.swing.JLabel lbDay25;
    private javax.swing.JLabel lbDay26;
    private javax.swing.JLabel lbDay27;
    private javax.swing.JLabel lbDay28;
    private javax.swing.JLabel lbDay29;
    private javax.swing.JLabel lbDay3;
    private javax.swing.JLabel lbDay30;
    private javax.swing.JLabel lbDay31;
    private javax.swing.JLabel lbDay32;
    private javax.swing.JLabel lbDay33;
    private javax.swing.JLabel lbDay34;
    private javax.swing.JLabel lbDay35;
    private javax.swing.JLabel lbDay36;
    private javax.swing.JLabel lbDay37;
    private javax.swing.JLabel lbDay4;
    private javax.swing.JLabel lbDay5;
    private javax.swing.JLabel lbDay6;
    private javax.swing.JLabel lbDay7;
    private javax.swing.JLabel lbDay8;
    private javax.swing.JLabel lbDay9;
    private javax.swing.JLabel lbEv;
    private javax.swing.JLabel lbHo;
    // End of variables declaration//GEN-END:variables
}
