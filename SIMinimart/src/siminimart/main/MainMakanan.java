/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siminimart.main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import siminimart.component.PanelLoginAndRegister;
import siminimart.form.FormMakanan;
import siminimart.swing.connectionmysql;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class MainMakanan extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainMakanan() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new siminimart.swing.PanelBorder();
        TopUp = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Pemesanan = new javax.swing.JLabel();
        Kategori = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        menu1 = new siminimart.component.Menu();
        header1 = new siminimart.component.Header();
        mainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        formMakanan1 = new siminimart.form.FormMakanan();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setLayout(null);

        TopUp.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        TopUp.setForeground(new java.awt.Color(255, 255, 255));
        TopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/4.png"))); // NOI18N
        TopUp.setText("    Top Up");
        TopUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TopUpMouseClicked(evt);
            }
        });
        panelBorder1.add(TopUp);
        TopUp.setBounds(30, 210, 140, 35);

        LogOut.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/3.png"))); // NOI18N
        LogOut.setText("    Transaksi");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        panelBorder1.add(LogOut);
        LogOut.setBounds(30, 250, 140, 35);

        Pemesanan.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Pemesanan.setForeground(new java.awt.Color(255, 255, 255));
        Pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/2.png"))); // NOI18N
        Pemesanan.setText("    Pemesanan");
        Pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananMouseClicked(evt);
            }
        });
        panelBorder1.add(Pemesanan);
        Pemesanan.setBounds(30, 170, 140, 35);

        Kategori.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Kategori.setForeground(new java.awt.Color(255, 255, 255));
        Kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/5.png"))); // NOI18N
        Kategori.setText("    Kategori");
        Kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KategoriMouseClicked(evt);
            }
        });
        panelBorder1.add(Kategori);
        Kategori.setBounds(30, 130, 140, 35);

        Dashboard.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/1.png"))); // NOI18N
        Dashboard.setText("    Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        panelBorder1.add(Dashboard);
        Dashboard.setBounds(30, 90, 140, 35);
        panelBorder1.add(menu1);
        menu1.setBounds(0, 0, 215, 725);
        panelBorder1.add(header1);
        header1.setBounds(215, 0, 985, 47);

        mainPanel.setBackground(new java.awt.Color(242, 242, 242));
        mainPanel.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/check.png"))); // NOI18N
        jButton1.setText(" Beli");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(790, 550, 110, 50);
        mainPanel.add(formMakanan1);
        formMakanan1.setBounds(0, 0, 985, 679);

        panelBorder1.add(mainPanel);
        mainPanel.setBounds(215, 45, 985, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new MainDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void KategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KategoriMouseClicked
        new MainKategori().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KategoriMouseClicked

    private void PemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananMouseClicked
        new MainPemesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PemesananMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int stokk = FormMakanan.Stok - FormMakanan.Jumlah;
        try {
            if (FormMakanan.Nama.equals("")) {
                JOptionPane.showMessageDialog(this, "Produk belum dipilih");
            } else if (FormMakanan.Stok <= 0) {
                JOptionPane.showMessageDialog(this, "Stok produk habis");
            } else {
                
                Connection con = connectionmysql.koneksiDB();
                String sql1 = "UPDATE databarang set stok = '" + stokk + "' WHERE kode_barang = '" + FormMakanan.Kode + "'";
                Statement S1 = con.createStatement();
                S1.execute(sql1);
                String sql = "INSERT INTO keranjang VALUES ('" + PanelLoginAndRegister.Name + "','" + FormMakanan.Kode + "','" + FormMakanan.Nama + "','" + stokk + "','" + FormMakanan.Harga + "','" + FormMakanan.Jumlah + "','" + FormMakanan.Totalharga + "')";
                Statement S = con.createStatement();
                S.execute(sql);
                JOptionPane.showMessageDialog(null, "Memasukkan ke keranjang berhasil");
                new MainMakanan().setVisible(false);
                new MainMakanan().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Memasukkan ke keranjang gagal");
        }
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TopUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopUpMouseClicked
        new MainTopUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TopUpMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
       new MainTransaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Kategori;
    private javax.swing.JLabel LogOut;
    private javax.swing.JLabel Pemesanan;
    private javax.swing.JLabel TopUp;
    private siminimart.form.FormMakanan formMakanan1;
    private siminimart.component.Header header1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel mainPanel;
    private siminimart.component.Menu menu1;
    private siminimart.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
