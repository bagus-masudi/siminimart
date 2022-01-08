/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.siminimart.main;

import java.awt.Color;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class MainPemesanan extends javax.swing.JFrame {

    /**
     * Creates new form MainDashboard
     */
    public MainPemesanan() {
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

        panelBorder1 = new admin.siminimart.swing.PanelBorder();
        Laporan = new javax.swing.JLabel();
        Produk = new javax.swing.JLabel();
        TopUp = new javax.swing.JLabel();
        Pemesanan = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        menu1 = new admin.siminimart.component.Menu();
        header1 = new admin.siminimart.component.Header();
        mainPanel = new javax.swing.JPanel();
        formPemesanan2 = new admin.siminimart.form.FormPemesanan();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 725));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 725));

        panelBorder1.setMaximumSize(new java.awt.Dimension(1200, 725));
        panelBorder1.setMinimumSize(new java.awt.Dimension(1200, 725));
        panelBorder1.setPreferredSize(new java.awt.Dimension(1200, 725));
        panelBorder1.setLayout(null);

        Laporan.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Laporan.setForeground(new java.awt.Color(255, 255, 255));
        Laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/3.png"))); // NOI18N
        Laporan.setText("    Laporan");
        Laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaporanMouseClicked(evt);
            }
        });
        panelBorder1.add(Laporan);
        Laporan.setBounds(30, 250, 140, 30);

        Produk.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Produk.setForeground(new java.awt.Color(255, 255, 255));
        Produk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/7.png"))); // NOI18N
        Produk.setText("    Produk");
        Produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdukMouseClicked(evt);
            }
        });
        panelBorder1.add(Produk);
        Produk.setBounds(30, 210, 140, 30);

        TopUp.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        TopUp.setForeground(new java.awt.Color(255, 255, 255));
        TopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/4.png"))); // NOI18N
        TopUp.setText("    Top Up");
        TopUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TopUpMouseClicked(evt);
            }
        });
        panelBorder1.add(TopUp);
        TopUp.setBounds(30, 170, 140, 30);

        Pemesanan.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Pemesanan.setForeground(new java.awt.Color(255, 255, 255));
        Pemesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/2.png"))); // NOI18N
        Pemesanan.setText("    Pemesanan");
        Pemesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PemesananMouseClicked(evt);
            }
        });
        panelBorder1.add(Pemesanan);
        Pemesanan.setBounds(30, 130, 140, 30);

        Dashboard.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/1.png"))); // NOI18N
        Dashboard.setText("    Dashboard");
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        panelBorder1.add(Dashboard);
        Dashboard.setBounds(30, 90, 140, 30);
        panelBorder1.add(menu1);
        menu1.setBounds(0, 0, 220, 725);
        panelBorder1.add(header1);
        header1.setBounds(220, 0, 980, 47);

        mainPanel.setBackground(new java.awt.Color(242, 242, 242));
        mainPanel.setLayout(new java.awt.CardLayout());
        mainPanel.add(formPemesanan2, "card2");

        panelBorder1.add(mainPanel);
        mainPanel.setBounds(220, 47, 980, 678);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        new MainDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void TopUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopUpMouseClicked
        new MainTopUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TopUpMouseClicked

    private void ProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdukMouseClicked
        new MainProduk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProdukMouseClicked

    private void PemesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PemesananMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PemesananMouseClicked

    private void LaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaporanMouseClicked
        new MainLaporan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LaporanMouseClicked

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
            java.util.logging.Logger.getLogger(MainPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Laporan;
    private javax.swing.JLabel Pemesanan;
    private javax.swing.JLabel Produk;
    private javax.swing.JLabel TopUp;
    private admin.siminimart.form.FormPemesanan formPemesanan2;
    private admin.siminimart.component.Header header1;
    private javax.swing.JPanel mainPanel;
    private admin.siminimart.component.Menu menu1;
    private admin.siminimart.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
