/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package siminimart.form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import siminimart.component.PanelLoginAndRegister;
import siminimart.model.Model_Card;
import siminimart.model.Model_Produk;
import siminimart.swing.connectionmysql;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormDashboard extends javax.swing.JPanel {

    /**
     * Creates new form FormDashboard
     */
    public FormDashboard() {

        initComponents();
        tampilkanSaldo();
        tampilkanKeranjang();
        tampilkanPesanan();
        
        String sld = "";
        
        int saldo = tblSaldo.getRowCount();
      
        if (saldo > 0){
            sld = tblSaldo.getValueAt(0, 0).toString();
        } else if (saldo == 0){
            sld = "0";
        }
        int totalkeranjang = tabelKeranjang.getRowCount();
        int tk = 0;
        if (totalkeranjang > 0){
            tk = totalkeranjang;
        } else if (totalkeranjang == 0){
            tk = 0;
        }
        int totalpesanan = tabelPesanan.getRowCount();
        int tp = 0;
        if (totalpesanan > 0){
            tp = totalpesanan;
        } else if (totalpesanan == 0){
            tp = 0;
        }
        
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        String tgl = Integer.toString(hari) + " " + namabulan[bulan] + " " + Integer.toString(tahun);

        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/siminimart/image/8.png")), "Saldo " + PanelLoginAndRegister.Name , "Rp" + sld , "Update : " + tgl));
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/siminimart/image/profit.png")), "Total Pesanan", "" + tp, "Update : " + tgl));
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/siminimart/image/stock.png")), "Total Keranjang", "" + tk, "Update : " + tgl));

        produk1.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Chocolate Meises 90G.png")), "Chocolate Meises", "Rp 4.500"));
        produk2.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Ufo Mi Goreng 88G.png")), "Ufo Mie Goreng", "Rp 8.000"));
        produk3.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Coconut Water 250Ml.png")), "Coconut Water 350Ml", "Rp 5.900"));
        produk4.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Gula Halus 250G.png")), "Gula Halus", "Rp 7.000"));
        produk5.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Gula Batu 225G.png")), "Gula Batu", "Rp 8.500"));
        produk6.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Garam 500G.png")), "Garam", "Rp 5.100"));
        produk7.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Energen Cokelat 10X34g.png")), "Energen Sereal & Susu Coklat", "Rp 19.100"));
        produk8.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Nestle Cereal Koko Krunch 330g.png")), "Nestle Creal Koko Krunch", "Rp 47.500"));
        produk9.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Teh Daun Jawa Oolong Jasmine 50G.png")), "Teh Daun Jawa Oolong Jasmine", "Rp 13.500"));
        produk10.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Delmonte Fruit COcktail 825g.png")), "Delmonte Fruit Cocktail", "Rp 62.600"));
        produk11.setData(new Model_Produk(new ImageIcon(getClass().getResource("/siminimart/produk/Spread Chocolate 160G.png")), "Spread Chocolate", "Rp 16.800"));

    }

    public void tampilkanKeranjang() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Nama");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select nama_barang from keranjang where User = '" + PanelLoginAndRegister.Name + "'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tabelKeranjang.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
        
    }
    
    public void tampilkanPesanan() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Nama");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select nama_barang from transaksi where nama = '" + PanelLoginAndRegister.Name + "'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tabelPesanan.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
        
    }
    
    public void tampilkanSaldo() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblSaldo = new javax.swing.JTable();
        tabelKeranjang = new javax.swing.JTable();
        tabelPesanan = new javax.swing.JTable();
        panel = new javax.swing.JLayeredPane();
        card1 = new siminimart.component.Card();
        card2 = new siminimart.component.Card();
        card3 = new siminimart.component.Card();
        panelBorder1 = new siminimart.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spPromosi = new javax.swing.JScrollPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        produk1 = new siminimart.component.Produk();
        produk2 = new siminimart.component.Produk();
        produk3 = new siminimart.component.Produk();
        produk4 = new siminimart.component.Produk();
        produk5 = new siminimart.component.Produk();
        produk6 = new siminimart.component.Produk();
        produk7 = new siminimart.component.Produk();
        produk8 = new siminimart.component.Produk();
        produk9 = new siminimart.component.Produk();
        produk10 = new siminimart.component.Produk();
        produk11 = new siminimart.component.Produk();

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

        tabelPesanan.setModel(new javax.swing.table.DefaultTableModel(
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

        setBackground(new java.awt.Color(242, 242, 242));

        panel.setPreferredSize(new java.awt.Dimension(945, 191));
        panel.setRequestFocusEnabled(false);
        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card1MouseClicked(evt);
            }
        });
        panel.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Produk Baru ");

        spPromosi.setBackground(new java.awt.Color(255, 255, 255));
        spPromosi.setBorder(null);
        spPromosi.setForeground(new java.awt.Color(255, 255, 255));
        spPromosi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spPromosi.setOpaque(false);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));
        jLayeredPane2.add(produk1);
        jLayeredPane2.add(produk2);
        jLayeredPane2.add(produk3);
        jLayeredPane2.add(produk4);
        jLayeredPane2.add(produk5);
        jLayeredPane2.add(produk6);
        jLayeredPane2.add(produk7);
        jLayeredPane2.add(produk8);
        jLayeredPane2.add(produk9);
        jLayeredPane2.add(produk10);
        jLayeredPane2.add(produk11);

        spPromosi.setViewportView(jLayeredPane2);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(spPromosi, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(spPromosi, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void card1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseClicked

    }//GEN-LAST:event_card1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private siminimart.component.Card card1;
    private siminimart.component.Card card2;
    private siminimart.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane panel;
    private siminimart.swing.PanelBorder panelBorder1;
    private siminimart.component.Produk produk1;
    private siminimart.component.Produk produk10;
    private siminimart.component.Produk produk11;
    private siminimart.component.Produk produk2;
    private siminimart.component.Produk produk3;
    private siminimart.component.Produk produk4;
    private siminimart.component.Produk produk5;
    private siminimart.component.Produk produk6;
    private siminimart.component.Produk produk7;
    private siminimart.component.Produk produk8;
    private siminimart.component.Produk produk9;
    private javax.swing.JScrollPane spPromosi;
    private javax.swing.JTable tabelKeranjang;
    private javax.swing.JTable tabelPesanan;
    private javax.swing.JTable tblSaldo;
    // End of variables declaration//GEN-END:variables
}
