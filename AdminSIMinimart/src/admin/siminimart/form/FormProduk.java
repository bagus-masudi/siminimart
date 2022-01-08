/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.siminimart.form;


import admin.siminimart.main.MainProduk;
import admin.siminimart.main.MainRestock;
import admin.siminimart.swing.Book;
import admin.siminimart.swing.connectionmysql;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Ahmad Bagus Mas'udi
 */
public class FormProduk extends javax.swing.JPanel {

    public static String Kode;
    public static String Nama;
    public static int Jumlah;
    public static String Status;
    String filename;
    JFileChooser jfc;
    File file;
    File file1;
    File file2;
    
    public FormProduk() {
        initComponents();
        tampilkanProduk();
        tampilkankode();
        lebarKolom();
        txtNama.setEditable(false);
        txtID.setEditable(false);
        cbm();
        
    }
    
    public void cbm(){
        String kode = "0";
        txtID.setText(kode);
        int row = tabelkode.getRowCount();
        if (row > 0){
            kode = tabelkode.getValueAt((row - 1), 0).toString();
            int pnj = Integer.parseInt(kode) + 1;
            txtID.setText(Integer.toString(pnj));
        } else if (row == 0){
            kode = "0";
            txtID.setText(kode);
        }
    }
    public void tampilkankode() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Kode Barang");
        

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select kode_barang from databarang";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1)
                });
            }
            tabelkode.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void tampilkanProduk() {
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("Kode Barang");
        table.addColumn("Nama Barang");
        table.addColumn("Harga");
        table.addColumn("Stok");
        table.addColumn("Kategori");
        table.addColumn("Tanggal");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select * from databarang";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2), R.getString(3), R.getString(4), R.getString(5), R.getString(6)
                });
            }
            tabelProduk.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public void lebarKolom(){
        TableColumn column;
        tabelProduk.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tabelProduk.getColumnModel().getColumn(0);
        column.setPreferredWidth(130);
        column = tabelProduk.getColumnModel().getColumn(1);
        column.setPreferredWidth(290);
        column = tabelProduk.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);
        column = tabelProduk.getColumnModel().getColumn(3);
        column.setPreferredWidth(113);
        column = tabelProduk.getColumnModel().getColumn(4);
        column.setPreferredWidth(120);
        column = tabelProduk.getColumnModel().getColumn(5);
        column.setPreferredWidth(110);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelkode = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelBorder1 = new admin.siminimart.swing.PanelBorder();
        txtStok = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProduk = new admin.siminimart.swing.Table();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbmKategori = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        tabelkode.setModel(new javax.swing.table.DefaultTableModel(
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

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        txtStok.setBackground(new java.awt.Color(255, 255, 255));
        txtStok.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });

        lbImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProduk);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setText("Kategori");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setText("Stok");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Produk");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setText("Kode Barang");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setText("Nama");

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("Harga");

        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtHarga.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/folder.png"))); // NOI18N
        jButton3.setText(" Upload");
        jButton3.setHideActionText(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/trash-can (1).png"))); // NOI18N
        jButton2.setText(" Hapus");
        jButton2.setHideActionText(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/plus.png"))); // NOI18N
        jButton1.setText(" Simpan");
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbmKategori.setBackground(new java.awt.Color(255, 255, 255));
        cbmKategori.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cbmKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/edit.png"))); // NOI18N
        jButton4.setText(" Edit");
        jButton4.setHideActionText(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/plus.png"))); // NOI18N
        jButton5.setText(" Restock");
        jButton5.setHideActionText(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/siminimart/image/reload.png"))); // NOI18N
        jButton6.setText(" Reset");
        jButton6.setHideActionText(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18))
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(50, 50, 50)))
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton3))
                                .addGap(42, 42, 42)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(27, 27, 27)
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(cbmKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addGap(27, 27, 27)
                                .addComponent(jButton4)
                                .addGap(27, 27, 27)
                                .addComponent(jButton6)))
                        .addGap(39, 39, 39)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cbmKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton3)))
                        .addGap(35, 35, 35)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProdukMouseClicked
        int baris = tabelProduk.rowAtPoint(evt.getPoint());
        
        String kode = tabelProduk.getValueAt(baris, 0).toString();
        txtID.setText(kode);
        
        String nama = tabelProduk.getValueAt(baris, 1).toString();
        txtNama.setText(nama);
        lbImage.setIcon(new ImageIcon(getClass().getResource("/admin/siminimart/produk/" + nama + ".png")));
        Nama = nama;
        
        
        String harga = tabelProduk.getValueAt(baris, 2).toString();
        txtHarga.setText(harga);
       
        
        String stok = tabelProduk.getValueAt(baris, 3).toString();
        txtStok.setText(stok);
        
        String kategori = tabelProduk.getValueAt(baris, 4).toString();
        cbmKategori.setSelectedItem(kategori);
   
        
        
    }//GEN-LAST:event_tabelProdukMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        int bln = bulan +1;
        String tgl = Integer.toString(tahun) + "-" + bln + "-" + Integer.toString(hari);
        
        Book book=new Book();
        book.setTitle(txtNama.getText());
       
        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "insert into databarang values('"+ txtID.getText() +"','"+ txtNama.getText() +"','"+ txtHarga.getText() +"','"+ txtStok.getText() +"','"+ cbmKategori.getSelectedItem() +"','"+ tgl +"')";
            Statement S = con.createStatement();
            S.execute(sql);
            JOptionPane.showMessageDialog(null, "Simpan berhasil");
            new MainProduk().setVisible(false);
            new MainProduk().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Simpan gagal");
        }
        try {
            String path=new File(".").getCanonicalPath();
            String path1 = "D:\\Java\\NetBeansProjects\\NetBeansProjects\\SIMinimart";
            FileUtils.copyFileToDirectory(file, new File(path+"/src/admin/siminimart/produk"));
            FileUtils.copyFileToDirectory(file, new File(path1+"/src/siminimart/produk"));
  //          FileUtils.deleteDirectory(file);
        } catch (IOException ex) {
            Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "delete from databarang where kode_barang = '" + txtID.getText() + "'";
            Statement S = con.createStatement();
            S.execute(sql);
            JOptionPane.showMessageDialog(null, "Hapus berhasil");
            new MainProduk().setVisible(false);
            new MainProduk().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Hapus gagal");
        }
        try {
            file1 = new File("C:\\Users\\Ahmad Bagus Mas'udi\\OneDrive\\Dokumen\\NetBeansProjects\\AdminSIMinimart\\src\\admin\\siminimart\\produk\\"+ txtNama.getText() +".png");
            file2 = new File("D:\\Java\\NetBeansProjects\\NetBeansProjects\\SIMinimart\\src\\siminimart\\produk\\"+ txtNama.getText() +".png");
           
            FileUtils.forceDelete(file1);
            FileUtils.forceDelete(file2);
        } catch (IOException ex) {
            Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jfc = new JFileChooser();
        if (jfc.showOpenDialog(lbImage) == JFileChooser.APPROVE_OPTION) {

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image image = toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized = image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(imagedResized);

            lbImage.setIcon(imageIcon);
            String nm = jfc.getSelectedFile().getName();
            txtNama.setText(nm.substring(0, nm.length() - 4));

            file = new File(jfc.getSelectedFile().getPath());
            
        }

//        try {
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(null);
//            File f = chooser.getSelectedFile();
//            ImageIcon icon = new ImageIcon(f.toString());
//            Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
//            ImageIcon ic = new ImageIcon(image);
//            lbImage.setIcon(ic);
//
//            filename = f.getAbsolutePath();
//            txtNama.setText(filename);
//
//            String newpath = "src/admin/siminimart/produk/";
//            File directory = new File(newpath);
//            if (directory.exists()) {
//                directory.mkdirs();
//            }
//            File sourceFile = null;
//            File destinationFile = null;
//            String extension = filename.substring(filename.lastIndexOf('-') + 1);
//
//            sourceFile = new File(filename);
//            destinationFile = new File(newpath+ filename);
//
//            Files.copy(sourceFile.toPath(), destinationFile.toPath());
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int hari, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        hari = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);
        int bln = bulan +1;
        String tgl = Integer.toString(tahun) + "-" + bln + "-" + Integer.toString(hari);
        
        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "update databarang set kode_barang = '"+ txtID.getText() +"', nama_barang = '"+ txtNama.getText() +"', harga = '"+ txtHarga.getText() +"', stok = '"+ txtStok.getText() +"', kategori = '"+ cbmKategori.getSelectedItem() +"' where kode_barang = '"+ txtID.getText() +"'";
            Statement S = con.createStatement();
            S.execute(sql);
            JOptionPane.showMessageDialog(null, "Edit berhasil");
            new MainProduk().setVisible(false);
            new MainProduk().setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Edit gagal");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new MainRestock().setVisible(true);
        new MainProduk().setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new MainProduk().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmKategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private admin.siminimart.swing.PanelBorder panelBorder1;
    private admin.siminimart.swing.Table tabelProduk;
    private javax.swing.JTable tabelkode;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
