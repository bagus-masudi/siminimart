/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package siminimart.form;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import siminimart.swing.connectionmysql;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormMinuman extends javax.swing.JPanel {

    /**
     * Creates new form FormKategori
     */
    
    public static String Kode = "";
    public static String Nama = "";
    public static String Harga = "";
    public static int Jumlah = 0;
    public static String Totalharga = "";
    public static int Stok = 0;
    public static String Tanggal;
    
    public FormMinuman() {
        initComponents();
        tampilkanpemesanan();
        lebarKolom();
        Tanggal();
        Nama = "";
        txtNama.setEditable(false);
        txtHarga.setEditable(false);
        txtTotalHarga.setEditable(false);
    }

    public void tampilkanpemesanan() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Kode");
        table.addColumn("Nama");
        table.addColumn("Harga");
        table.addColumn("Stok");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from databarang where `kategori` = 'Minuman'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4)
                });
            }
            tabelMakanan.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void lebarKolom(){
        TableColumn column;
        tabelMakanan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tabelMakanan.getColumnModel().getColumn(0);
        column.setPreferredWidth(120);
        column = tabelMakanan.getColumnModel().getColumn(1);
        column.setPreferredWidth(270);
        column = tabelMakanan.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);
        column = tabelMakanan.getColumnModel().getColumn(3);
        column.setPreferredWidth(120);
    }
    
    public void Tanggal(){
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        String tgl = Integer.toString(tahun) + "-" + Integer.toString(bulan) + "-" + Integer.toString(hari);
        Tanggal = tgl;
    }
    
    public void Hapusdata(){
        txtNama.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
        txtTotalHarga.setText("");
        lbImage.setIcon(new ImageIcon(getClass().getResource("/siminimart/image/Kosong.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new siminimart.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelMakanan = new siminimart.swing.Table();
        panelBorder2 = new siminimart.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        searchText1 = new siminimart.swing.SearchText();
        lbImage = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        lbNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        lbHarga1 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        lbNama1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Minuman");

        tabelMakanan.setForeground(new java.awt.Color(51, 51, 51));
        tabelMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMakanan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabelMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMakananMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelMakanan);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/search.png"))); // NOI18N

        searchText1.setBorder(null);
        searchText1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });
        searchText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(searchText1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbHarga.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbHarga.setText("Harga");

        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtHarga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lbNama.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbNama.setText("Nama Barang");

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtTotalHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalHarga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lbHarga1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbHarga1.setText("Total Harga");

        txtJumlah.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlah.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJumlahKeyReleased(evt);
            }
        });

        lbNama1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbNama1.setText("Jumlah");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHarga)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNama1)
                    .addComponent(lbHarga1)
                    .addComponent(txtTotalHarga)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(204, 204, 204))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(lbNama1)
                                    .addGap(64, 64, 64)
                                    .addComponent(lbHarga1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(83, 83, 83)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbNama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbHarga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        
    }//GEN-LAST:event_searchText1ActionPerformed

    private void tabelMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMakananMouseClicked
        int baris = tabelMakanan.rowAtPoint(evt.getPoint());
        
        String kode = tabelMakanan.getValueAt(baris, 0).toString();
        Kode = kode;
         
        String nama = tabelMakanan.getValueAt(baris, 1).toString();
        txtNama.setText(nama);
        Nama = nama;
        
        String harga = tabelMakanan.getValueAt(baris, 2).toString();
        txtHarga.setText(harga);
        Harga = harga;
        
        String stok = tabelMakanan.getValueAt(baris, 3).toString();
        Stok = Integer.parseInt(stok);
        
        String image = tabelMakanan.getValueAt(baris, 1).toString();
        lbImage.setIcon(new ImageIcon(getClass().getResource("/siminimart/produk/" + image + ".png")));
        
        txtJumlah.setText("1");
        txtTotalHarga.setText(Harga);
        Jumlah = Integer.parseInt(txtJumlah.getText());
        Totalharga = txtTotalHarga.getText();
    }//GEN-LAST:event_tabelMakananMouseClicked

    private void txtJumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyReleased
        int total = Integer.parseInt(txtJumlah.getText()) * Integer.parseInt(txtHarga.getText());
        txtTotalHarga.setText(Integer.toString(total));
        Jumlah = Integer.parseInt(txtJumlah.getText());
        Totalharga = txtTotalHarga.getText();
    }//GEN-LAST:event_txtJumlahKeyReleased

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
       String cari = searchText1.getText();
        
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Kode");
        table.addColumn("Nama");
        table.addColumn("Harga");
        table.addColumn("Stok");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from databarang where `kategori` = 'Minuman' AND `nama_barang` LIKE '%" + cari+ "%'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4)
                });
            }
            tabelMakanan.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
        lebarKolom();
    }//GEN-LAST:event_searchText1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbHarga1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNama1;
    private siminimart.swing.PanelBorder panelBorder1;
    private siminimart.swing.PanelBorder panelBorder2;
    private siminimart.swing.SearchText searchText1;
    private siminimart.swing.Table tabelMakanan;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
