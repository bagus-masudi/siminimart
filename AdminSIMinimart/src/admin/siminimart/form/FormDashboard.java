/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.siminimart.form;

import admin.siminimart.model.Model_Card;
import admin.siminimart.swing.connectionmysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormDashboard extends javax.swing.JPanel {

    public static String Tanggal;
    
    public FormDashboard() {
        initComponents();
        setOpaque(false);
        card2.setVisible(false);
        card1.setVisible(false);
        
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        String tgl1 = Integer.toString(hari) + " " + namabulan[bulan] + " " + Integer.toString(tahun);
        
        tampilkanTransaksi();
        lebarKolom();
        tampilkanTransaksi2();
        
        int total = tabelTransaksi1.getRowCount();
        String tt = "0";
        
        if (total > 0){
            tt = tabelTransaksi1.getValueAt(0, 0).toString();
        } else if (total == 0){
            tt = "0";
        }
        
        
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/admin/siminimart/image/profit.png")), "Total Pembelian" , "Rp" + tt  , "Update : " + tgl1));
    }

    public void tampilkanTransaksi() {
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        int bln = bulan + 1;
        String tgl = Integer.toString(tahun) + "-" + bln + "-" + Integer.toString(hari);
        Tanggal = tgl;
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("ID Transaksi");
        table.addColumn("Nama");
        table.addColumn("KdBarang");
        table.addColumn("Nama Barang");
        table.addColumn("Jumlah");
        table.addColumn("Total Harga");
        table.addColumn("Tanggal");
        table.addColumn("Status"); 

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from transaksi where tgl_transaksi = '"+ Tanggal +"'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4), R.getString(5), R.getString(6), R.getString(7), R.getString(8)
                });
            }
            tabelTransaksi.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void tampilkanTransaksi2() {
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        int bln = bulan + 1;
        String tgl = Integer.toString(tahun) + "-" + bln + "-" + Integer.toString(hari);
        Tanggal = tgl;
        String bln2 = "0";
        if (bln >= 10) {
        bln2 = "" + bln;
        } else if (bln < 10){
        bln2 = "0" + bln;
        }
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("ID Transaksi");
        

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select sum(total_harga) from transaksi where tgl_transaksi LIKE '%" + tahun + "-"+ bln2 +"%'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tabelTransaksi1.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void lebarKolom(){
        TableColumn column;
        tabelTransaksi.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tabelTransaksi.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = tabelTransaksi.getColumnModel().getColumn(1);
        column.setPreferredWidth(120);
        column = tabelTransaksi.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = tabelTransaksi.getColumnModel().getColumn(3);
        column.setPreferredWidth(200);
        column = tabelTransaksi.getColumnModel().getColumn(4);
        column.setPreferredWidth(80);
        column = tabelTransaksi.getColumnModel().getColumn(5);
        column.setPreferredWidth(100);
        column = tabelTransaksi.getColumnModel().getColumn(6);
        column.setPreferredWidth(100);
        column = tabelTransaksi.getColumnModel().getColumn(7);
        column.setPreferredWidth(130);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        card3 = new admin.siminimart.component.Card();
        card2 = new admin.siminimart.component.Card();
        card1 = new admin.siminimart.component.Card();
        panelBorder1 = new admin.siminimart.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTransaksi = new admin.siminimart.swing.Table();

        tabelTransaksi1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelTransaksi1);

        setBackground(new java.awt.Color(242, 242, 242));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card3.setColor1(new java.awt.Color(142, 142, 250));
        card3.setColor2(new java.awt.Color(123, 123, 245));
        jLayeredPane1.add(card3);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        jLayeredPane1.add(card2);

        card1.setColor1(new java.awt.Color(241, 208, 62));
        card1.setColor2(new java.awt.Color(211, 184, 61));
        jLayeredPane1.add(card1);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Pembelian Hari ini");

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelTransaksi);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private admin.siminimart.component.Card card1;
    private admin.siminimart.component.Card card2;
    private admin.siminimart.component.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private admin.siminimart.swing.PanelBorder panelBorder1;
    private admin.siminimart.swing.Table tabelTransaksi;
    private javax.swing.JTable tabelTransaksi1;
    // End of variables declaration//GEN-END:variables
}
