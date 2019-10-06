
package GUI;

import DAO.AruRepositoryJDBC;
import DAO.KategoriaRepositoryJDBC;
import DAO.MegrendelesRepositoryJDBC;
import Egyedek.Aru;
import Egyedek.Kategoria;
import Egyedek.Megrendeles;
import File.AruFileCSV;
import File.CSVFilter;
import File.MyFileChooser;
import JTable.AruJTable;
import Utils.Comparator.AruDbComparator;
import Utils.Comparator.AruMinDbComparator;
import Utils.Comparator.AruNettoComparator;
import Utils.Comparator.AruNevComparator;
import Utils.Filter.Aru.FilterGyarto;
import Utils.Filter.Aru.FilterKategoria;
import Utils.Pattern.AruPattern;
import Utils.PatternFactory;
import Utils.AruTableCellColorRenderer;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AruDialog extends javax.swing.JDialog {

    private DefaultTableModel tableModel;
    private AruJTable AruJTable;
    private AruRepositoryJDBC aruJDBC;
    private Aru aru;
    private List<Aru> aruLista;
    private List<Kategoria> katLista;



    public AruDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        try {
            katLista = new KategoriaRepositoryJDBC().findAll();
            this.aruJDBC = new AruRepositoryJDBC();
            aruLista = aruJDBC.findAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
        }

        initComponents();

        AruJTable = new AruJTable();
        this.tableModel = AruJTable.createTable(aruLista);
        setTableModel();

    }

    
    public AruDialog(java.awt.Frame parent, boolean modal, String szoveg, List<Aru> list) {

        super(parent, modal);
        try {
            katLista = new KategoriaRepositoryJDBC().findAll();
            this.aruJDBC=new AruRepositoryJDBC();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);

        }
        initComponents();
        
        aruLista = list;
        lbSzoveg.setText(szoveg);

        if (!lbSzoveg.getText().isEmpty()) {
            buttonPanel.setVisible(false);
        }
        if (lbSzoveg.getText().equals("A kiválasztott megrendelés készlethiány miatt nem teljesíthető az alábbi tételekre")) {
            btnRendel.setVisible(true);
            lbRendel.setVisible(true);
        }

        String[] columnLabel = {"ID", "kategoria_id", "Cikkszám", "Gyártó", "Típus", "Kategória", "Megrendelt mennyiség", "Minimum készlet", "Egység", "Nettó", "Bruttó", "ÁFA"};

        AruJTable = new AruJTable(columnLabel);

        this.tableModel = AruJTable.createTable(aruLista);
        setTableModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        MainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAru = new javax.swing.JTable();
        buttonPanel = new javax.swing.JPanel();
        btnTorol = new javax.swing.JButton();
        lbUj = new java.awt.Label();
        lbModosit1 = new java.awt.Label();
        lbTorol = new java.awt.Label();
        btnTortenet = new javax.swing.JButton();
        lbMegrendeles = new java.awt.Label();
        btnModosit = new javax.swing.JButton();
        btnUjAru = new javax.swing.JButton();
        btnCSVExport = new javax.swing.JButton();
        lbDatumKeres2 = new java.awt.Label();
        choiceRendez = new java.awt.Choice();
        tfKereses = new javax.swing.JTextField();
        btnKeres = new javax.swing.JButton();
        FilterPanel = new javax.swing.JPanel();
        choiceGyarto = new java.awt.Choice();
        lbGyarto = new java.awt.Label();
        choiceKat = new java.awt.Choice();
        lbKategoria = new java.awt.Label();
        btnFilterTorol = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbSzoveg = new javax.swing.JLabel();
        btnRendel = new javax.swing.JButton();
        lbRendel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        MainPanel.setBackground(new java.awt.Color(218, 231, 245));
        MainPanel.setPreferredSize(new java.awt.Dimension(1980, 1080));

        jTableAru.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableAru.setAutoscrolls(false);
        jTableAru.getTableHeader().setReorderingAllowed(false);
        jTableAru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableAruMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAru);

        buttonPanel.setBackground(new java.awt.Color(218, 231, 245));
        buttonPanel.setVisible(lbSzoveg.getText().equals(""));

        btnTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/delete.png"))); // NOI18N
        btnTorol.setEnabled(false);
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

        btnTortenet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-purchase-order-64.png"))); // NOI18N

        lbMegrendeles.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbMegrendeles.setText("Áru történet");

        btnModosit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/wrench.png"))); // NOI18N
        btnModosit.setPreferredSize(new java.awt.Dimension(60, 60));
        btnModosit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModositActionPerformed(evt);
            }
        });

        btnUjAru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/add.png"))); // NOI18N
        btnUjAru.setBorder(null);
        btnUjAru.setBorderPainted(false);
        btnUjAru.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUjAru.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnUjAru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjAruActionPerformed(evt);
            }
        });

        btnCSVExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/csv.png"))); // NOI18N
        btnCSVExport.setBorder(null);
        btnCSVExport.setBorderPainted(false);
        btnCSVExport.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCSVExport.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnCSVExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVExportActionPerformed(evt);
            }
        });

        lbDatumKeres2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDatumKeres2.setText("CSV \nexport");

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUjAru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModosit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addComponent(btnModosit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(buttonPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbUj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTorol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTortenet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCSVExport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatumKeres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUjAru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModosit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTortenet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCSVExport, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatumKeres2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTorol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModosit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        choiceRendez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choiceRendez.add("");
        choiceRendez.add("Rendezés név szerint növekvő sorrendben");
        choiceRendez.add("Rendezés név szerint növekvő sorrendben");
        choiceRendez.add("Rendezés mennyiség szerint növekvő sorrendben");
        choiceRendez.add("Rendezés mennyiség szerint csökkenő sorrendben");
        choiceRendez.add("Rendezés minimum készlet szerint növekvő sorrendben");
        choiceRendez.add("Rendezés minimum készlet szerint csökkenő sorrendben");
        choiceRendez.add("Rendezés nettó ár szerint növekvő sorrendben");
        choiceRendez.add("Rendezés nettó ár szerint csökkenő sorrendben");
        choiceRendez.select(0);
        choiceRendez.setVisible(lbSzoveg.getText().equals(""));
        choiceRendez.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceRendezItemStateChanged(evt);
            }
        });

        tfKereses.setVisible(lbSzoveg.getText().equals(""));
        tfKereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeresesKeyReleased(evt);
            }
        });

        btnKeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-suche-25.png"))); // NOI18N
        btnKeres.setVisible(lbSzoveg.getText().equals(""));
        btnKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeresActionPerformed(evt);
            }
        });

        FilterPanel.setBackground(new java.awt.Color(218, 231, 245));
        FilterPanel.setVisible(lbSzoveg.getText().equals(""));

        choiceGyarto.add("");
        choiceGyarto.add("Asus");
        choiceGyarto.add("Gigabyte");
        choiceGyarto.add("Intel");
        choiceGyarto.add("MSI");
        choiceGyarto.select("");
        choiceGyarto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceGyartoItemStateChanged(evt);
            }
        });

        lbGyarto.setText("Gyártó szerint");

        choiceKat.add("");
        for(Kategoria kat : katLista){
            choiceKat.add(kat.getNev());
        }
        choiceKat.select("");
        choiceKat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceKatItemStateChanged(evt);
            }
        });

        lbKategoria.setText("Kategória szerint");

        btnFilterTorol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8-filter-löschen-40.png"))); // NOI18N
        btnFilterTorol.setPreferredSize(new java.awt.Dimension(48, 48));
        btnFilterTorol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterTorolActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout FilterPanelLayout = new javax.swing.GroupLayout(FilterPanel);
        FilterPanel.setLayout(FilterPanelLayout);
        FilterPanelLayout.setHorizontalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FilterPanelLayout.createSequentialGroup()
                        .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FilterPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lbKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FilterPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choiceKat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choiceGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FilterPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnFilterTorol, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FilterPanelLayout.setVerticalGroup(
            FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(FilterPanelLayout.createSequentialGroup()
                        .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choiceGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choiceKat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FilterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbGyarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btnFilterTorol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        lbSzoveg.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        btnRendel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_purchase_order_64px.png"))); // NOI18N
        btnRendel.setVisible(false);
        btnRendel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendelActionPerformed(evt);
            }
        });

        lbRendel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbRendel.setText("Hiányzó tételek rendelése");
        lbRendel.setVisible(false);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(405, 405, 405)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnKeres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lbRendel))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnRendel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSzoveg))))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choiceRendez, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lbSzoveg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addComponent(tfKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRendel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lbRendel))
                    .addComponent(btnKeres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(637, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2032, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnCSVExport.setToolTipText("Árulista exportálása CSV fájlba");
        btnTortenet.setToolTipText("Kiválasztott áru mozgásának lekérdezése");
        btnModosit.setToolTipText("Áru adatainak módosítása");
        btnUjAru.setToolTipText("Új áru felvétele");
        btnFilterTorol.setToolTipText("Szűrés törlése");
        btnRendel.setToolTipText("Hiányzó áruk utánrendelése");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfKeresesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeresesKeyReleased
        if (tfKereses.getText().equals("")) {

            this.tableModel = AruJTable.createTable(aruLista);
            setTableModel();
   
        }
    }//GEN-LAST:event_tfKeresesKeyReleased

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed

        AruPattern filter = new AruPattern(PatternFactory.create(tfKereses.getText()));

         List<Aru> talaltAru=filter.findByPattern(aruLista);
         this.tableModel = AruJTable.createTable(talaltAru);

        setTableModel();

    }//GEN-LAST:event_btnKeresActionPerformed

    private void choiceRendezItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceRendezItemStateChanged
        if (choiceRendez.getSelectedIndex() != 0) {
           
                List<Aru> list = aruLista;
                Aru[] aruTomb = list.toArray(new Aru[list.size()]);

                switch (choiceRendez.getSelectedIndex()) {
                    case (1):
                        Arrays.sort(aruTomb, new AruNevComparator());
                        break;
                    case (2):
                        Arrays.sort(aruTomb, new AruNevComparator().reversed());
                        break;
                    case (3):
                        Arrays.sort(aruTomb, new AruDbComparator());
                        break;
                    case (4):
                        Arrays.sort(aruTomb, new AruDbComparator().reversed());
                        break;
                    case (5):
                        Arrays.sort(aruTomb, new AruMinDbComparator());
                        break;
                    case (6):
                        Arrays.sort(aruTomb, new AruMinDbComparator().reversed());
                        break;
                    case (7):
                        Arrays.sort(aruTomb, new AruNettoComparator());
                        break;
                    case (8):
                        Arrays.sort(aruTomb, new AruNettoComparator().reversed());
                        break;
                }

                this.tableModel = AruJTable.createTable(Arrays.asList(aruTomb));
                setTableModel();


        }
    }//GEN-LAST:event_choiceRendezItemStateChanged

    private void btnCSVExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVExportActionPerformed
        if(aru!=null){
        MyFileChooser chooser = new MyFileChooser();
        chooser.setDialogTitle("Mentés");
        CSVFilter csvFilt = new CSVFilter();
        chooser.setFileFilter(csvFilt);
        chooser.setDialogType(JFileChooser.CUSTOM_DIALOG);

        int retValue = chooser.showDialog(this, "Mentés");

        if (retValue == MyFileChooser.APPROVE_OPTION) {
            AruFileCSV mf = new AruFileCSV(chooser.getSelectedFile());
            mf.export(aruLista);
        }
        }

    }//GEN-LAST:event_btnCSVExportActionPerformed

    private void btnUjAruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjAruActionPerformed
        try {

            ModositAruDialog dialog = new ModositAruDialog(null, true);
            dialog.setVisible(true);
            if (dialog.isOk()) {
                aru = dialog.getAru();
                AruJTable.add(aruJDBC.findById(aruJDBC.add(aru)), tableModel);
                aruLista.add(aru);
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnUjAruActionPerformed

    private void btnModositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModositActionPerformed
        int selectedRow = jTableAru.getSelectedRow();

        if (selectedRow > -1) {

            int selectedId = (int) tableModel.getValueAt(jTableAru.getSelectedRow(), 0);

            ModositAruDialog dialog;

            try {

                aru = aruJDBC.findById(selectedId);
                int id = aru.getId();

                dialog = new ModositAruDialog(null, true, aru);
                dialog.setVisible(true);

                if (dialog.isOk()) {
                    aru = dialog.getAru();
                    aruJDBC.update(aru);
                    aruLista = aruJDBC.findAll();
                    AruJTable.updateRecord(selectedRow, aru, tableModel);
                    updateKeszletCellColor();
                  
                }

            } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);


            }
        }
    }//GEN-LAST:event_btnModositActionPerformed

    private void btnTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorolActionPerformed
        int selectedRow = jTableAru.getSelectedRow();

        if (selectedRow > -1) {
            int selectedId = (Integer) tableModel.getValueAt(jTableAru.getSelectedRow(), 0);

            try {
                Aru aru = aruJDBC.findById(selectedId);
                aruJDBC.delete(selectedId);
                AruJTable.delete(selectedRow, tableModel);
                aruLista.remove(aru);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnTorolActionPerformed

    private void btnFilterTorolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterTorolActionPerformed
        choiceKat.select("");
        choiceGyarto.select("");
        this.tableModel = AruJTable.createTable(aruLista);
        setTableModel();
    }//GEN-LAST:event_btnFilterTorolActionPerformed

    private void choiceKatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceKatItemStateChanged
        Filter();
    }//GEN-LAST:event_choiceKatItemStateChanged

    private void choiceGyartoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceGyartoItemStateChanged
        Filter();
    }//GEN-LAST:event_choiceGyartoItemStateChanged

    private void btnRendelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendelActionPerformed
        UjMegrendelesDialog dialog = new UjMegrendelesDialog(null, true);
        dialog.setVisible(true);
        if (dialog.isOk()) {

            try {
                MegrendelesRepositoryJDBC megrendelesJDBC=new MegrendelesRepositoryJDBC();
                Megrendeles megrendeles = dialog.getMegrendeles();
                megrendelesJDBC.add(megrendeles);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);
            }

        }
        
    }//GEN-LAST:event_btnRendelActionPerformed

    private void jTableAruMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAruMouseReleased
       int selectedRow = jTableAru.getSelectedRow();

        if (selectedRow > -1) {
            int selectedId = (Integer) tableModel.getValueAt(jTableAru.getSelectedRow(), tableModel.findColumn("ID"));
            try {
                aru = aruJDBC.findById(selectedId);
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", JOptionPane.ERROR_MESSAGE);

            }
           
        }
        
    }//GEN-LAST:event_jTableAruMouseReleased

    private void Filter(){
        FilterGyarto gyarto=new FilterGyarto(choiceGyarto.getSelectedItem());
        FilterKategoria kat=new FilterKategoria(choiceKat.getSelectedItem()); 
        List<Aru> filteredList=aruLista.stream().filter(gyarto.and(kat)).collect(Collectors.toList());
        this.tableModel=AruJTable.createTable(filteredList);
        setTableModel();               
    }
    
      private void setTableModel() {
        jTableAru.setModel(tableModel);
        AruJTable.setInvisible(0, jTableAru);
        AruJTable.setInvisible(1, jTableAru);
        updateKeszletCellColor();
        
    }
      
    private void updateKeszletCellColor(){
         AruTableCellColorRenderer renderer=new AruTableCellColorRenderer(aruLista);
         jTableAru.setDefaultRenderer(Object.class, renderer);
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
            java.util.logging.Logger.getLogger(AruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AruDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AruDialog dialog = new AruDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel FilterPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnCSVExport;
    private javax.swing.JButton btnFilterTorol;
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnModosit;
    private javax.swing.JButton btnRendel;
    private javax.swing.JButton btnTorol;
    private javax.swing.JButton btnTortenet;
    private javax.swing.JButton btnUjAru;
    private javax.swing.JPanel buttonPanel;
    private java.awt.Choice choiceGyarto;
    private java.awt.Choice choiceKat;
    private java.awt.Choice choiceRendez;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAru;
    private java.awt.Label lbDatumKeres2;
    private java.awt.Label lbGyarto;
    private java.awt.Label lbKategoria;
    private java.awt.Label lbMegrendeles;
    private java.awt.Label lbModosit1;
    private javax.swing.JLabel lbRendel;
    private javax.swing.JLabel lbSzoveg;
    private java.awt.Label lbTorol;
    private java.awt.Label lbUj;
    private javax.swing.JTextField tfKereses;
    // End of variables declaration//GEN-END:variables
}
