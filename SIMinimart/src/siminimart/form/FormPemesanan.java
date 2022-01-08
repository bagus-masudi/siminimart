/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siminimart.form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import siminimart.component.PanelLoginAndRegister;
import siminimart.main.KonfirmasiPemesanan;
import siminimart.swing.connectionmysql;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormPemesanan extends javax.swing.JPanel {

    /**
     * Creates new form FormPemesanan
     */
    
    public static String Kode;
    public static int Stok;
    public static String Nama;
    public static int Jumlah;
    public static String TotalHarga;
    public static String sld;
    public static String TB;
    public static String Tanggal;
    
    public FormPemesanan() {
        initComponents();
        tampilkankeranjang();
        lebarKolom();
        totalbiaya();
        TotalProduk();
        Saldo();

        int saldo = tblSaldo.getRowCount();
        if (saldo > 0){
            sld = tblSaldo.getValueAt(0, 0).toString();
        } else if (saldo == 0){
            sld = "0";
        }
        
        int row = tabelKeranjang.getRowCount();
        if (row > 0) {
            String TP = tblJmlPrdk.getValueAt(0, 0).toString();
            sld = tblSaldo.getValueAt(0, 0).toString();
            TB = tblTotalBiaya.getValueAt(0, 0).toString();
            TotalBiaya.setText(" Total biaya(" + TP + " Produk) :                Rp" + TB);
            Saldo.setText(" Saldo tersedia            :                Rp" + sld);
            int SS = Integer.parseInt(sld) - Integer.parseInt(TB);
            Sisasaldo.setText(" Sisa Saldo                  :                Rp" + Integer.toString(SS));
        } else if (row == 0){
            TB = "0";
            Saldo.setText(" Saldo tersedia            :                Rp" + sld);
            int SS = Integer.parseInt(sld) - Integer.parseInt(TB);
            Sisasaldo.setText(" Sisa Saldo                  :                Rp" + Integer.toString(SS));
        } else {
            
        }
        
        

    }
    
    public void tampilkankeranjang() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Kode");
        table.addColumn("Nama");
        table.addColumn("Stok");
        table.addColumn("Jumlah");
        table.addColumn("Total Harga");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from keranjang where User = '" + PanelLoginAndRegister.Name + "'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(2), R.getString(3), R.getString(4), R.getString(6), R.getString(7)
                });
            }
            tabelKeranjang.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
        
    }
    
    public void totalbiaya(){
         DefaultTableModel table = new DefaultTableModel();

        table.addColumn("TotalHarga");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select sum(total_harga) from keranjang";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tblTotalBiaya.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
            
    }
    
    public void TotalProduk(){
         DefaultTableModel table = new DefaultTableModel();

        table.addColumn("TotalProduk");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select count(nama_barang) from keranjang";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tblJmlPrdk.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
            
    }
    
    public void Saldo(){
         DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Saldo");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select Saldo from saldo where Nama = '" + PanelLoginAndRegister.Name + "'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tblSaldo.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
            
    }
    
    public void lebarKolom(){
        TableColumn column;
        tabelKeranjang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tabelKeranjang.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = tabelKeranjang.getColumnModel().getColumn(1);
        column.setPreferredWidth(270);
        column = tabelKeranjang.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = tabelKeranjang.getColumnModel().getColumn(3);
        column.setPreferredWidth(100);
        column = tabelKeranjang.getColumnModel().getColumn(4);
        column.setPreferredWidth(120);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblTotalBiaya = new javax.swing.JTable();
        tblJmlPrdk = new javax.swing.JTable();
        tblSaldo = new javax.swing.JTable();
        panelBorder1 = new siminimart.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKeranjang = new siminimart.swing.Table();
        panelBorder2 = new siminimart.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        TotalBiaya = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        Sisasaldo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblTotalBiaya.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTotalBiaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblTotalBiayaKeyReleased(evt);
            }
        });

        tblJmlPrdk.setModel(new javax.swing.table.DefaultTableModel(
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
        tblJmlPrdk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblJmlPrdkKeyReleased(evt);
            }
        });

        tblSaldo.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSaldoKeyReleased(evt);
            }
        });

        setBackground(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 127, 127));
        jLabel2.setText("Keranjang");

        tabelKeranjang.setForeground(new java.awt.Color(51, 51, 51));
        tabelKeranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKeranjang.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tabelKeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKeranjangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKeranjang);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Checkout");

        TotalBiaya.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        TotalBiaya.setForeground(new java.awt.Color(51, 51, 51));
        TotalBiaya.setText(" Total biaya(0 Produk) :                Rp0   ");

        Saldo.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        Saldo.setForeground(new java.awt.Color(51, 51, 51));
        Saldo.setText(" Saldo tersedia            :                Rp0");

        Sisasaldo.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        Sisasaldo.setForeground(new java.awt.Color(51, 51, 51));
        Sisasaldo.setText(" Sisa Saldo  :                                Rp0");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/credit-card.png"))); // NOI18N
        jButton1.setText("Buat Pesanan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sisasaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TotalBiaya, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TotalBiaya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sisasaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelKeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKeranjangMouseClicked
        int baris = tabelKeranjang.rowAtPoint(evt.getPoint());
        
        String kode = tabelKeranjang.getValueAt(baris, 0).toString();
        Kode = kode;
        
        String stok = tabelKeranjang.getValueAt(baris, 2).toString();
        Stok = Integer.parseInt(stok);
        
        String jumlah = tabelKeranjang.getValueAt(baris, 3).toString();
        Jumlah = Integer.parseInt(jumlah);
    }//GEN-LAST:event_tabelKeranjangMouseClicked

    private void tblTotalBiayaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTotalBiayaKeyReleased
        
    }//GEN-LAST:event_tblTotalBiayaKeyReleased

    private void tblJmlPrdkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblJmlPrdkKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblJmlPrdkKeyReleased

    private void tblSaldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSaldoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSaldoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        String tgl = Integer.toString(tahun) + "-" + (bulan + 1) + "-" + Integer.toString(hari);
        Tanggal = tgl;
       
        if (Integer.parseInt(FormPemesanan.sld) > Integer.parseInt(FormPemesanan.TB)) {
            int i = 0;
            int baris = tabelKeranjang.getRowCount() - 1;
            while (i <= baris) {
                Kode = tabelKeranjang.getValueAt(i, 0).toString();
                Nama = tabelKeranjang.getValueAt(i, 1).toString();
                Jumlah = Integer.parseInt(tabelKeranjang.getValueAt(i, 3).toString());
                TotalHarga = tabelKeranjang.getValueAt(i, 4).toString();
                try {
                    Connection con = connectionmysql.koneksiDB();
                    String sql = "INSERT INTO transaksi(nama, kode_barang, nama_barang, jumlah, total_harga, tgl_transaksi, status) VALUES('"+ PanelLoginAndRegister.Name +"','"+ Kode +"','"+ Nama +"','"+ Jumlah +"','"+ TotalHarga +"','"+ Tanggal +"','Belum Diambil')";
                    Statement S = con.createStatement();
                    S.execute(sql);
                    String sqll = "delete from keranjang";
                    Statement S1 = con.createStatement();
                    S1.execute(sqll);
                    JOptionPane.showMessageDialog(null, "Transaksi Berhasil");
                    new KonfirmasiPemesanan().setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
                i = i + 1;
            }
            try {
                    Connection con = connectionmysql.koneksiDB();
                    String sql = "Update saldo set Saldo = " + (Integer.parseInt(sld) - Integer.parseInt(TB)) + " where Nama = '"+ PanelLoginAndRegister.Name +"'";
                    Statement S = con.createStatement();
                    S.execute(sql);
                } catch (Exception e) {
                    System.out.println(e);
                }
            TotalBiaya.setText(" Total biaya(0 Produk) :                Rp0");
            Saldo.setText(" Saldo tersedia            :                Rp0");
            Sisasaldo.setText(" Sisa Saldo                  :                Rp0");
        } else {
            JOptionPane.showMessageDialog(this, "Saldo Masih Kurang, Silahkan Top Up Saldo Terlebih Dahulu");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Sisasaldo;
    private javax.swing.JLabel TotalBiaya;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private siminimart.swing.PanelBorder panelBorder1;
    private siminimart.swing.PanelBorder panelBorder2;
    private siminimart.swing.Table tabelKeranjang;
    private javax.swing.JTable tblJmlPrdk;
    private javax.swing.JTable tblSaldo;
    private javax.swing.JTable tblTotalBiaya;
    // End of variables declaration//GEN-END:variables
}
