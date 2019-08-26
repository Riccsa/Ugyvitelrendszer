
package GUI;

import Check.DateCheck;
import Check.EmptyCheck;
import DAO.AruRepositoryJDBC;
import DAO.MegrendelesRepositoryJDBC;
import DAO.PartnerRepositoryJDBC;
import Egyedek.Aru;
import Egyedek.Megrendeles;
import File.MegrendelesFileCSV;
import File.PDFFileView;
import File.SzamlaFilePDF;
import JTable.MegrendelesJTable;
import Utils.Filter.Megrendeles.Allapot;
import Utils.Filter.Megrendeles.RogzitDatumAfter;
import Utils.Filter.Megrendeles.RogzitDatumBefore;
import Utils.Filter.Megrendeles.TeljesitDatumAfter;
import Utils.Filter.Megrendeles.TeljesitDatumBefore;
import Utils.Filter.Megrendeles.Tipus;
import Utils.Pattern.MegrendelesPattern;
import Utils.PatternFactory;
import java.awt.Dialog;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bagi.richard
 */
public class MegrendelesDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private MegrendelesJTable MegrendelesJTable;
    private MegrendelesRepositoryJDBC megrendelesJDBC;
    private Megrendeles megrendeles;
    private List<Megrendeles> lista;
    private List<JCheckBox> allapotLista;
    private List<JCheckBox> tipusLista;
    private int selectedRow;
    private int selectedId;
    DateCheck datecheck;
    EmptyCheck emptyCheck;
    LocalDate rogzitDateFrom;
    LocalDate rogzitDateTo;
    LocalDate teljesitDateFrom;
    LocalDate teljesitDateTo;
    MegrendelesPattern mFilter;
   

    public MegrendelesDialog(java.awt.Frame parent, boolean modal) {

        
        super(parent, modal);
        
        allapotLista=new ArrayList<>();
        tipusLista =new ArrayList<>();
        initComponents();

        MegrendelesJTable = new MegrendelesJTable();
        datecheck = new DateCheck();
        emptyCheck = new EmptyCheck();


        try {

            this.megrendelesJDBC = new MegrendelesRepositoryJDBC();
            lista = megrendelesJDBC.findAll();
            this.tableModel = MegrendelesJTable.createTable(lista);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parent, ex.getMessage(), "SQL Hiba", JOptionPane.ERROR_MESSAGE);
        }

        setTableModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMegrendeles = new javax.swing.JTable();
        choiceRendez = new java.awt.Choice();
        tfKereses = new javax.swing.JTextField();
        btnKeres = new javax.swing.JButton();
        lbModosit1 = new java.awt.Label();
        btnReszlet = new javax.swing.JButton();
        lbMegrendeles = new java.awt.Label();
        btnUjMegrendeles = new javax.swing.JButton();
        lbSzmla = new java.awt.Label();
        btnTeljesitve = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chkbxMegrendelt = new javax.swing.JCheckBox();
        chkbxTeljesitett = new javax.swing.JCheckBox();
        tfRogzitDateFrom = new javax.swing.JTextField();
        tfRogzitDateTo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tfTeljesitDateFrom = new javax.swing.JTextField();
        tfTeljesitDateTo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnFilterTorol = new javax.swing.JButton();
        chkbxKimeno = new javax.swing.JCheckBox();
        chkbxBejovo = new javax.swing.JCheckBox();
        btnUjSzamla = new javax.swing.JButton();
        lbDatumKeres3 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        chkExport = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(218, 231, 245));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jTableMegrendeles.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableMegrendeles.setAutoscrolls(false);
        jTableMegrendeles.getTableHeader().setReorderingAllowed(false);
        jTableMegrendeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableMegrendelesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMegrendeles);

        choiceRendez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choiceRendez.add("");
        choiceRendez.add("Rendezés rögzítési dátum szerint növekvő sorrendben");
        choiceRendez.add("Rendezés rögzítési détum szerint csökkenő sorrendben");
        choiceRendez.add("Rendezés teljesítési dátum szerint növekvő sorrendben");
        choiceRendez.add("Rendezés teljesítési détum szerint csökkenő sorrendben");
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

        lbModosit1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbModosit1.setText("Új beszerzés");

        btnReszlet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-more-details-100.png"))); // NOI18N
        btnReszlet.setEnabled(false);
        btnReszlet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReszletActionPerformed(evt);
            }
        });

        lbMegrendeles.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbMegrendeles.setText("Részletek");

        btnUjMegrendeles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/add.png"))); // NOI18N
        btnUjMegrendeles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUjMegrendeles.setBorderPainted(false);
        btnUjMegrendeles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjMegrendeles.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjMegrendeles.setFocusable(false);
        btnUjMegrendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjMegrendelesActionPerformed(evt);
            }
        });

        lbSzmla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbSzmla.setText("Számla készítése");

        btnTeljesitve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-häkchen-48.png"))); // NOI18N
        btnTeljesitve.setEnabled(false);
        btnTeljesitve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeljesitveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("teljesítre állít");

        chkbxMegrendelt.setText("Megrendelt");
        chkbxMegrendelt.setToolTipText("");
        chkbxMegrendelt.setName("megrendelt"); // NOI18N
        chkbxMegrendelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxMegrendeltActionPerformed(evt);
            }
        });

        chkbxTeljesitett.setText("Teljesített");
        chkbxTeljesitett.setName("teljesítve"); // NOI18N
        chkbxTeljesitett.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxTeljesitettActionPerformed(evt);
            }
        });

        tfRogzitDateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfRogzitDateFromMouseClicked(evt);
            }
        });

        tfRogzitDateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfRogzitDateToMouseClicked(evt);
            }
        });

        jLabel2.setText("-tól");

        jLabel4.setText("-ig");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("Rögzítési dátum szerint");

        tfTeljesitDateFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTeljesitDateFromMouseClicked(evt);
            }
        });

        tfTeljesitDateTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfTeljesitDateToMouseClicked(evt);
            }
        });

        jLabel6.setText("-tól");

        jLabel7.setText("-ig");

        jLabel8.setText("Teljesítési dátum szerint");

        btnFilterTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-filter-löschen-40.png"))); // NOI18N
        btnFilterTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterTorolActionPerformed(evt);
            }
        });

        chkbxKimeno.setText("Kimenő");
        chkbxKimeno.setName("kimenő"); // NOI18N
        chkbxKimeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxKimenoActionPerformed(evt);
            }
        });

        chkbxBejovo.setText("Bejövő");
        chkbxBejovo.setName("bejövő"); // NOI18N
        chkbxBejovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxBejovoActionPerformed(evt);
            }
        });

        btnUjSzamla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-purchase-order-64.png"))); // NOI18N
        btnUjSzamla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUjSzamla.setBorderPainted(false);
        btnUjSzamla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjSzamla.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjSzamla.setFocusable(false);
        btnUjSzamla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjSzamlaActionPerformed(evt);
            }
        });

        lbDatumKeres3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbDatumKeres3.setText("Export");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        chkExport.add("");
        chkExport.add("*.csv");
        chkExport.add("*.pdf");
        chkExport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkExportItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnUjMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnReszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbModosit1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSzmla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUjSzamla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDatumKeres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkbxTeljesitett)
                                    .addComponent(chkbxMegrendelt)
                                    .addComponent(chkbxKimeno)
                                    .addComponent(chkbxBejovo)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jButton1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfTeljesitDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfTeljesitDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfRogzitDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfRogzitDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnFilterTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(btnTeljesitve))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1)))))
                .addGap(50, 505, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkbxMegrendelt)
                                    .addComponent(tfRogzitDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfRogzitDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkbxTeljesitett)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfTeljesitDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfTeljesitDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(chkbxKimeno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(chkbxBejovo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFilterTorol))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUjMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUjSzamla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbModosit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSzmla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbDatumKeres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTeljesitve))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(541, Short.MAX_VALUE))
        );

        allapotLista.add(chkbxMegrendelt);
        allapotLista.add(chkbxTeljesitett);
        tipusLista.add(chkbxBejovo);
        tipusLista.add(chkbxKimeno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReszletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReszletActionPerformed

        AruDialog aru = new AruDialog(null, true, "A kiválasztott megrendelés tételes listája", megrendeles.getLista());
        aru.setVisible(true);

    }//GEN-LAST:event_btnReszletActionPerformed

    private void btnUjMegrendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjMegrendelesActionPerformed
        
        UjMegrendelesDialog dialog = new UjMegrendelesDialog(null, true);
        dialog.setVisible(true);
        if (dialog.isOk()) {

            try {
                Megrendeles megrendeles = dialog.getMegrendeles();
                megrendeles = megrendelesJDBC.findById(megrendelesJDBC.add(megrendeles));
                MegrendelesJTable.add(megrendeles, tableModel);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnUjMegrendelesActionPerformed

    private void tfKeresesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeresesKeyReleased
        if (tfKereses.getText().equals("")) {

            try {
                this.tableModel = MegrendelesJTable.createTable(megrendelesJDBC.findAll());
            } catch (SQLException ex) {

            }

            setTableModel();

        }
    }//GEN-LAST:event_tfKeresesKeyReleased

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed

        MegrendelesPattern filter = new MegrendelesPattern(PatternFactory.create(tfKereses.getText()));

        try {

            this.megrendelesJDBC = new MegrendelesRepositoryJDBC();
            this.tableModel = MegrendelesJTable.createTable(filter.findByPattern(megrendelesJDBC.findAll()));

        } catch (SQLException ex) {

        }

        setTableModel();
    }//GEN-LAST:event_btnKeresActionPerformed

    private void btnTeljesitveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeljesitveActionPerformed

        try {

            AruRepositoryJDBC aruJDBC = new AruRepositoryJDBC();
            if (megrendeles.getTipus().equals(Megrendeles.KIMENO)) {
                aruJDBC.updateKeszletIncr(megrendeles.getLista());
                update();
                OptionDialog dialog = new OptionDialog(this, "A kiválasztott megrendelés teljesítve!", true);
                dialog.setVisible(true);

                btnTeljesitve.setEnabled(false);
            } else {
                List<Aru> aruKeves = megrendeles.checkKeszlet();
                if (aruKeves.isEmpty()) {
                    aruJDBC.updateKeszletDecr(megrendeles.getLista());
                    update();
                    OptionDialog dialog = new OptionDialog(this, "A kiválasztott megrendelés teljesítve!", true);
                    dialog.setVisible(true);

                    btnTeljesitve.setEnabled(false);

                } else {
                    AruDialog dialog = new AruDialog(null, true, "A kiválasztott megrendelés készlethiány miatt nem teljesíthető az alábbi tételekre", aruKeves);
                    dialog.setVisible(true);

                }

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }



    }//GEN-LAST:event_btnTeljesitveActionPerformed

    private void choiceRendezItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceRendezItemStateChanged
        if (choiceRendez.getSelectedIndex() != 0) {
            try {
                List<Megrendeles> list = megrendelesJDBC.findAll();
                List<Megrendeles> listOrdered = new ArrayList<>();
                Megrendeles[] megrendelesTomb = list.toArray(new Megrendeles[list.size()]);

                switch (choiceRendez.getSelectedIndex()) {
                    case (1):
                        listOrdered = megrendelesJDBC.orderByRogzitDatum(list);
                        break;
                    case (2):
                        listOrdered = megrendelesJDBC.orderByRogzitDatumDesc(list);
                        break;
                    case (3):
                        listOrdered = megrendelesJDBC.orderByTeljesitDatum(list);
                        break;
                    case (4):
                        listOrdered = megrendelesJDBC.orderByTeljesitDatumDesc(list);
                        break;
                }

                this.tableModel = MegrendelesJTable.createTable(listOrdered);
                setTableModel();

            } catch (SQLException ex) {

            }

        }
    }//GEN-LAST:event_choiceRendezItemStateChanged

    private void chkbxMegrendeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxMegrendeltActionPerformed
       Filter();
    }//GEN-LAST:event_chkbxMegrendeltActionPerformed

    private void tfRogzitDateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRogzitDateFromMouseClicked
        clearTeljesitDate();
        CalendarDialog calendar = new CalendarDialog(null, true);
        calendar.setVisible(true);

        if (calendar.getDate() != null) {
            rogzitDateFrom = calendar.getDate();
            tfRogzitDateFrom.setText(rogzitDateFrom.toString());
            if (emptyCheck.check(tfRogzitDateTo)) {
                rogzitDateTo = LocalDate.parse(tfRogzitDateTo.getText());
                if (rogzitDateFrom.isBefore(rogzitDateTo.plusDays(1))) {
                   Filter();
                }
                
                else {
                    JOptionPane.showMessageDialog(rootPane, "A kezdő dátum nem lehet nagyobb", "Hiba", JOptionPane.OK_OPTION);
                    tfRogzitDateTo.setText("");
                }
            }

        }
    }//GEN-LAST:event_tfRogzitDateFromMouseClicked

    private void tfRogzitDateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRogzitDateToMouseClicked
        clearTeljesitDate();
        CalendarDialog calendar = new CalendarDialog(null, true);
        calendar.setVisible(true);
        if (calendar.getDate() != null) {
            rogzitDateTo = calendar.getDate();
            tfRogzitDateTo.setText(calendar.getDate().toString());
            if (emptyCheck.check(tfRogzitDateFrom)) {
                rogzitDateFrom = LocalDate.parse(tfRogzitDateFrom.getText());
                if (rogzitDateFrom.isBefore(rogzitDateTo.plusDays(1))) {
                   Filter();             

                } else {
                    JOptionPane.showMessageDialog(rootPane, "A kezdő dátum nem lehet nagyobb", "Hiba", JOptionPane.OK_OPTION);
                    clearRogzitDate();
                }
            }
        }

    }//GEN-LAST:event_tfRogzitDateToMouseClicked

    private void tfTeljesitDateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTeljesitDateFromMouseClicked
        clearRogzitDate();
        CalendarDialog calendar = new CalendarDialog(null, true);
        calendar.setVisible(true);

        if (calendar.getDate() != null) {
            teljesitDateFrom = calendar.getDate();
            tfTeljesitDateFrom.setText(calendar.getDate().toString());
            if (emptyCheck.check(tfTeljesitDateTo)) {
                teljesitDateTo = LocalDate.parse(tfTeljesitDateTo.getText());
                if (teljesitDateFrom.isBefore(teljesitDateTo.plusDays(1))) {
                Filter();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "A kezdő dátum nem lehet nagyobb", "Hiba", JOptionPane.OK_OPTION);
                    clearTeljesitDate();
                }

            }
        }


    }//GEN-LAST:event_tfTeljesitDateFromMouseClicked

    private void tfTeljesitDateToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfTeljesitDateToMouseClicked
        clearRogzitDate();
        CalendarDialog calendar = new CalendarDialog(null, true);
        calendar.setVisible(true);

        if (calendar.getDate() != null) {
            teljesitDateTo = calendar.getDate();
            tfTeljesitDateTo.setText(calendar.getDate().toString());
            if (emptyCheck.check(tfTeljesitDateFrom)) {
                teljesitDateFrom = LocalDate.parse(tfTeljesitDateFrom.getText());
                if (teljesitDateFrom.isBefore(teljesitDateTo.plusDays(1))) {
                    Filter();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "A kezdő dátum nem lehet nagyobb", "Hiba", JOptionPane.OK_OPTION);
                    clearTeljesitDate();
                }
            }
        }
    }//GEN-LAST:event_tfTeljesitDateToMouseClicked

    private void chkbxTeljesitettActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxTeljesitettActionPerformed
        Filter();
    }//GEN-LAST:event_chkbxTeljesitettActionPerformed

    private void btnFilterTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterTorolActionPerformed
        clearRogzitDate();
        clearTeljesitDate();
        setChkbxUnselect();
        try {
            this.tableModel=MegrendelesJTable.createTable(megrendelesJDBC.findAll());
        } catch (SQLException ex) {
           
        }
        setTableModel();
    }//GEN-LAST:event_btnFilterTorolActionPerformed

    private void chkbxKimenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxKimenoActionPerformed
        Filter();
    }//GEN-LAST:event_chkbxKimenoActionPerformed

    private void chkbxBejovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxBejovoActionPerformed
       Filter();
    }//GEN-LAST:event_chkbxBejovoActionPerformed

    private void btnUjSzamlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjSzamlaActionPerformed
     
            SzamlaSablonDialog szamla=new SzamlaSablonDialog(null, true, megrendeles);
            szamla.setVisible(true);
     
        
        
    }//GEN-LAST:event_btnUjSzamlaActionPerformed

    private void jTableMegrendelesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMegrendelesMouseReleased
       selectedRow = jTableMegrendeles.getSelectedRow();

        if (selectedRow > -1) {
            selectedId = (Integer) tableModel.getValueAt(jTableMegrendeles.getSelectedRow(), tableModel.findColumn("ID"));
            try {
                megrendeles = megrendelesJDBC.findById(selectedId);
            } catch (SQLException ex) {

            }
        }

        btnReszlet.setEnabled(megrendeles != null);
        btnTeljesitve.setEnabled(megrendeles != null && megrendeles.getAllapot().equals(Megrendeles.MEGRENDELT));
        btnUjSzamla.setEnabled(megrendeles.getTipus().equals(Megrendeles.BEJOVO));
    }//GEN-LAST:event_jTableMegrendelesMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           int retValue = jFileChooser.showSaveDialog(this);

        if (retValue == JFileChooser.APPROVE_OPTION) {
            SzamlaFilePDF fileDPF =new SzamlaFilePDF(jFileChooser.getSelectedFile());
            fileDPF.create(megrendeles);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkExportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkExportItemStateChanged
        if (chkExport.getSelectedIndex() > 0) {
  
            jFileChooser.setDialogTitle("Mentés");
            jFileChooser.setApproveButtonText("Mentés");
            jFileChooser.setFileView(new PDFFileView());
            jFileChooser.setAcceptAllFileFilterUsed(false);
           
            int retValue = jFileChooser.showSaveDialog(this);
            

            if (retValue == JFileChooser.APPROVE_OPTION) {

                switch (chkExport.getSelectedItem()) {
                    case ("*.csv"):
                        MegrendelesFileCSV mf = new MegrendelesFileCSV(jFileChooser.getSelectedFile());
                        mf.exportCSV(lista);
                        break;

                    case ("*.pdf"):
                        SzamlaFilePDF fileDPF = new SzamlaFilePDF(jFileChooser.getSelectedFile());
                        fileDPF.create(megrendeles);

                }

            }
        }
    }//GEN-LAST:event_chkExportItemStateChanged

    private void setTableModel() {

        jTableMegrendeles.setModel(tableModel);
        MegrendelesJTable.setInvisible(tableModel.findColumn("ID"), jTableMegrendeles);
        MegrendelesJTable.setInvisible(tableModel.findColumn("partner_id"), jTableMegrendeles);
        MegrendelesJTable.setInvisible(tableModel.findColumn("dolgozo_id"), jTableMegrendeles);
        
    }
    
    private void clearRogzitDate() {
        tfRogzitDateFrom.setText("");
        tfRogzitDateTo.setText("");
        rogzitDateFrom=null;
        rogzitDateTo=null;
    }
    
    private void clearTeljesitDate() {
        tfTeljesitDateFrom.setText("");
        tfTeljesitDateTo.setText("");
        teljesitDateTo=null;
        rogzitDateFrom=null;
    }
    
    private void setChkbxUnselect() {
        for (JCheckBox checkbox : allapotLista) {
            checkbox.setSelected(false);
        }
        
        for (JCheckBox checkbox : tipusLista) {
            checkbox.setSelected(false);
        }

    }
    
    private void Filter(){
        Tipus tipus = new Tipus(tipusLista);
        Allapot allapot = new Allapot(allapotLista);
        TeljesitDatumAfter teljDatAft = new TeljesitDatumAfter(teljesitDateFrom);
        TeljesitDatumBefore teljDatBef = new TeljesitDatumBefore(teljesitDateTo);
        RogzitDatumAfter rogzDatAft = new RogzitDatumAfter(rogzitDateFrom);
        RogzitDatumBefore rogzDatBef = new RogzitDatumBefore(rogzitDateTo);
        try {
            lista = megrendelesJDBC.findAll();
            List<Megrendeles> filteredList = lista.stream().filter(teljDatBef.and(teljDatAft.and(rogzDatBef.and(rogzDatAft.and(tipus).and(allapot))))).collect(Collectors.toList());
            this.tableModel = MegrendelesJTable.createTable(filteredList);
            setTableModel();
        } catch (SQLException ex) {
            Logger.getLogger(MegrendelesDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void update(){
        try {
            megrendelesJDBC.update(megrendeles);
            megrendeles = megrendelesJDBC.findById(megrendeles.getId());
            MegrendelesJTable.updateRecord(selectedRow, megrendeles, tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(MegrendelesDialog.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MegrendelesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MegrendelesDialog dialog = new MegrendelesDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFilterTorol;
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnReszlet;
    private javax.swing.JButton btnTeljesitve;
    private javax.swing.JButton btnUjMegrendeles;
    private javax.swing.JButton btnUjSzamla;
    private java.awt.Choice chkExport;
    private javax.swing.JCheckBox chkbxBejovo;
    private javax.swing.JCheckBox chkbxKimeno;
    private javax.swing.JCheckBox chkbxMegrendelt;
    private javax.swing.JCheckBox chkbxTeljesitett;
    private java.awt.Choice choiceRendez;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableMegrendeles;
    private java.awt.Label lbDatumKeres3;
    private java.awt.Label lbMegrendeles;
    private java.awt.Label lbModosit1;
    private java.awt.Label lbSzmla;
    private javax.swing.JTextField tfKereses;
    private javax.swing.JTextField tfRogzitDateFrom;
    private javax.swing.JTextField tfRogzitDateTo;
    private javax.swing.JTextField tfTeljesitDateFrom;
    private javax.swing.JTextField tfTeljesitDateTo;
    // End of variables declaration//GEN-END:variables
}
