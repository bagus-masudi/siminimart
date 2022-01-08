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
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import siminimart.component.PanelLoginAndRegister;
import siminimart.main.KonfirmasiTopUp;
import siminimart.main.MainTopUp;
import siminimart.swing.connectionmysql;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormTopUp extends javax.swing.JPanel {

    /**
     * Creates new form FormKategori
     */
    
    public static String Total;
   
    public FormTopUp() {
        initComponents();
        tampilkanTopUp();
       
    }

    public void tampilkanTopUp() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("ID");
        table.addColumn("Nama");
        table.addColumn("TopUp");
        table.addColumn("Total Harga");
        table.addColumn("Tanggal");
        table.addColumn("Status");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from TopUp where UserName = '" + PanelLoginAndRegister.Name + "'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4), R.getString(5), R.getString(6)
                });
            }
            tabelTopUp.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new siminimart.swing.PanelBorder();
        lbNama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelTopUp = new siminimart.swing.Table();
        panelBorder2 = new siminimart.swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        searchText1 = new siminimart.swing.SearchText();
        cbmTopUp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        lbNama.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbNama.setText("Jumlah Top Up ");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Top Up Saldo");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        tabelTopUp.setForeground(new java.awt.Color(51, 51, 51));
        tabelTopUp.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelTopUp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabelTopUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTopUpMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelTopUp);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/search.png"))); // NOI18N

        searchText1.setBorder(null);
        searchText1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        searchText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchText1MouseReleased(evt);
            }
        });
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

        cbmTopUp.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        cbmTopUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "50000", "100000", "150000", "200000", "250000", "300000" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siminimart/image/credit-card.png"))); // NOI18N
        jButton1.setText("Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(401, 401, 401)
                                .addComponent(jButton1))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(lbNama)
                                .addGap(18, 18, 18)
                                .addComponent(cbmTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNama)
                    .addComponent(cbmTopUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
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
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        
    }//GEN-LAST:event_searchText1ActionPerformed

    private void tabelTopUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTopUpMouseClicked
        
    }//GEN-LAST:event_tabelTopUpMouseClicked

    private void searchText1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchText1MouseReleased
      
    }//GEN-LAST:event_searchText1MouseReleased

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
       String cari = searchText1.getText();
        
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("ID");
        table.addColumn("Nama");
        table.addColumn("TopUp");
        table.addColumn("Total Harga");
         table.addColumn("Tanggal");
        table.addColumn("Status");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from TopUp where UserName = '" + PanelLoginAndRegister.Name + "' AND TopUp LIKE '%" + cari+ "%'";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4), R.getString(5), R.getString(6)
                });
            }
            tabelTopUp.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
        
    }//GEN-LAST:event_searchText1KeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
   
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        String tgl = Integer.toString(tahun) + "-" + (bulan + 1) + "-" + Integer.toString(hari);
        
        Random r = new Random();
        String bil = "" + r.nextInt(9) + r.nextInt(9) + r.nextInt(9);
        Object total = cbmTopUp.getSelectedItem();
        int t = Integer.parseInt((String) total) + Integer.parseInt(bil);
        
        Total = Integer.toString(t);
        
        System.out.println(PanelLoginAndRegister.Name);
        System.out.println(cbmTopUp.getSelectedItem());
        System.out.println(t);
        System.out.println(tgl);
      
        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "insert into topup values(null,'" + PanelLoginAndRegister.Name + "','" + cbmTopUp.getSelectedItem() + "','" + t + "','" + tgl + "','Belum Dikonfirmasi')";
            Statement S = con.createStatement();
            S.execute(sql);
            new MainTopUp().setVisible(true);
            new KonfirmasiTopUp().setVisible(true);
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmTopUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbNama;
    private siminimart.swing.PanelBorder panelBorder1;
    private siminimart.swing.PanelBorder panelBorder2;
    private siminimart.swing.SearchText searchText1;
    private siminimart.swing.Table tabelTopUp;
    // End of variables declaration//GEN-END:variables
}
